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
@Table(name = "BUNDLE_INFO")
public class BundleInfoDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "BUNDLE_NAME", nullable = true)
    private String bundleName;

    @Column(name = "BUNDLE_IMAGE", nullable = true)
    private String bundleImage;

    @ManyToOne(optional = true)
    @JoinColumn(name = "TRIP_DETAILS_ID", referencedColumnName = "ID", nullable = true)
    private TripDetails tripDetails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBundleName() {
        return bundleName;
    }

    public void setBundleName(String bundleName) {
        this.bundleName = bundleName;
    }

    public String getBundleImage() {
        return bundleImage;
    }

    public void setBundleImage(String bundleImage) {
        this.bundleImage = bundleImage;
    }

    public TripDetails getTripDetails() {
        return tripDetails;
    }

    public void setTripDetails(TripDetails tripDetails) {
        this.tripDetails = tripDetails;
    }

}
