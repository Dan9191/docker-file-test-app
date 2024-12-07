package com.example.docker_file_test_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Тестовая страница");
        return "index";
    }
}
