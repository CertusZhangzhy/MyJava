package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hello")
public class ThymeleafHello {
    @RequestMapping(value = "/index")
    public String hello(Model model) {
        model.addAttribute("name", "Dear");
        return "hello";
    }
}