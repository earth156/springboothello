package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //งานการบ้านครับบรรทัดนี้
    @GetMapping("demo")
    public String hello(){
        // System.err.println("gggg");
        return "Hello Jirawat";

    }
    // @PostMapping("demo")
    // public String hello2(){
    //     System.err.println("gggg2222");
    //     return "Hello GGG222";

    // }
    // @RequestMapping(path =  "demo3", method = {
    //     RequestMethod.GET,
    //     RequestMethod.POST

    // })
    // public String demo3(){
    //     return "GET OR POST";
    // }

    // @GetMapping("demoParam")
    // public String demoParam(
    //     @RequestParam(name = "name", required = false) String inputName,
    //     @RequestParam(name = "age",required = false) String inputAge 
    // ){
    //     // System.err.printf("name = "+inputName," Age = "+inputAge)
    //     return String.format("Name = %s Age = %s", inputName,inputAge);
    // }    
    

}
