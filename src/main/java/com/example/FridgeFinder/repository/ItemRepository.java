package com.example.FridgeFinder.repository;

import com.example.FridgeFinder.domain.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ItemRepository extends MongoRepository<Item, String> {
    List<Item> findAll();
}
