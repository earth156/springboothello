package com.example.demo;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class formSubmit {

    @PostMapping("login")
    public String login(
        @ModelAttribute Usercredent inputFormUsercredent
    )
    {
        System.out.println("username : "+inputFormUsercredent.getUsername());
        System.out.println("password : "+inputFormUsercredent.getPassword());
        return String.format("%s : %s", inputFormUsercredent.getUsername(), inputFormUsercredent.getPassword());

    }
}
