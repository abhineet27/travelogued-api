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
@Table(name = "BUNDLE_ITEM_INFO")
public class BundleItemsDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private int id;

    private String bundleImage;

    @ManyToOne(optional = true)
    @JoinColumn(name = "BUNDLE_INFO_ID", referencedColumnName = "ID", nullable = true)
    private BundleInfoDetails bundleInfoDetails;

    @ManyToOne(optional = true)
    @JoinColumn(name = "ITEMS_INFO_ID", referencedColumnName = "ID", nullable = true)
    private ItemDetails itemDetails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBundleImage() {
        return bundleImage;
    }

    public void setBundleImage(String bundleImage) {
        this.bundleImage = bundleImage;
    }

    public BundleInfoDetails getBundleInfoDetails() {
        return bundleInfoDetails;
    }

    public void setBundleInfoDetails(BundleInfoDetails bundleInfoDetails) {
        this.bundleInfoDetails = bundleInfoDetails;
    }

    public ItemDetails getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(ItemDetails itemDetails) {
        this.itemDetails = itemDetails;
    }

}
