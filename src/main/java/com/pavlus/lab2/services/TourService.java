package com.pavlus.lab2.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pavlus.lab2.models.Tour;
import com.pavlus.lab2.repositories.TourRepository;

@Service
public class TourService implements ITour {

    TourRepository tourRepository;
    @Autowired
    public TourService(TourRepository tourRepo) {
        this.tourRepository = tourRepo;
    }

    @Override
    public List<Tour> getAllTours() {
        // TODO Auto-generated method stub
        return tourRepository.findAll();
    }

    @Override
    public Optional<Tour> findTourByCode(int tourCode) {
        // TODO Auto-generated method stub
        return tourRepository.findById(tourCode);
    }

    @Override
    public Tour createTour(Tour tour) {
        // TODO Auto-generated method stub
        return tourRepository.save(tour);
    }

    @Override
    public Tour updateTour(Tour tour) {
        // TODO Auto-generated method stub
        return tourRepository.save(tour);
    }

    @Override
    public void deleteTourByCode(int tourCode) {
        // TODO Auto-generated method stub
        tourRepository.deleteById(tourCode);
    }

}

