package com.omie.sdk.modules.auth.application.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record AccountResetPassword(
        @Email(message = "{email.invalid}") @NotNull(message = "{email.notnull}")
        String token,

        @Size(min = 6, message = "{password.size}") @NotNull(message = "{password.notnull}")
        String newPassword
) {

}
