package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.HashMap;

@Service
public class HelloService {
    public Map<String, String> sayHello(String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, " + name);
        return response;
    }
}
