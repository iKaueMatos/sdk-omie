package com.omie.sdk.infra.exception;

public class ActivationCodeNotFoundException extends RuntimeException {
    public ActivationCodeNotFoundException(String message) {
        super(message);
    }
}
