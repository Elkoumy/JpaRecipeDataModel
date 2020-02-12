package com.example.recipe_data_model.models;

import javax.persistence.*;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Lob
    String notes;

    @OneToOne
    Recipe recipe;

}
