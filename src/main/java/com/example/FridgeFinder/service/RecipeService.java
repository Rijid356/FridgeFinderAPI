package com.example.FridgeFinder.service;

import com.example.FridgeFinder.domain.Recipe;
import com.example.FridgeFinder.repository.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class RecipeService {
    private RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    //Find all possible recipes that can be made
    public List<Recipe> canMake() {
        List<Recipe> allRecipes = recipeRepository.findAll();
        for (Recipe recipe : allRecipes) {

            //TODO If all Items available, can make the recipe
            //if(recipe.getItemList()) {

            //}
        }

        return null;
    }

    public Recipe canMakeRoulette() {
        return null;
    }
}
