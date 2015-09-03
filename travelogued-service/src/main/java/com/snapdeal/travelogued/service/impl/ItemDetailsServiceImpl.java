package com.snapdeal.travelogued.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snapdeal.travelogued.entity.ItemDetails;
import com.snapdeal.travelogued.entity.ItemImagesDetails;
import com.snapdeal.travelogued.model.ItemDetailsModel;
import com.snapdeal.travelogued.model.ItemsImagesModel;
import com.snapdeal.travelogued.repository.ItemImagesDetailsRepository;
import com.snapdeal.travelogued.repository.ItemsDetailsRepository;
import com.snapdeal.travelogued.service.ItemDetailsService;

@Service
public class ItemDetailsServiceImpl implements ItemDetailsService {

    @Autowired
    ItemsDetailsRepository itemDetailsRepo;

    @Autowired
    ItemImagesDetailsRepository imageDetailsRepo;

    @Override
    public ItemDetailsModel saveItemDetails(ItemDetailsModel itemDetailsModel) {
        ItemDetails itemDetails = new ItemDetails();

        itemDetails.setItemDescription(itemDetailsModel.getItemDescription());
        itemDetails.setItemName(itemDetailsModel.getItemName());
        itemDetails.setItemPrice(itemDetailsModel.getItemPrice());

        itemDetailsRepo.save(itemDetails);

        return itemDetailsModel;
    }

    @Override
    public ItemsImagesModel saveItemImageDetails(ItemsImagesModel itemImagesModel, int itemId) {
        ItemDetails itemDetails = itemDetailsRepo.findOne(itemId);

        ItemImagesDetails itemImagesDetails = new ItemImagesDetails();

        itemImagesDetails.setItemDetails(itemDetails);
        itemImagesDetails.setItemImage(itemImagesModel.getItemImage());

        imageDetailsRepo.save(itemImagesDetails);

        return itemImagesModel;
    }

}
