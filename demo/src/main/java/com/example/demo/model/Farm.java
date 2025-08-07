package com.example.demo.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Farm {
    private String id;
    private String name;
    private Owner owner;
}
