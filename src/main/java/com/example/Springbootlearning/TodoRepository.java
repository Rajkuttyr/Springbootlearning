package com.example.Springbootlearning;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Springbootlearning.models.Todo;

//CRUD Repository
public interface TodoRepository extends MongoRepository<Todo, Integer> {
   
}
