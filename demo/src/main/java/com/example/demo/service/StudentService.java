package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getAllStudents() {
        return Arrays.asList(
            new Student("เมสซี่", 20, "messi@example.com"),
            new Student("โด้", 22, "ronaldo@example.com")
        );
    }
}
