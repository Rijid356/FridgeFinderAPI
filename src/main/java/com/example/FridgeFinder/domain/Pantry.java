package com.example.FridgeFinder.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "pantry")
@Data
public class Pantry extends MongoDomainObject {
    private String description;
    private List<String> sections;
}
