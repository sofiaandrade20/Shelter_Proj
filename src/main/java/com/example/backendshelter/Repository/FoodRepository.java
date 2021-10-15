package com.example.backendshelter.Repository;

import com.example.backendshelter.Model.Food;
import com.example.backendshelter.Model.Pet;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Primary
@Repository

public interface FoodRepository extends JpaRepository<Food,Long> {
}
