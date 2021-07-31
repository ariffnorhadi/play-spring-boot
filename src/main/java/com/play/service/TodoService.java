package com.play.service;

import com.play.model.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {

  void saveTodo(Todo todo);

  List<Todo> getAllTodos();

  Optional<Todo> getOne(Long id);

}
