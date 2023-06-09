package com.lbai.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author Lbai
 * @Date: 2023-06-07-11:42
 * @Description:
 */
@FeignClient(value = "system-server",path = "/system")
public interface SystemFeign {
}
