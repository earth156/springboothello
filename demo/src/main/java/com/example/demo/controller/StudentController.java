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

    @GetMapping("/search")
    public String searchStudent(@RequestParam String name) {
        return "Searching student with name: " + name;
    }

    @GetMapping("/email/{email}")
    public Student getStudentByEmail(@PathVariable String email) {
        return studentService.getByEmail(email);
    }

    @PostMapping
    public Student createStudent(@Valid @RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @Valid @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "ลบข้อมูลนักเรียน ID " + id + " สำเร็จ";
    }


    @GetMapping("/filter")
    public String filterStudent(@RequestParam String name, @RequestParam int age) {
        return "Filtering student with name=" + name + " and age=" + age;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }
}

