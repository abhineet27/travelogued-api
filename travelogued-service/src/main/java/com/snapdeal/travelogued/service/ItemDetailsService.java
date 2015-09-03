package com.snapdeal.travelogued.service;

import com.snapdeal.travelogued.model.ItemDetailsModel;
import com.snapdeal.travelogued.model.ItemsImagesModel;

public interface ItemDetailsService {

    public ItemDetailsModel saveItemDetails(ItemDetailsModel itemDetailsModel);
    
    public ItemsImagesModel saveItemImageDetails(ItemsImagesModel itemImagesModel,int itemId);

}
