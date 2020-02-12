package com.example.recipe_data_model.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    long id;

    int prepTime;
    int cookTime;
    int servings;
    String source;
    String url;
    String directions;
    Difficulty difficulty;
    Byte[] image;

}
