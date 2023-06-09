package com.lbai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Lbai
 * @Date: 2023-06-07-11:00
 * @Description:
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class HrmDepartmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrmDepartmentApplication.class,args);
    }
}
