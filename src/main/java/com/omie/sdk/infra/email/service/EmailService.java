package com.omie.sdk.infra.email.service;

import com.omie.sdk.infra.exception.NullPointerException;
import com.omie.sdk.infra.email.strategy.EmailTemplateData;
import com.omie.sdk.infra.email.strategy.EmailTemplateStrategy;

import jakarta.mail.Authenticator;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.Properties;


@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender sender;

    @Value("${spring.mail.username}")
    private String senderEmail;

    @Value("${spring.mail.password}")
    private String senderPassword;

    @SneakyThrows
    public void sendEmail(String recipient, EmailTemplateStrategy strategy, Map<String, Object> data) {
        try {
            MimeMessage message = sender.createMimeMessage();
            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");

            Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(senderEmail, senderPassword);
                }
            });

            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
            EmailTemplateData templateData = strategy.generateEmailContent(data);

            helper.setSubject(strategy.getSubject());
            helper.setTo(recipient);
            helper.setFrom(senderEmail);
            helper.setText(templateData.getTemplateData().get("htmlContent").toString(), true);

            sender.send(message);
        } catch (AddressException e) {
            throw new RuntimeException("O endereço de e-mail fornecido é inválido: " + recipient, e);
        } catch (MessagingException e) {
            throw new RuntimeException("Erro ao enviar o e-mail: " + e.getMessage(), e);
        } catch (NullPointerException e) {
            throw new RuntimeException("Dados faltando para gerar o conteúdo do e-mail.", e);
        } catch (Exception e) {
            throw new RuntimeException("Ocorreu um erro inesperado ao enviar o e-mail.", e);
        }
    }
}
