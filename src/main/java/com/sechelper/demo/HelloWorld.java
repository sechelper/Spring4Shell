package com.sechelper.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    private String hello(User user){
        return "hello " + user.getName();
    }
}
