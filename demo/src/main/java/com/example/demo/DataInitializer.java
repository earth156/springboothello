package com.example.demo;

import com.example.demo.model.Cow;
import com.example.demo.model.Farm;
import com.example.demo.model.Owner;
import com.example.demo.service.CowService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {

    private final CowService cowService;

    public DataInitializer(CowService cowService) {
        this.cowService = cowService;
    }

    @Override
    public void run(String... args) {
        Owner owner = new Owner("o1", "สมชาย", "ใจดี", "123 หมู่บ้านโคนม");
        Farm farm = new Farm("f1", "ฟาร์มโคนม A", owner);

        Cow cow1 = new Cow("c1", "โคน้อย", LocalDate.of(2023, 1, 10), "โคนม", farm);
        Cow cow2 = new Cow("c2", "โคดำ", LocalDate.of(2022, 5, 3), "โคเนื้อ", farm);

        cowService.addCow(cow1);
        cowService.addCow(cow2);
    }
}
