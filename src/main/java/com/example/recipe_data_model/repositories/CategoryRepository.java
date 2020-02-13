package com.example.recipe_data_model.repositories;

import com.example.recipe_data_model.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String american);
}
