package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
