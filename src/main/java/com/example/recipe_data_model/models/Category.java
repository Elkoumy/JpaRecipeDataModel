package com.example.recipe_data_model.models;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String departmentName;

//    @ManyToMany
    private Recipe recipe;

}
