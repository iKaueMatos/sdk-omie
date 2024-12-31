package com.omie.sdk.modules.auth.application.dto.response;

import lombok.Builder;

@Builder
public record ActivationCodeResponse(
   String message
) {

}
