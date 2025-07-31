package com.example.demo.model;

import jakarta.validation.constraints.*;

public class Student {

    @NotBlank(message = "กรุณากรอกชื่อ")
    private String name;

    @Min(value = 1, message = "อายุต้องมากกว่า 0 ปี")
    private int age;

    @NotBlank(message = "กรุณากรอกอีเมล")
    @Email(message = "รูปแบบอีเมลไม่ถูกต้อง")
    private String email;

    public Student() {}

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
