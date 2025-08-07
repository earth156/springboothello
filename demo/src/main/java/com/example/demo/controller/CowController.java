package com.example.demo.controller;

import com.example.demo.model.Cow;
import com.example.demo.service.CowService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CowController {
    private final CowService cowService;

    public CowController(CowService cowService) {
        this.cowService = cowService;
    }

    @GetMapping("/getCowList/{farmId}")
    public List<Cow> getCowsByFarm(@PathVariable String farmId) {
        return cowService.getCowsByFarm(farmId);
    }

    @PostMapping("/cowSearch")
    public List<Cow> searchCow(@RequestBody Map<String, String> body) {
        String keyword = body.get("keyword");
        return cowService.searchCow(keyword);
    }
}
