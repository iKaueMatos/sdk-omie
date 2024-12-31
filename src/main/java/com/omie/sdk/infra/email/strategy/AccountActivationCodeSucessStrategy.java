package com.omie.sdk.infra.email.strategy;

import java.util.Map;

import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import freemarker.template.Configuration;
import freemarker.template.Template;
import lombok.SneakyThrows;

public class AccountActivationCodeSucessStrategy implements EmailTemplateStrategy {
    private final Configuration configuration;

    public AccountActivationCodeSucessStrategy() {
        this.configuration = new Configuration(Configuration.VERSION_2_3_31);
        this.configuration.setClassForTemplateLoading(this.getClass(), "/templates/");
        this.configuration.setDefaultEncoding("UTF-8");
    }

    @Override
    public String getSubject() {
        return "Ativação concluida com sucesso - Sua conta";
    }

    @Override
    @SneakyThrows
    public EmailTemplateData generateEmailContent(Map<String, Object> data) {
        String templateType = "account-activate-success-email.html";

        Template template = configuration.getTemplate(templateType);
        String htmlContent = FreeMarkerTemplateUtils.processTemplateIntoString(template, data);

        Map<String, Object> templateData = Map.of("htmlContent", htmlContent);
        return new EmailTemplateData(templateType, templateData);
    }    
}
