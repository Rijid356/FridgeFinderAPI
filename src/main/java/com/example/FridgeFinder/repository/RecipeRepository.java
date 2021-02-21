package com.example.FridgeFinder.repository;

import com.example.FridgeFinder.domain.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RecipeRepository extends MongoRepository<Recipe, String> {
    List<Recipe> findAll();
}
