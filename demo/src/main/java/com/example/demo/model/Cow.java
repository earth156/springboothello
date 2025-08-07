package com.example.demo.model;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cow {
    private String id;
    private String cowName;
    private LocalDate birth;
    private String type;
    private Farm farm;
}
