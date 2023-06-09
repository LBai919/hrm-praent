package com.lbai.controller;

import com.lbai.feign.SystemFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Lbai
 * @Date: 2023-06-07-11:09
 * @Description:
 */
@RestController
@RequestMapping("/dept")
public class testController {


    @Autowired
    private SystemFeign systemFeign;


    @GetMapping("/vv")
    public String test() {
        return systemFeign.uu();
    }
}
