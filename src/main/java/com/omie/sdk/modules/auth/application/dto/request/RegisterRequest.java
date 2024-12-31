package com.omie.sdk.modules.auth.application.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
        @Email(message = "{email.invalid}") @NotNull(message = "{email.notnull}")
        String email,

        @Size(min = 8, max = 12, message = "{password.size}") @NotNull(message = "{password.notnull}")
        String password
) {

}
