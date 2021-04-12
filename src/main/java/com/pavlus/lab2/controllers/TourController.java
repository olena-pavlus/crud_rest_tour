package com.pavlus.lab2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pavlus.lab2.models.Tour;
import com.pavlus.lab2.services.TourService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tour")
public class TourController {

    @Autowired
    private TourService tourService;

    @GetMapping
    public List<Tour> getAllTours() {
        return tourService.getAllTours();
    }

    @GetMapping
    public Optional<Tour> findTourByCode(@RequestParam int tourCode) {
        return tourService.findTourByCode(tourCode);
    }

    @PostMapping
    public Tour createTour(@RequestBody Tour tour) {
        return tourService.createTour(tour);
    }

    @PutMapping
    public Tour updateTour(@RequestBody Tour tour) {
        return tourService.updateTour(tour);
    }

    @DeleteMapping
    public void deleteTourByCode(@RequestParam int tourCode) {
        tourService.deleteTourByCode(tourCode);
    }


}

