package com.example.recipe_data_model.services;

import com.example.recipe_data_model.models.Recipe;
import com.example.recipe_data_model.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;

    }
}
