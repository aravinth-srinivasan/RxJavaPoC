package com.raweng.poc.repository.todo;

import com.raweng.poc.api.Resource;
import com.raweng.poc.model.todo.ToDoResponse;



public interface ToDoRepository {

    Resource<ToDoResponse> getToDoResponse();
}
