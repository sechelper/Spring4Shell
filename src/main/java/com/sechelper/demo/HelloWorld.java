package com.sechelper.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    private String hello(User user){
        return "hello " + user.getName();
    }
}
