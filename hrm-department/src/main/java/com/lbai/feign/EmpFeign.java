package com.lbai.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author Lbai
 * @Date: 2023-06-07-11:45
 * @Description:
 */
@FeignClient(value = "employee-server",path = "emp")
public interface EmpFeign {
}
