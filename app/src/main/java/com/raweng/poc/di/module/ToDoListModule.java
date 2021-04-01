package com.raweng.poc.di.module;

import com.raweng.poc.api.WebServices;
import com.raweng.poc.repository.todo.ToDoRepository;
import com.raweng.poc.repository.todo.ToDoRepositoryImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ToDoListModule {

    @Singleton
    @Provides
    ToDoRepository getToDoRepository(WebServices webServices){
        return new ToDoRepositoryImpl(webServices);
    }
}
