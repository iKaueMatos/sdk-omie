package com.omie.sdk.infra.exception;

public class ActivationCodeExpiredException extends RuntimeException {
    public ActivationCodeExpiredException(String message) {
        super(message);
    }
}
