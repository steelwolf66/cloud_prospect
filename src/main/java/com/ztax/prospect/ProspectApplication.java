package com.ztax.prospect;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {
        "com.ztax.prospect"})
@MapperScan("com.ztax.prospect")
@EnableDiscoveryClient
public class ProspectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProspectApplication.class, args);
    }

}
