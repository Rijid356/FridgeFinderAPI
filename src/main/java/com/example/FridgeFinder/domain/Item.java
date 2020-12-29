package com.example.FridgeFinder.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "item")
@Data
public class Item extends MongoDomainObject {
    private String id;
    private String description;
}
