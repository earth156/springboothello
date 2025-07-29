package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonUserData {

    @GetMapping("/test-json2")
    public UserData simpleReturn() {
        UserData userData = new UserData(); // ✅ สร้างจาก UserData
        userData.setFirstname("firstname");
        userData.setLastname("lastname");

        return userData; // ✅ return object ที่สร้างไว้
    }

    @GetMapping("test-401")
    public ResponseEntity<UserData> returnStatas401(
            @RequestParam("input") String input) {

        if ("hacker".equals(input)) {
            return ResponseEntity.status(401).build();

        } else {
            UserData userData = new UserData(); // ✅ สร้างจาก UserData
            userData.setFirstname("firstname");
            userData.setLastname("lastname");

            return ResponseEntity.ok(userData);

        }
    }
}
