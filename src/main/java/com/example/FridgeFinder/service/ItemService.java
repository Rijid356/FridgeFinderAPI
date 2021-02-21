package com.example.FridgeFinder.service;

import com.example.FridgeFinder.domain.Item;
import com.example.FridgeFinder.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ItemService {
    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> blah() {
        return this.itemRepository.findAll();
    }
}
