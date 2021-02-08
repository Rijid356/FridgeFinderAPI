package com.example.FridgeFinder.config;

import org.bson.json.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.convert.CustomConversions;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.MongoDbFactoryParser;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.FridgeFinder.repository")
public class MongoDatabaseConfig {

    @Bean
    @Autowired
    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory, CustomConversions conversions) {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory);
        MappingMongoConverter converter = (MappingMongoConverter) mongoTemplate.getConverter();
        converter.setCustomConversions(conversions);
        return mongoTemplate;
    }

    @Bean
    @Autowired
    public CustomConversions conversions(List<Converter> converters) {
        return new CustomConversions(CustomConversions.StoreConversions.NONE, converters);
    }
}
