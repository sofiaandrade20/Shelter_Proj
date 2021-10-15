package com.example.backendshelter.Controller;

import com.example.backendshelter.Model.Pet;
import com.example.backendshelter.Services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController


public class AdoptionController {

    @Autowired
    private PetService petService;

    @GetMapping(value="pets")
    public List<Pet> Pets() {
        return petService.findAll();
    }

    @PostMapping(value="pet",consumes = "application/json")
    public Pet addPet(@RequestBody @Valid Pet pet){
        return petService.Save(pet);
    }
}
