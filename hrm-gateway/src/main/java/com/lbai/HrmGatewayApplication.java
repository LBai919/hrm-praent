package com.lbai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @Author Lbai
 * @Date: 2023-06-07-10:25
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HrmGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrmGatewayApplication.class,args);
    }
}
