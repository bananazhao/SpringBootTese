package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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