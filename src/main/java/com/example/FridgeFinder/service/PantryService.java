package com.example.FridgeFinder.service;

import com.example.FridgeFinder.domain.Pantry;
import com.example.FridgeFinder.repository.PantryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PantryService {
    private PantryRepository pantryRepository;

    @Autowired
    public PantryService(PantryRepository pantryRepository) {
        this.pantryRepository = pantryRepository;
    }

    public List<Pantry> blah() {
        return this.pantryRepository.findAll();
    }
}
