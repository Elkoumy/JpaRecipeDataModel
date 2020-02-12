package com.example.recipe_data_model.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    long id;

    private int prepTime;
    private int cookTime;
    private int servings;
    private String source;
    private String url;
    private String directions;
    private Difficulty difficulty;
    @Lob
    private Byte[] image;

    @OneToOne
    private Notes notes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients;

//    @ManyToMany
    private Category categories;

}
