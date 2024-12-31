package com.omie.sdk.modules.auth.application.service;

public interface MessageSourceService {
    String generateMessage(String source);
    String generateMessage(String source, Object... params);
}
