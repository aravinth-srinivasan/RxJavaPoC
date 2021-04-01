package com.raweng.poc.viewModel;

import androidx.lifecycle.ViewModel;

import com.raweng.poc.model.todo.ToDoResponse;
import com.raweng.poc.repository.todo.ToDoRepository;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Single;

public class ToDoListViewModel extends ViewModel {

    private final ToDoRepository toDoRepository;

    @Inject ToDoListViewModel(ToDoRepository toDoRepository){
        this.toDoRepository=toDoRepository;
    }


   public Single<ToDoResponse> getToDoList(){
        return toDoRepository.getToDoResponse();
    }


}
