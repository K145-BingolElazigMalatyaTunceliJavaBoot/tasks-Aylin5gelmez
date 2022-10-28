package com.example.ToDo.service;

import com.example.ToDo.entity.Todo;
import com.example.ToDo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Todo createTodo(Todo task){
        return todoRepository.save(task);
    }

    public List<Todo> todoListAll(){
        return todoRepository.findAll();
    }

    public ResponseEntity<Todo> findTodoById(Long id){
        return todoRepository.findById(id)
                .map(todo -> ResponseEntity.ok().body(todo))
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Todo> updateById(Todo todo, Long id){
        return todoRepository.findById(id)
                .map(todoToUpdate ->{
                    todoToUpdate.setTitle(todo.getTitle());
                    todoToUpdate.setDescription(todo.getDescription());
                    todoToUpdate.setDeadLine(todo.getDeadLine());
                    Todo updated = todoRepository.save(todoToUpdate);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Object> deleteById(Long id){
        return todoRepository.findById(id)
                .map(todoToDelete ->{
                    todoRepository.deleteById(id);
                    return ResponseEntity.noContent().build();
                }).orElse(ResponseEntity.notFound().build());
    }

}