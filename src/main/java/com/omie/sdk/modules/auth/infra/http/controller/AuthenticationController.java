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

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    private final TokenService tokenService;

    @PostMapping("/register")
    public ResponseEntity<ActivationCodeResponse> register(@Valid @RequestBody RegisterRequest request) {
        ActivationCodeResponse response = authenticationService.register(request);

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Registration-Status", "Successful");

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .headers(headers)
                .body(response);
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@Valid @RequestBody AuthenticationRequest request) {
        AuthenticationResponse response = authenticationService.authenticate(request);

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Authentication-Status", "Authenticated");
        headers.add("Content-Type", "application/json;charset=UTF-8");

        return ResponseEntity
                .status(HttpStatus.OK)
                .headers(headers)
                .body(response);
    }

    @GetMapping("/activate")
    public ResponseEntity<ActivationCodeResponse> activate(
            @RequestParam @Pattern(regexp = "^\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}$", message = "{activation.invalid}")
            String activationCode
    ) {
        try {
            ActivationCodeResponse response = authenticationService.activate(activationCode);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(response);
        } catch (ActivationCodeNotFoundException e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(ActivationCodeResponse.builder()
                            .message("Código de ativação não encontrado ou inválido.")
                            .build());
        } catch (ActivationCodeExpiredException e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(ActivationCodeResponse.builder()
                            .message("Código de ativação expirado.")
                            .build());
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ActivationCodeResponse.builder()
                            .message("Erro inesperado ao tentar ativar a conta.")
                            .build());
        }
    }

    @GetMapping("/resend-activation-email")
    public ResponseEntity<ActivationCodeResponse> resendActivationEmail(
            @RequestParam @Email(message = "{email.invalid}") String email
    ) {
        try {
            ActivationCodeResponse response = authenticationService.reactive(email);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(response);
        } catch (UsernameNotFoundException e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(ActivationCodeResponse.builder()
                            .message("Usuário não encontrado.")
                            .build());
        } catch (EmailSendingException e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ActivationCodeResponse.builder()
                            .message("Erro ao tentar reenviar o e-mail de ativação.")
                            .build());
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ActivationCodeResponse.builder()
                            .message("Erro inesperado ao tentar reenviar o e-mail de ativação.")
                            .build());
        }
    }


    @GetMapping("/validate/{jwt}")
    public ResponseEntity<String> isTokenValid(@PathVariable String jwt) {
        String response = tokenService.isTokenValid(jwt);

        if ("valid".equals(response)) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .header(HttpHeaders.CONTENT_TYPE, "application/json")
                    .body("Token válido.");
        }

        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .header(HttpHeaders.CONTENT_TYPE, "application/json")
                .body("Token inválido ou expirado.");
    }
}