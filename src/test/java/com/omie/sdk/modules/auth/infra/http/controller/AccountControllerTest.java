package com.omie.sdk.modules.auth.infra.http.controller;

import com.omie.sdk.modules.auth.application.dto.request.AccountResetPassword;
import com.omie.sdk.modules.auth.application.dto.response.ResendCodeResponse;
import com.omie.sdk.modules.auth.application.service.AccountService;
import com.omie.sdk.modules.auth.application.service.PasswordResetService;
import com.omie.sdk.modules.auth.infra.entity.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class AccountControllerTest {

    @Mock
    private PasswordResetService passwordResetService;

    @Mock
    private AccountService accountService;

    @InjectMocks
    private AccountController accountController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testResetPassword_Success() {
        AccountResetPassword accountResetPassword = new AccountResetPassword("validToken", "newPassword");

        Account account = mock(Account.class);
        when(passwordResetService.getAccountByToken("validToken")).thenReturn(account);
        when(accountService.updatePassword(account, "newPassword")).thenReturn(true);

        ResponseEntity<String> response = accountController.resetPassword(accountResetPassword);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Senha redefinida com sucesso.", response.getBody());
    }

    @Test
    public void testResetPassword_InvalidToken() {
        AccountResetPassword accountResetPassword = new AccountResetPassword("invalidToken", "newPassword");

        when(passwordResetService.getAccountByToken("invalidToken")).thenReturn(null);

        ResponseEntity<String> response = accountController.resetPassword(accountResetPassword);

        assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
        assertEquals("Token inválido ou expirado.", response.getBody());
    }

    @Test
    public void testGenerateResetToken_Success() {
        when(passwordResetService.generateResetToken("email@example.com")).thenReturn(true);

        ResponseEntity<ResendCodeResponse> response = accountController.generateResetToken("email@example.com");

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Token de redefinição de senha gerado com sucesso. Verifique seu email.", response.getBody().message());
    }

    @Test
    public void testGenerateResetToken_UserNotFound() {
        when(passwordResetService.generateResetToken("email@example.com")).thenReturn(false);

        ResponseEntity<ResendCodeResponse> response = accountController.generateResetToken("email@example.com");

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertEquals("Usuário não encontrado.", response.getBody().message());
    }
}
