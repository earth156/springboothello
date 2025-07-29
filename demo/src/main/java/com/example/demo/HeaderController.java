package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HeaderController {

    @GetMapping("/test-header")
    public String testHeader(
        @RequestHeader("Accept-Encoding") String headerFromRequest
        ){
        System.out.println(headerFromRequest);
        return null;
    }

}
