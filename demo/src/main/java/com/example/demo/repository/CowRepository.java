package com.example.demo.repository;

import com.example.demo.model.Cow;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CowRepository {
    private final List<Cow> cows = new ArrayList<>();

    public void addCow(Cow cow) {
        cows.add(cow);
    }

    public List<Cow> getAll() {
        return cows;
    }

    public List<Cow> findByFarmId(String farmId) {
        return cows.stream()
                .filter(c -> c.getFarm().getId().equals(farmId))
                .collect(Collectors.toList());
    }

    public List<Cow> searchByName(String keyword) {
        return cows.stream()
                .filter(c -> c.getCowName().contains(keyword))
                .collect(Collectors.toList());
    }
}
