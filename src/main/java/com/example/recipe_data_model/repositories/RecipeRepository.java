package com.example.recipe_data_model.repositories;

import com.example.recipe_data_model.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
