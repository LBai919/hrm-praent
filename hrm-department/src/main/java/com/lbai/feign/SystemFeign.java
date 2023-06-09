package com.lbai.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author Lbai
 * @Date: 2023-06-07-11:44
 * @Description:
 */
@FeignClient(value = "system-server",path = "/system")
public interface SystemFeign {
    @PostMapping("/tt")
    public String uu();

}
