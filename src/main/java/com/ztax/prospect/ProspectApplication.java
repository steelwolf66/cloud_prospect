package com.ztax.prospect;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.ztax.feign"
        , "com.ztax.prospect"})
@EnableFeignClients(basePackages = {"com.ztax.feign"})
@MapperScan("com.ztax.prospect")
@EnableDiscoveryClient
public class ProspectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProspectApplication.class, args);
    }

}
