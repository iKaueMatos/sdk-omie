package com.omie.sdk.modules.auth.application.dto.response;

import lombok.Builder;

@Builder
public record ErrorResponse(
        Integer code,
        String message,
        Long timestamp
) {

}
