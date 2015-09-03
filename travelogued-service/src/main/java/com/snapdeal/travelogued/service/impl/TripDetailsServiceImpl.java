package com.snapdeal.travelogued.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snapdeal.travelogued.entity.ItemDetails;
import com.snapdeal.travelogued.entity.TripDetails;
import com.snapdeal.travelogued.model.TripDetailsModel;
import com.snapdeal.travelogued.repository.TripDetailsRepository;
import com.snapdeal.travelogued.service.TripDetailsService;

@Service
public class TripDetailsServiceImpl implements TripDetailsService {

    @Autowired
    TripDetailsRepository tripDetailsRepo;

    @Override
    public TripDetailsModel saveTripDetails(TripDetailsModel tripDetailsModel) {

        TripDetails tripDetails = new TripDetails();

        tripDetails.setTripImage(tripDetailsModel.getTripImage());
        tripDetails.setTripName(tripDetailsModel.getTripName());

        tripDetailsRepo.save(tripDetails);

        return tripDetailsModel;
    }

}
