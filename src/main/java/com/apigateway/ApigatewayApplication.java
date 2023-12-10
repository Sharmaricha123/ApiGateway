package com.apigateway;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class ApigatewayApplication {

    private static final Logger logger = LoggerFactory.getLogger(ApigatewayApplication.class);

    public static void main(String[] args) {
        logger.info("Apigateway Started");
        SpringApplication.run(ApigatewayApplication.class, args);
        logger.info("Application Gateway end");
    }

}
