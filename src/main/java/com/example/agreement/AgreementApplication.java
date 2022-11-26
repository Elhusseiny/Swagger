package com.example.agreement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableSwagger2
public class AgreementApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AgreementApplication.class, args);
    }

    @Bean
    public Docket apiDocket() {

        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.agreement.controller"))
                .paths(PathSelectors.any())
                .build()
                .enableUrlTemplating(false)
                .forCodeGeneration(true);

        return docket;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
