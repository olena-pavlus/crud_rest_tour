package com.pavlus.lab2.services;

import java.util.List;
import java.util.Optional;
import com.pavlus.lab2.models.Tourist;

public interface ITourist {

    List<Tourist> getAllTourists();
    Optional<Tourist> findTouristById(int touristID);
    Tourist createTourist(Tourist tourist);
    Tourist updateTourist(Tourist tourist);
    void deleteTouristById(int touristID);
    Optional<Tourist> findTouristByLastName(String lastName);
    Optional<Tourist> findTouristByEmail(String email);
    Optional<Tourist> findTouristByPhoneNumber(String email);
}
