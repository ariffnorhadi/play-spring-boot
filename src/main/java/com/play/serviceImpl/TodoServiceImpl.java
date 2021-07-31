package com.play.serviceImpl;

import com.play.model.Todo;
import com.play.repository.TodoRepository;
import com.play.service.TodoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {

  private final TodoRepository todoRepository;

  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public void saveTodo(Todo todo) {
    this.todoRepository.save(todo);
  }

  @Override
  public List<Todo> getAllTodos() {
    return this.todoRepository.findAll();
  }

  @Override
  public Optional<Todo> getOne(Long id) {
    return this.todoRepository.findById(id);
  }
}
