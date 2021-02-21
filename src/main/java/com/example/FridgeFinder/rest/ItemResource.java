package com.example.FridgeFinder.rest;

import com.example.FridgeFinder.domain.Item;
import com.example.FridgeFinder.logging.RestLogger;
import com.example.FridgeFinder.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/item")
@Api(value = "item", description = "Item Service")
@Slf4j
public class ItemResource {

    @Autowired
    private ItemService itemService;

    @RestLogger
    @RequestMapping(
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @ApiOperation(value = "Blah", response = Item.class)
    public @ResponseBody
    List<Item> retrieveItem(@RequestParam(value = "id", required = true) String id) {
        return itemService.blah();
    }
}
