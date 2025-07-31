package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // 1️⃣ ใช้ @RequestParam: /student/search?name=abc
    @GetMapping("/search")
    public String searchStudent(@RequestParam String name) {
        return "Searching student with name: " + name +" This is @RequestParam ";      
    }

    // 2️⃣ ใช้ @PathVariable: /student/10
    @GetMapping("/email/{email}")
    public String getStudentByEmail(@PathVariable String email) {
        return "Fetching student with email: " + email  +" This is @PathVariable ";
    }

    // 3️⃣ ใช้ @RequestBody และ @Valid: POST /student
    @PostMapping
    public String createStudent(@Valid @RequestBody Student student) {
        return "Created student: " + student.getName() + ", age: " + student.getAge() + ", email: " + student.getEmail()
        +" This is @RequestBody & @Valid";
    }

    // 4️⃣ ใช้ @RequestParam หลายตัว: /student/filter?name=abc&age=20
    @GetMapping("/filter")
    public String filterStudent(@RequestParam String name, @RequestParam int age) {
        return "Filtering student with name=" + name + " and age=" + age;
    }

    // 5️⃣ GET /student => คืน list ของ student (ใช้ของเดิม)
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }
}
