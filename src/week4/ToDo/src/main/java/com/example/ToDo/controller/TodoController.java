package com.example.ToDo.controller;

import com.example.ToDo.entity.Todo;

import com.example.ToDo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TodoController {

    @Autowired
    TodoService todoService;

    @PostMapping("/olustur")
    @ResponseStatus(HttpStatus.CREATED)
    public Todo createTodo(@RequestBody Todo todo){
        return todoService.createTodo(todo);
    }

    @GetMapping("/getir")
    @ResponseStatus(HttpStatus.OK)
    public List<Todo> getAllTodos(){
        return todoService.todoListAll();
    }

    @GetMapping("/Todo/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Todo> getTodoById(@PathVariable (value = "id") Long id){
        return todoService.findTodoById(id);
    }

    @PutMapping("/Todo/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Todo> updateTodoById(@PathVariable (value = "id") Long id, @RequestBody Todo todo){
        return todoService.updateById(todo,id);
    }


    @DeleteMapping("/Todo/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Object> deleteTodoById(@PathVariable (value = "id") Long id){
        return todoService.deleteById(id);
    }


}