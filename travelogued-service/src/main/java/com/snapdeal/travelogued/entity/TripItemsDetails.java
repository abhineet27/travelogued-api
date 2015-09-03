package com.snapdeal.travelogued.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TRIP_ITEMS")
public class TripItemsDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private int id;

    @ManyToOne(optional = true)
    @JoinColumn(name = "TRIP_DETAILS_ID", referencedColumnName = "ID", nullable = true)
    private TripDetails tripDetails;

    @ManyToOne(optional = true)
    @JoinColumn(name = "ITEMS_INFO_ID", referencedColumnName = "ID", nullable = true)
    private ItemDetails itemDetails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TripDetails getTripDetails() {
        return tripDetails;
    }

    public void setTripDetails(TripDetails tripDetails) {
        this.tripDetails = tripDetails;
    }

    public ItemDetails getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(ItemDetails itemDetails) {
        this.itemDetails = itemDetails;
    }

}
