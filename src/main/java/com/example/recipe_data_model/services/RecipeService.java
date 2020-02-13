package com.example.recipe_data_model.services;

import com.example.recipe_data_model.models.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService  {
    Set<Recipe> getRecipes();
}
