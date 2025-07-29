package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Template {
    @GetMapping("/template")
    public String renderTemplate(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "index"; // ✅ ไม่ต้องใส่ .html
    }
}