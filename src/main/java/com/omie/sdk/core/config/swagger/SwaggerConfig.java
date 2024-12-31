package com.omie.sdk.core.config.swagger;

import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/api/**")
                .build();
    }

    @Bean
    public GroupedOpenApi privateApi() {
        return GroupedOpenApi.builder()
                .group("private")
                .pathsToMatch("/api/auth/validate/**", "/api/nfe/list", "/api/order-sales/list")
                .build();
    }

    @Bean
    public Info apiInfo() {
        return new Info()
                .title("API Omie-SDK")
                .description("The Omie API allows developers to integrate and automate business management processes, facilitating operations such as invoice issuance, inventory control, and financial management. With a robust architecture and modern technologies, this API offers an efficient and reliable user experience!\n" +
                        "\n")
                .version("v1");
    }
}

