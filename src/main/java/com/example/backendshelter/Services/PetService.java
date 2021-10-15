package com.example.backendshelter.Services;

import com.example.backendshelter.Model.Pet;
import com.example.backendshelter.Repository.FeedRepository;
import com.example.backendshelter.Repository.FoodRepository;
import com.example.backendshelter.Repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    public <S extends Pet > S Save(S newPet) {
        return petRepository.save(newPet);
    }
}
