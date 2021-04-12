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

//    Optional<Tourist> findByEmail(String email);
//    Optional<Tourist> findByPhoneNumber(String email);

}
