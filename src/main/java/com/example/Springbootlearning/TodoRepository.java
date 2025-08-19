package com.example.Springbootlearning;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springbootlearning.models.Todo;

//CRUD Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
   
}
