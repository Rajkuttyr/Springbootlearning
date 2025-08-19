package com.example.Springbootlearning.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Todo {
    @Id
    @GeneratedValue
    
    Integer id;
    String title;
    String description;
    String status;

    
}
