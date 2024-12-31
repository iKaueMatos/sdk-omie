package com.omie.sdk.infra.exception;

public class InvalidActivationCodeException extends RuntimeException {
    public InvalidActivationCodeException(String message) {
        super(message);
    }
}
