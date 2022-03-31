package com.tasanah.springrest.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.tasanah.springrest.controller"))
        .paths(PathSelectors.any())
        .build()
        .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
            "Spring Boot RestAPI", 
            "Mini Project Spring Boot RestAPI and MySQL with Docker", 
            "v1.0", 
            "", 
            new Contact("Yoga Hilmi Tasanah", "https://linkedin.com/in/yogahilmi", "yogahilmi@gmail.com"), 
            "",
            "",
            Collections.emptyList()
        );
        return apiInfo;
    }
}
