package com.example.creditapplicationsystem.configuration

import io.swagger.v3.oas.models.OpenAPI
import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import io.swagger.v3.oas.models.info.Info

@Configuration
class Swagger3Config {
    @Bean
    fun publincApi(): GroupedOpenApi? {
        return GroupedOpenApi.builder()
            .group("springcreditapplicationsystem-public")
            .pathsToMatch("/api/customers/**", "/api/credits/**")
            .displayName("Credit Application System")
            .build()
    }

    @Bean
    fun springShopOpenAPI(): OpenAPI {
        return OpenAPI().info(
            Info().title("Credit Application System API")
                .description("Credit Application System")
                .version("v0.0.1")
        )
    }
}
