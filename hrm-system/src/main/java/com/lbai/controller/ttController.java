package com.lbai.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Lbai
 * @Date: 2023-06-07-11:55
 * @Description:
 */
@RestController
@RequestMapping("/system")
public class ttController {

    @PostMapping("/tt")
    public String uu() {
        return "hh";
    }
}
