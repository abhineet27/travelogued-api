package com.snapdeal.travelogued.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snapdeal.travelogued.entity.ItemDetails;

public interface ItemsDetailsRepository extends JpaRepository<ItemDetails, Integer>{

}
