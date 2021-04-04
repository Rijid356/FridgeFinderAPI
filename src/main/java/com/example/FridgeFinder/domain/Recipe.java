package com.example.FridgeFinder.domain;

import com.example.FridgeFinder.enums.MeatType;
import com.example.FridgeFinder.enums.RecipeType;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "recipe")
@Data
public class Recipe extends MongoDomainObject {
    private String name;
    private List<Item> itemList;
    private List<String> steps;
    private String nutritionFacts;
    private String category;
    private RecipeType recipeType;
    private MeatType meatType;
    private Integer rating;
    //private String picture;
}
