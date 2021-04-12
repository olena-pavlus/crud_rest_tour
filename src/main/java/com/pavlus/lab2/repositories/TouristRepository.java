package com.pavlus.lab2.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pavlus.lab2.models.Tourist;

@Repository
public interface TouristRepository extends JpaRepository<Tourist, Integer> {
    // Query method
//    Optional<Tourist> findByEmail(String email);
//    Optional<Tourist> findByPhoneNumber(String phoneNumber);
}
