package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HomeController {

    @Autowired
    private HelloService helloService;

    @PostMapping("/hello")
    public Map<String, String> sayHello(@RequestBody Map<String, String> request) {
        String name = request.get("name");
        return helloService.sayHello(name);
    }
}
