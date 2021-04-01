package com.raweng.poc.api;

import com.raweng.poc.model.todo.ToDoResponse;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;


public interface WebServices {

    @GET("todos")
    Single<ToDoResponse> getToDoList();
}
