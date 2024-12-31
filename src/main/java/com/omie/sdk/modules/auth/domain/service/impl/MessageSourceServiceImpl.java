package com.omie.sdk.modules.auth.domain.service.impl;

import lombok.RequiredArgsConstructor;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.omie.sdk.modules.auth.application.service.MessageSourceService;

@Service
@RequiredArgsConstructor
public class MessageSourceServiceImpl implements MessageSourceService {
    private final Environment environment;

    public String generateMessage(String source) {
        return environment.getProperty(source);
    }

    public String generateMessage(String source, Object... params) {
        String property = environment.getProperty(source);
        if (property == null) {
            throw new RuntimeException("Property %s is missing".formatted(source));
        }
        return String.format(property, params);
    }
}
