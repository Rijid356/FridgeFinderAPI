package com.example.FridgeFinder.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "pantrySection")
@Data
public class PantrySection extends MongoDomainObject {
    String description;
    String label;
    List<Item> items;
}
