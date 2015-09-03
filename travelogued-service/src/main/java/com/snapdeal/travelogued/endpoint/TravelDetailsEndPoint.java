package com.snapdeal.travelogued.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.snapdeal.travelogued.model.TripDetailsModel;
import com.snapdeal.travelogued.service.TripDetailsService;

@Controller
public class TravelDetailsEndPoint {

    @Autowired
    TripDetailsService tripDetailsService;

    @RequestMapping(value = "v1/tripdetails", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
    public @ResponseBody TripDetailsModel saveTripDetails(@RequestBody TripDetailsModel tripDetailsModel) {

        return tripDetailsService.saveTripDetails(tripDetailsModel);
    }
}
