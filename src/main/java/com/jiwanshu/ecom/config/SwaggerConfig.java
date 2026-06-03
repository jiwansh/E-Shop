package com.jiwanshu.ecom.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        SecurityScheme bearerScheme = new SecurityScheme()
                .type(SecurityScheme.Type.HTTP)
                .scheme("bearer")
                .bearerFormat("JWT")
                .description("JWT Token");

        SecurityRequirement bearerRequirement = new SecurityRequirement()
                .addList("Bearer Authentication");

        return new OpenAPI()
                .info(new Info()
                        .title("Spring Boot eCommerce API")
                        .version("1.0")
                        .description("This is a SpringBoot Project E Commerce")
                        .license(new License().name("Apache 2.0").url("http://jkshop.com"))
                        .contact(new Contact()
                                .name("Jiwanshu")
                                .email("jiwanshu.dev@gmail.com"))
                )
                .externalDocs(new ExternalDocumentation().url("https://github.com/jiwanshu"))
                .components(new Components()
                        .addSecuritySchemes("Bearer Authentication",bearerScheme))
                .addSecurityItem(bearerRequirement);
    }
}
