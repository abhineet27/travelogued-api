package com.snapdeal.travelogued.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRIP_DETAILS")
public class TripDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = " TRIP_NAME", nullable = false)
    private String tripName;

    @Column(name = "TRIP_IMAGE", nullable = false)
    private String tripImage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getTripImage() {
        return tripImage;
    }

    public void setTripImage(String tripImage) {
        this.tripImage = tripImage;
    }

}
