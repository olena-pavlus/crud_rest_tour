package com.pavlus.lab2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pavlus.lab2.models.City;
import com.pavlus.lab2.services.CityService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @GetMapping
    public Optional<City> findCityByCode(@RequestParam int cityCode) {
        return cityService.findCityByCode(cityCode);
    }

    @PostMapping
    public City createCity(@RequestBody City city) {
        return cityService.createCity(city);
    }

    @PutMapping
    public City updateCity(@RequestBody City city) {
        return cityService.updateCity(city);
    }

    @DeleteMapping
    public void deleteCityByCode(@RequestParam int cityCode) {
        cityService.deleteCityByCode(cityCode);
    }


}
