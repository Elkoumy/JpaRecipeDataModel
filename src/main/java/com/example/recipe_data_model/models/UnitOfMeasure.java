package com.example.recipe_data_model.models;

import javax.persistence.*;

@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String uom;

    @OneToOne
    Ingredient ingredient;
}
