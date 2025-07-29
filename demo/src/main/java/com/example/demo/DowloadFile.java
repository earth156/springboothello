package com.example.demo;

import java.io.ByteArrayInputStream;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DowloadFile {

    @GetMapping("/dowloadFile")
    public ResponseEntity<InputStreamResource> dowloadFile() {

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("DATA IN FILE".getBytes());
        InputStreamResource inputStreamResource = new InputStreamResource(byteArrayInputStream);

        return ResponseEntity.ok()
                .header("content-Disposition", "attachment; filename=\"data.txt\"")
                .contentType(MediaType.TEXT_PLAIN)
                .body(inputStreamResource);

    }
}
