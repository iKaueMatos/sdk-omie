package com.omie.sdk.modules.auth.application.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CreateAccountRequest(
        @Email(message = "{email.invalid}") @NotNull(message = "{email.not-null}")
        String email,

        @Size(min = 3, max = 50, message = "{username.size}") @NotNull(message = "{username.not-null}")
        String username,
        String password
) { }
