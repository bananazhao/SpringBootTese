package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

/**
 * @author JIAOJIAO
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(Locale locale, Model model) {
        return "login";
    }
}
