/*
package com.example.FridgeFinder.config;

import ch.qos.logback.core.net.server.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

import feign.Logger;

@Configuration
@EnableFeignClients(basePackages = {"com.examples.FridgeFinder.client"})
public class FeignClientConfig {

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
