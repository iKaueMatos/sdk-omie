package com.omie.sdk.modules.auth.infra.http.controller;

import com.omie.sdk.infra.exception.ActivationCodeExpiredException;
import com.omie.sdk.infra.exception.ActivationCodeNotFoundException;
import com.omie.sdk.infra.exception.EmailSendingException;
import com.omie.sdk.modules.auth.application.dto.request.AuthenticationRequest;
import com.omie.sdk.modules.auth.application.dto.request.RegisterRequest;
import com.omie.sdk.modules.auth.application.dto.response.ActivationCodeResponse;
import com.omie.sdk.modules.auth.application.dto.response.AuthenticationResponse;
import com.omie.sdk.modules.auth.application.service.AuthenticationService;
import com.omie.sdk.modules.auth.application.service.TokenService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class AuthenticationControllerTest {

    @Mock
    private AuthenticationService authenticationService;

    @Mock
    private TokenService tokenService;

    @InjectMocks
    private AuthenticationController authenticationController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testRegister_Success() {
        RegisterRequest request = new RegisterRequest("test@example.com", "password");
        ActivationCodeResponse response = new ActivationCodeResponse("Código de ativação enviado com sucesso.");

        when(authenticationService.register(request)).thenReturn(response);

        ResponseEntity<ActivationCodeResponse> result = authenticationController.register(request);

        assertEquals(HttpStatus.CREATED, result.getStatusCode());
        assertEquals("Código de ativação enviado com sucesso.", result.getBody().message());
        assertEquals("Successful", result.getHeaders().getFirst("X-Registration-Status"));
    }

    @Test
    public void testAuthenticate_Success() {
        AuthenticationRequest request = new AuthenticationRequest("test@example.com", "password");
        AuthenticationResponse response = new AuthenticationResponse("token");

        when(authenticationService.authenticate(request)).thenReturn(response);

        ResponseEntity<AuthenticationResponse> result = authenticationController.authenticate(request);

        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertEquals("token", result.getBody().token());
        assertEquals("Authenticated", result.getHeaders().getFirst("X-Authentication-Status"));
    }

    @Test
    public void testActivate_Success() {
        String activationCode = "12345678-1234-1234-1234-123456789012";
        ActivationCodeResponse response = new ActivationCodeResponse("Conta ativada com sucesso.");

        when(authenticationService.activate(activationCode)).thenReturn(response);

        ResponseEntity<ActivationCodeResponse> result = authenticationController.activate(activationCode);

        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertEquals("Conta ativada com sucesso.", result.getBody().message());
    }

    @Test
    public void testActivate_ActivationCodeNotFound() {
        String activationCode = "12345678-1234-1234-1234-123456789012";

        when(authenticationService.activate(activationCode)).thenThrow(new ActivationCodeNotFoundException("Código de ativação não encontrado ou inválido."));

        ResponseEntity<ActivationCodeResponse> result = authenticationController.activate(activationCode);

        assertEquals(HttpStatus.BAD_REQUEST, result.getStatusCode());
        assertEquals("Código de ativação não encontrado ou inválido.", result.getBody().message());
    }

    @Test
    public void testActivate_ActivationCodeExpired() {
        String activationCode = "12345678-1234-1234-1234-123456789012";

        when(authenticationService.activate(activationCode)).thenThrow(new ActivationCodeExpiredException("Código de ativação expirado."));

        ResponseEntity<ActivationCodeResponse> result = authenticationController.activate(activationCode);

        assertEquals(HttpStatus.BAD_REQUEST, result.getStatusCode());
        assertEquals("Código de ativação expirado.", result.getBody().message());
    }

    @Test
    public void testResendActivationEmail_Success() {
        String email = "test@example.com";
        ActivationCodeResponse response = new ActivationCodeResponse("E-mail de ativação reenviado com sucesso.");

        when(authenticationService.reactive(email)).thenReturn(response);

        ResponseEntity<ActivationCodeResponse> result = authenticationController.resendActivationEmail(email);

        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertEquals("E-mail de ativação reenviado com sucesso.", result.getBody().message());
    }

    @Test
    public void testResendActivationEmail_UserNotFound() {
        String email = "test@example.com";

        when(authenticationService.reactive(email)).thenThrow(new UsernameNotFoundException("Usuário não encontrado."));

        ResponseEntity<ActivationCodeResponse> result = authenticationController.resendActivationEmail(email);

        assertEquals(HttpStatus.BAD_REQUEST, result.getStatusCode());
        assertEquals("Usuário não encontrado.", result.getBody().message());
    }

    @Test
    public void testResendActivationEmail_EmailSendingException() {
        String email = "test@example.com";

        when(authenticationService.reactive(email)).thenThrow(new EmailSendingException("Erro ao tentar reenviar o e-mail de ativação."));

        ResponseEntity<ActivationCodeResponse> result = authenticationController.resendActivationEmail(email);

        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, result.getStatusCode());
        assertEquals("Erro ao tentar reenviar o e-mail de ativação.", result.getBody().message());
    }

    @Test
    public void testIsTokenValid_ValidToken() {
        String jwt = "validToken";

        when(tokenService.isTokenValid(jwt)).thenReturn("valid");

        ResponseEntity<String> result = authenticationController.isTokenValid(jwt);

        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertEquals("Token válido.", result.getBody());
    }

    @Test
    public void testIsTokenValid_InvalidToken() {
        String jwt = "invalidToken";

        when(tokenService.isTokenValid(jwt)).thenReturn("invalid");

        ResponseEntity<String> result = authenticationController.isTokenValid(jwt);

        assertEquals(HttpStatus.UNAUTHORIZED, result.getStatusCode());
        assertEquals("Token inválido ou expirado.", result.getBody());
    }
}
