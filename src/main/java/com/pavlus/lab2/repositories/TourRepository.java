package com.pavlus.lab2.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pavlus.lab2.models.Tour;

@Repository
public interface TourRepository extends JpaRepository<Tour, Integer> {
    // Query method

}

