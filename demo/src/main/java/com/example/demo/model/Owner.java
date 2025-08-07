package com.example.demo.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Owner {
    private String id;
    private String name;
    private String surName;
    private String address;
}
