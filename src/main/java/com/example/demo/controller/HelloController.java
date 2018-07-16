package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JIAOJIAO
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        return "HelloWorld";
    }

    @RequestMapping("getUser")
    public User getUser() {
        User user=new User();
        user.setUserName("小明");
        user.setPassWord("xxxx");
        return user;
    }
}