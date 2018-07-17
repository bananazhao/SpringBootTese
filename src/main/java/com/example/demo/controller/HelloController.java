package com.example.demo.controller;

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

}