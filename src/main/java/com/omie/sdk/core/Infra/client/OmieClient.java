package com.omie.sdk.core.Infra.client;

import com.omie.sdk.shared.request.DefaultParamStrategy;
import com.omie.sdk.shared.request.RequestBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class OmieClient {
    @Value("${omie.api.key}")
    private String appKey;

    @Value("${omie.api.secret}")
    private String appSecret;
    private RestTemplate restTemplate;
    private String base_url = "https://app.omie.com.br/api/v1";

    public String execute(String endpoint, String call, int page, int size, String importedApi, Map<String, Object> paramsvalue) {
        HttpHeaders headers = RequestBuilder.buildHeaders();
        Map<String, Object> params = RequestBuilder.buildParams(new DefaultParamStrategy(), page, size, importedApi, paramsvalue);
        Map<String, Object> body = RequestBuilder.buildRequestBody(call, appKey, appSecret, params);
        HttpEntity<Object> entity = new HttpEntity<>(body, headers);

        try {
            ResponseEntity<String> response = restTemplate.exchange(
                    base_url + endpoint,
                    HttpMethod.POST,
                    entity,
                    String.class
            );

            return response.getBody();
        } catch (HttpStatusCodeException ex) {
            throw new RuntimeException(
                    String.format(
                            "Erro ao chamar a API Omie. Status: %s, Corpo: %s",
                            ex.getStatusCode(),
                            ex.getResponseBodyAsString()
                    ),
                    ex
            );
        } catch (Exception ex) {
            throw new RuntimeException("Erro inesperado ao comunicar com a API Omie.", ex);
        }
    }
}