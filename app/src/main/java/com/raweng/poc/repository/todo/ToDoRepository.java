package com.raweng.poc.repository.todo;

import com.raweng.poc.model.todo.ToDoResponse;
import io.reactivex.rxjava3.core.Single;


public interface ToDoRepository {

    Single<ToDoResponse> getToDoResponse();
}
