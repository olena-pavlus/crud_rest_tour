package com.pavlus.lab2.services;

import java.util.List;
import java.util.Optional;
import com.pavlus.lab2.models.Tour;

public interface ITour {

    List<Tour> getAllTours();
    Optional<Tour> findTourByCode(int tourCode);
    Tour createTour(Tour city);
    Tour updateTour(Tour city);
    void deleteTourByCode(int tourCode);
    Optional<Tour> findTourByName(String tourName);
    Optional<Tour> findTourByPrice(int price);

}
