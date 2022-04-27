package com.ztax.prospect.config;

import lombok.Data;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Data
@Configuration
public class RestTemplateConfig {

    private Long connectionTimeout = 1000L;

    private Long readTimeout = 1000L;

    @Bean //将RestTemplate装配为bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .requestFactory(HttpComponentsClientHttpRequestFactory.class)
                .setConnectTimeout(Duration.ofMillis(connectionTimeout))  //设置http的链接超时时间
                .setReadTimeout(Duration.ofMillis(readTimeout)) //设置http的响应超时时间
                .build();
    }
}