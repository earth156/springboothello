package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    // Get all people
    @GetMapping
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    // Filter age between xx and yy
    @GetMapping("/filter")
    public List<Person> filterByAge(
            @RequestParam int min,
            @RequestParam int max) {
        return personRepository.findByAgeBetween(min, max);
    }

    // For testing: Add sample person
    @PostMapping("/add")
    public Person addPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchByNameAndAgeRange(
            @RequestParam String name,
            @RequestParam int min,
            @RequestParam int max) {

        List<Person> results = personRepository
                .findByNameContainingIgnoreCaseAndAgeBetweenOrderByAgeDesc(name, min, max);

        if (results.isEmpty()) {
            // สร้าง Map เพื่อส่ง JSON message
            Map<String, String> response = new HashMap<>();
            response.put("message", "ไม่พบข้อมูลที่ตรงกับเงื่อนไข");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }

        return ResponseEntity.ok(results);
    }

}
