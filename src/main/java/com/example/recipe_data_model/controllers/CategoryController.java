package com.example.recipe_data_model.controllers;

import com.example.recipe_data_model.services.CategoryService;
import com.example.recipe_data_model.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

    private final CategoryService categoryService ;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping("/category")
    public String showAll( Model model) {
        model.addAttribute("categories", categoryService.getCategories());
        return "category/list_categories";
    }

}
