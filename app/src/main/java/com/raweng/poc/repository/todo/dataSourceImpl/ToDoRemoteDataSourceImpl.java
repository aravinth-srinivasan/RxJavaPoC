package com.raweng.poc.repository.todo.dataSourceImpl;

import com.raweng.poc.api.WebServices;
import com.raweng.poc.model.todo.ToDoResponse;
import com.raweng.poc.repository.todo.dataSource.ToDoRemoteDataSource;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Single;

public class ToDoRemoteDataSourceImpl implements ToDoRemoteDataSource{

    private final WebServices webServices;

    @Inject public ToDoRemoteDataSourceImpl(WebServices webServices) {
        this.webServices = webServices;
    }

    @Override
    public Single<ToDoResponse> getToDoResponse() {
        return webServices.getToDoList();
    }
}
