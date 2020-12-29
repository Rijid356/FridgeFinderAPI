package com.example.FridgeFinder.domain;

import java.time.LocalDateTime;

import lombok.Data;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class MongoDomainObject {
    @Id
    String id;

    @Version
    Long version;

    @CreatedDate
    LocalDateTime createdDate;

    @CreatedBy
    LocalDateTime createdBy;

    @LastModifiedDate
    LocalDateTime modifiedDate;

    @LastModifiedBy
    String lastModifiedBy;
}
