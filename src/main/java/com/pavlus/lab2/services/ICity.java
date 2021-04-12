package com.pavlus.lab2.services;

import java.util.List;
import java.util.Optional;
import com.pavlus.lab2.models.City;

public interface ICity {

    List<City> getAllCities();
    Optional<City> findCityByCode(int cityCode);
    City createCity(City city);
    City updateCity(City city);
    void deleteCityByCode(int cityCode);

}
