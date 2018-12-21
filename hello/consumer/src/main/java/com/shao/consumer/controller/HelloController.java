package com.shao.consumer.controller;

import com.shao.consumer.exception.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        throw new BusinessException("99","系统异常");
    }
}
