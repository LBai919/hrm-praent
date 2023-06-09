package com.lbai.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author Lbai
 * @Date: 2023-06-07-11:43
 * @Description:
 */
@FeignClient(value = "department-server",path = "/dept")
public interface DeptFeign {
}
