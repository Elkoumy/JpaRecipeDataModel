package com.example.recipe_data_model.services;

import com.example.recipe_data_model.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface RecipeService  {
    Set<Recipe> getRecipes();

    Recipe findById(Long valueOf);
}
