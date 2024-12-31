package com.omie.sdk.infra.email.strategy;

import freemarker.template.Configuration;
import freemarker.template.Template;
import lombok.SneakyThrows;

import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.util.Map;

@Service
public class AccountActivationCodeEmailTemplateStrategy implements EmailTemplateStrategy {
    private final Configuration configuration;

    public AccountActivationCodeEmailTemplateStrategy() {
        this.configuration = new Configuration(Configuration.VERSION_2_3_31);
        this.configuration.setClassForTemplateLoading(this.getClass(), "/templates/");
        this.configuration.setDefaultEncoding("UTF-8");
    }

    @Override
    public String getSubject() {
        return "Código de Ativação - Sua Conta";
    }

    @Override
    @SneakyThrows
    public EmailTemplateData generateEmailContent(Map<String, Object> data) {
        String templateType = "confirm-activation-email.html";

        Template template = configuration.getTemplate(templateType);
        String htmlContent = FreeMarkerTemplateUtils.processTemplateIntoString(template, data);

        Map<String, Object> templateData = Map.of("htmlContent", htmlContent);
        return new EmailTemplateData(templateType, templateData);
    }
}