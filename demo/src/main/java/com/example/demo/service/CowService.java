package com.example.demo.service;

import com.example.demo.model.Cow;
import com.example.demo.repository.CowRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CowService {
    private final CowRepository cowRepository;

    public CowService(CowRepository cowRepository) {
        this.cowRepository = cowRepository;
    }

    public List<Cow> getCowsByFarm(String farmId) {
        return cowRepository.findByFarmId(farmId);
    }

    public List<Cow> searchCow(String keyword) {
        return cowRepository.searchByName(keyword);
    }

    public void addCow(Cow cow) {
        cowRepository.addCow(cow);
    }

    public List<Cow> getAllCows() {
        return cowRepository.getAll();
    }
}
