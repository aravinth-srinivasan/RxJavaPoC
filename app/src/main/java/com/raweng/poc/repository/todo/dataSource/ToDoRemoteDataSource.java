package com.raweng.poc.repository.todo.dataSource;

import com.raweng.poc.model.todo.ToDoResponse;

import io.reactivex.rxjava3.core.Single;

public interface ToDoRemoteDataSource {
    Single<ToDoResponse> getToDoResponse();
}
