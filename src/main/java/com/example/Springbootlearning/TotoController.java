package com.example.Springbootlearning;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springbootlearning.models.Todo;

@RestController
@RequestMapping("/todo")
public class TotoController {
    @Autowired
    private TodoService todoService;
    @GetMapping("/")
    public String toto() {
        return "Toto, World!";
    }
    @GetMapping("/get")
    public String getTodo(){
        return "Get Todo";
    }
    @GetMapping("/get/{id}")
    public String getTodoById(@PathVariable("id") String id) {
        return "Get Todo by id: " + id;
    }
    //RequestParam
    @GetMapping("/getByName")
    public String getBynaame(@RequestParam("name") String name) {
        return "Get Todo by name: " + name;
    }
    @GetMapping
    public String User(@RequestParam String name,String email) {
        return "User name: " + name + ", Email: " + email;
    }
    @PostMapping("/post")
    public ResponseEntity<Todo> CreateTodo(@RequestBody Todo body) {
        return new ResponseEntity<>(todoService.createTodo(body), HttpStatus.CREATED);
    }
    @PutMapping("path/{id}")
    public String updateTodo(@PathVariable("id") String id, @RequestBody String body) {
        return "Update Todo with id: " + id + " and body: " + body;
    }
   @GetMapping("/hello/{id}")
   ResponseEntity<Todo> display(@PathVariable("id") Integer id) {
       return new ResponseEntity<>(todoService.getTodoById(id), HttpStatus.OK);
   }
   @GetMapping("/helloall")
   ResponseEntity<List<Todo>>displayAll() {
       return new ResponseEntity<>(todoService.getAllTodos(), HttpStatus.OK);
   }
    
    
    

   
       
    
}
