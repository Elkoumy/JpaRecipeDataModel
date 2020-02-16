package com.example.recipe_data_model.services;

import com.example.recipe_data_model.domain.Category;
import com.example.recipe_data_model.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CategoryServiceImpl implements CategoryService {
    CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Set<Category> getCategories() {
        Set<Category> categories= new HashSet<>();
       categoryRepository.findAll().iterator().forEachRemaining(categories::add);
       return categories;
    }

}
