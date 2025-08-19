package com.example.Springbootlearning;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Springbootlearning.models.Todo;
//Bean
@Service
public class TodoService {
    @Autowired
    
    private TodoRepository todoRepository;
    //Method to get all todos
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }
    public Todo getTodoById(Integer id) {
        return todoRepository.findById(id).orElse(null);
    }
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }
        
    
   
   
    
}
