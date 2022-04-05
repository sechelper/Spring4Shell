package com.sechelper.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    private String hello(User user){
        if(user.getName() == null){
			return "hello world";
		}
        return "hello " + user.getName();
    }
}
