package com.example.FridgeFinder.domain;

import com.example.FridgeFinder.enums.RecipeType;
import lombok.Data;

import java.util.List;

@Data
public class Recipe {
    private String name;
    private List<Item> itemList;
    private List<String> steps;
    private String nutritionFacts;
    private String category;
    private RecipeType recipeType;
}
