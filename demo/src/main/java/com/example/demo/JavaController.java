package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // สำคัญมาก! ต้องใส่
public class JavaController {

    @PostMapping("/login-json") // มี slash หรือไม่ก็ได้ แต่ควรใช้แบบนี้
    public String loginJson(@RequestBody Usercredent inputFormUsercredent) {
        return String.format("Username: %s, Password: %s",
                inputFormUsercredent.getUsername(),
                inputFormUsercredent.getPassword());
    }
}
