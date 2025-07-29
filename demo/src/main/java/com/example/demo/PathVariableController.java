package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @GetMapping("/posts/{id}/com/{comId}")
    public String getPostId(
        @PathVariable("id") String postId,
        @PathVariable("comId") String inputcomId
        ){
            
        return String.format("id: %s comId : %s",postId,inputcomId);
    }
}
