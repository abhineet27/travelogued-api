package com.snapdeal.travelogued.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snapdeal.travelogued.entity.TripDetails;

public interface TripDetailsRepository extends JpaRepository<TripDetails, Integer> {
    
}
