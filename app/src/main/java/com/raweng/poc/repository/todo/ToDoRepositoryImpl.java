package com.raweng.poc.repository.todo;
import com.raweng.poc.api.WebServices;
import com.raweng.poc.model.todo.ToDoResponse;
import javax.inject.Inject;
import io.reactivex.rxjava3.core.Single;


public class ToDoRepositoryImpl implements ToDoRepository{

    private final WebServices webServices;

    @Inject public ToDoRepositoryImpl(WebServices webServices){
        this.webServices=webServices;
    }

    @Override
    public Single<ToDoResponse> getToDoResponse() {
       return webServices.getToDoList();
    }
}
