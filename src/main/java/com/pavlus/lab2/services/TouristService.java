package com.pavlus.lab2.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pavlus.lab2.models.Tourist;
import com.pavlus.lab2.repositories.TouristRepository;

@Service
public class TouristService implements ITourist {

    TouristRepository touristRepository;
    @Autowired
    public TouristService(TouristRepository touristrepo) {
        this.touristRepository = touristrepo;
    }

    @Override
    public List<Tourist> getAllTourists() {
        // TODO Auto-generated method stub
        return touristRepository.findAll();
    }

    @Override
    public Optional<Tourist> findTouristById(int touristID) {
        // TODO Auto-generated method stub
        return touristRepository.findById(touristID);
    }

    @Override
    public Tourist createTourist(Tourist tourist) {
        // TODO Auto-generated method stub
        return touristRepository.save(tourist);
    }

    @Override
    public Tourist updateTourist(Tourist tourist) {
        // TODO Auto-generated method stub
        return touristRepository.save(tourist);
    }

    @Override
    public void deleteTouristById(int touristID) {
        // TODO Auto-generated method stub
        touristRepository.deleteById(touristID);
    }

//    @Override
//    public Optional<Tourist> findByEmail(String email) {
//        // TODO Auto-generated method stub
//        return touristRepository.findByEmail(email);
//    }
//
//    @Override
//    public Optional<Tourist> findByPhoneNumber(String phoneNumber) {
//        // TODO Auto-generated method stub
//        return touristRepository.findByPhoneNumber(phoneNumber);
//    }

}

