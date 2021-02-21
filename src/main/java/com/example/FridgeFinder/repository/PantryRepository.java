package com.example.FridgeFinder.repository;

import com.example.FridgeFinder.domain.Pantry;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PantryRepository extends MongoRepository<Pantry, String> {
    List<Pantry> findAll();
}
