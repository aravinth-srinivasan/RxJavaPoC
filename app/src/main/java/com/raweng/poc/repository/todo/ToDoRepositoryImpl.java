package com.raweng.poc.repository.todo;

import com.raweng.poc.api.Resource;
import com.raweng.poc.model.todo.ToDoResponse;
import com.raweng.poc.repository.todo.dataSource.ToDoRemoteDataSource;
import javax.inject.Inject;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;


public class ToDoRepositoryImpl implements ToDoRepository{

    private final ToDoRemoteDataSource toDoRemoteDataSource;

    @Inject public ToDoRepositoryImpl(ToDoRemoteDataSource toDoRemoteDataSource){
        this.toDoRemoteDataSource=toDoRemoteDataSource;
    }

    @Override
    public Resource<ToDoResponse> getToDoResponse() {
        final Resource[] result = new Resource[]{Resource.loading(null)};
       toDoRemoteDataSource.getToDoResponse()
               .subscribeOn(Schedulers.io())
               .observeOn(Schedulers.io())
               .subscribe(new SingleObserver<ToDoResponse>() {
                   @Override
                   public void onSubscribe(@NonNull Disposable d) {

                   }

                   @Override
                   public void onSuccess(@NonNull ToDoResponse toDoResponse) {
                       result[0] =Resource.success(toDoResponse);
                   }

                   @Override
                   public void onError(@NonNull Throwable e) {
                       result[0] =Resource.error(e.getMessage(),e);
                   }
               });
       return result[0];
    }
}
