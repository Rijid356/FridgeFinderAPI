package com.example.FridgeFinder.domain;

import com.example.FridgeFinder.enums.ItemType;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "item")
@Data
public class Item extends MongoDomainObject {
    private String description;
    private ItemType type;
    private Integer percentageLeft;
    private Date expirationDate;
}
