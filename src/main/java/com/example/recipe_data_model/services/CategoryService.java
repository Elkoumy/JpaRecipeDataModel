package com.example.recipe_data_model.services;

import com.example.recipe_data_model.domain.Category;

import java.util.Set;

public interface CategoryService {
    Set<Category> getCategories();

}
