/*
package com.example.FridgeFinder.config;

import ch.qos.logback.core.net.server.Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public class ExampleFeignClientConfig {
    @Value("APIUsername")
    String apiUsername;
    @Value("APIPassword")
    String apiPassword;

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor(apiUsername, apiPassword);
    }

    @Bean
    public Client feignClient(SSLContext sslContext) {
        SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
        return new Client.Default(sslSocketFactory, null);
    }

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
*/
