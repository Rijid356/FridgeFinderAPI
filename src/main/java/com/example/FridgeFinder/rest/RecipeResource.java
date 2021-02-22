package com.example.FridgeFinder.rest;

import com.example.FridgeFinder.domain.Item;
import com.example.FridgeFinder.domain.Recipe;
import com.example.FridgeFinder.logging.RestLogger;
import com.example.FridgeFinder.service.RecipeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/recipe")
@Api(value = "recipe", description = "Recipe Service")
@Slf4j
public class RecipeResource {
    @Autowired
    private RecipeService recipeService;

    @RestLogger
    @RequestMapping(
            path = "/canMake",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @ApiOperation(value = "What recipes can I make?", response = Item.class)
    public @ResponseBody
    List<Recipe> canMake() {
        return recipeService.canMake();
    }

    @RestLogger
    @RequestMapping(
            path = "/canMake/roulette",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @ApiOperation(value = "What recipes can I make?", response = Item.class)
    public @ResponseBody
    Recipe canMakeRoulette(@RequestParam(value = "id", required = true) String id) {
        return recipeService.canMakeRoulette();
    }
}
