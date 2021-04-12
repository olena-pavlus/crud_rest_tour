package com.pavlus.lab2.repositories;

import java.util.Optional;

import com.pavlus.lab2.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pavlus.lab2.models.Tour;

@Repository
public interface TourRepository extends JpaRepository<Tour, Integer> {
    // Query method
    Optional<Tour> findTourByName(String tourName);
    Optional<Tour> findTourByPrice(int price);
}

