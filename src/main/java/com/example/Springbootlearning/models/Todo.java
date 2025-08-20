package com.example.Springbootlearning.models;

import org.springframework.data.mongodb.core.mapping.Document;



import jakarta.persistence.Id;
import lombok.Data;

@Data
@Document(collection = "todos")

public class Todo {
    @Id
    
    
    Integer id;
    String title;
    String description;
    String status;

    
}
