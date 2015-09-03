package com.snapdeal.travelogued.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.snapdeal.travelogued.model.ItemDetailsModel;
import com.snapdeal.travelogued.model.ItemsImagesModel;
import com.snapdeal.travelogued.service.ItemDetailsService;

@Controller
public class ItemDetailsEndPoint {

    @Autowired
    ItemDetailsService itemDetailsService;

    @RequestMapping(value = "v1/itemdetails", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
    public @ResponseBody ItemDetailsModel saveTripDetails(@RequestBody ItemDetailsModel itemDetailsModel) {

        return itemDetailsService.saveItemDetails(itemDetailsModel);
    }

    @RequestMapping(value = "v1/itemdetails/{itemId}", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
    public @ResponseBody ItemsImagesModel saveTripDetails(@PathVariable(value = "itemId") int itemId,
            @RequestBody ItemsImagesModel itemImagesModel) {

        return itemDetailsService.saveItemImageDetails(itemImagesModel,itemId);
    }
}
