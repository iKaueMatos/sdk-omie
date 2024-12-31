package com.omie.sdk.infra.email.strategy;

import java.util.Map;

public interface EmailTemplateStrategy {
    EmailTemplateData generateEmailContent(Map<String, Object> data);
    String getSubject();
}
