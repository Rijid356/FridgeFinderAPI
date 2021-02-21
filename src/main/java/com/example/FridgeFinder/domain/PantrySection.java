package com.example.FridgeFinder.domain;

import lombok.Data;

import java.util.List;

@Data
public class PantrySection {
    String description;
    String label;
    List<Item> items;
}
