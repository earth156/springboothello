package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    // ตัวอย่าง user คงที่
    private final String DEMO_USERNAME = "user";
    private final String DEMO_PASSWORD = "1234";

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        if (DEMO_USERNAME.equals(user.getUsername()) && DEMO_PASSWORD.equals(user.getPassword())) {
            String token = jwtUtil.generateToken(user.getUsername());
            return ResponseEntity.ok(new AuthResponse(token));
        }
        return ResponseEntity.status(401).body("Invalid username or password");
    }

    // Response wrapper
    static class AuthResponse {
        private String token;

        public AuthResponse(String token) {
            this.token = token;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
