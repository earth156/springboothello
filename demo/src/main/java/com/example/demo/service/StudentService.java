package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student createStudent(Student student) {
        return repository.save(student);
    }

    public Student updateStudent(Long id, Student updated) {
        return repository.findById(id).map(student -> {
            student.setName(updated.getName());
            student.setEmail(updated.getEmail());
            student.setAge(updated.getAge());
            return repository.save(student);
        }).orElseThrow(() -> new RuntimeException("ไม่พบ student id = " + id));
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }

    public Student getByEmail(String email) {
        return repository.findByEmail(email);
    }
}
