package com.omie.sdk.infra.error.response;

import lombok.Builder;

@Builder
public record ErrorResponse(
        Integer code,
        String message,
        Long timestamp
) {

}