package com.omie.sdk.modules.auth.infra.http.controller;

import com.omie.sdk.modules.auth.application.dto.request.AccountResetPassword;
import com.omie.sdk.modules.auth.application.dto.response.ResendCodeResponse;
import com.omie.sdk.modules.auth.application.service.AccountService;
import com.omie.sdk.modules.auth.application.service.PasswordResetService;
import com.omie.sdk.modules.auth.infra.entity.Account;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth/account")
public class AccountController {
    private final PasswordResetService passwordResetService;
    private final AccountService accountService;

    @PostMapping("/reset-password")
    public ResponseEntity<String> resetPassword(@RequestBody AccountResetPassword accountResetPassword) {
        String token = accountResetPassword.token();
        String newPassword = accountResetPassword.newPassword();

        if (token == null || newPassword == null) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .header(HttpHeaders.CONTENT_TYPE, "application/json")
                    .body("token e nova senha são obrigatórios.");
        }

        Account account = passwordResetService.getAccountByToken(token);
        if (account == null) {
            return ResponseEntity
                    .status(HttpStatus.UNAUTHORIZED)
                    .header(HttpHeaders.CONTENT_TYPE, "application/json")
                    .body("Token inválido ou expirado.");
        }

        boolean isPasswordUpdated = accountService.updatePassword(account, newPassword);
        if (!isPasswordUpdated) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .header(HttpHeaders.CONTENT_TYPE, "application/json")
                    .body("Erro ao atualizar a senha. Tente novamente mais tarde.");
        }

        return ResponseEntity
                .status(HttpStatus.OK)
                .header(HttpHeaders.CONTENT_TYPE, "application/json")
                .body("Senha redefinida com sucesso.");
    }

    @PostMapping("/generate-token")
    public ResponseEntity<ResendCodeResponse> generateResetToken(@RequestParam("email") String email) {
        if (email == null || email.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .header(HttpHeaders.CONTENT_TYPE, "application/json")
                    .body(ResendCodeResponse.builder().message("O email é obrigatório.").build());
        }

        boolean isTokenGenerated = passwordResetService.generateResetToken(email);
        if (!isTokenGenerated) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .header(HttpHeaders.CONTENT_TYPE, "application/json")
                    .body(ResendCodeResponse.builder().message("Usuário não encontrado.").build());
        }

        return ResponseEntity
                .status(HttpStatus.OK)
                .header(HttpHeaders.CONTENT_TYPE, "application/json")
                .body(ResendCodeResponse.builder().message("Token de redefinição de senha gerado com sucesso. Verifique seu email.").build());
    }
}
