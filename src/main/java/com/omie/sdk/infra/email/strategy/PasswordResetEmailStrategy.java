package com.omie.sdk.infra.email.strategy;

import freemarker.template.Configuration;
import freemarker.template.Template;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class PasswordResetEmailStrategy implements EmailTemplateStrategy {
    private final Configuration configuration;

    public PasswordResetEmailStrategy() {
        this.configuration = new Configuration(Configuration.VERSION_2_3_31);
        this.configuration.setClassForTemplateLoading(this.getClass(), "/templates/");
        this.configuration.setDefaultEncoding("UTF-8");
    }

    @Override
    public String getSubject() {
        return "Redefinição de Senha";
    }

    @Override
    public EmailTemplateData generateEmailContent(Map<String, Object> data) {
        try {
            String templateType = "reset-password-email.html";
            Template template = configuration.getTemplate(templateType);
            String htmlContent = FreeMarkerTemplateUtils.processTemplateIntoString(template, data);

            Map<String, Object> templateData = Map.of("htmlContent", htmlContent);
            return new EmailTemplateData(templateType, templateData);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao gerar e-mail de redefinição de senha", e);
        }
    }
}
