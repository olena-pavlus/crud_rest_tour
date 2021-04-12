package com.pavlus.lab2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pavlus.lab2.models.Tourist;
import com.pavlus.lab2.services.TouristService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tourist")
public class TouristController {

    @Autowired
    private TouristService touristService;

    @GetMapping
    public List<Tourist> getAllTourists() {
        return touristService.getAllTourists();
    }

    @GetMapping
    public Optional<Tourist> findTouristById(@RequestParam int touristID) {
        return touristService.findTouristById(touristID);
    }

    @PostMapping
    public Tourist createTourist(@RequestBody Tourist tourist) {
        return touristService.createTourist(tourist);
    }

    @PutMapping
    public Tourist updateTourist(@RequestBody Tourist tourist) {
        return touristService.updateTourist(tourist);
    }

    @DeleteMapping
    public void deleteTouristById(@RequestParam int touristID) {
        touristService.deleteTouristById(touristID);
    }


}

