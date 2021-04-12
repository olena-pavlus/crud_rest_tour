package com.pavlus.lab2.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pavlus.lab2.models.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    // Query method
    Optional<City> findCityByCountry(String countryName);
}

