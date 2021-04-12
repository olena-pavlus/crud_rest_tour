package com.pavlus.lab2.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pavlus.lab2.models.City;
import com.pavlus.lab2.repositories.CityRepository;

@Service
public class CityService implements ICity {

    CityRepository cityRepository;
    @Autowired
    public CityService(CityRepository cityRepo) {
        this.cityRepository = cityRepo;
    }

    @Override
    public List<City> getAllCities() {
        // TODO Auto-generated method stub
        return cityRepository.findAll();
    }

    @Override
    public Optional<City> findCityByCode(int cityCode) {
        // TODO Auto-generated method stub
        return cityRepository.findById(cityCode);
    }

    @Override
    public City createCity(City city) {
        // TODO Auto-generated method stub
        return cityRepository.save(city);
    }

    @Override
    public City updateCity(City city) {
        // TODO Auto-generated method stub
        return cityRepository.save(city);
    }

    @Override
    public void deleteCityByCode(int cityCode) {
        // TODO Auto-generated method stub
        cityRepository.deleteById(cityCode);
    }

    @Override
    public Optional<City> findCityByCountry(String countryName) {
        // TODO Auto-generated method stub
        return cityRepository.findCityByCountry(countryName);
    }

}

