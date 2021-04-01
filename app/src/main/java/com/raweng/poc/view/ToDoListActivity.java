package com.raweng.poc.view;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.raweng.poc.R;
import com.raweng.poc.databinding.ActivityTodoListBinding;
import com.raweng.poc.model.todo.ToDoResponse;
import com.raweng.poc.viewModel.ToDoListViewModel;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;


public class ToDoListActivity extends DaggerAppCompatActivity {

    @Inject
    ToDoListViewModel viewModel;
    private ActivityTodoListBinding binding;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_todo_list);
        viewModel.getToDoList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<ToDoResponse>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                     }

                    @Override
                    public void onSuccess(@NonNull ToDoResponse toDoResponse) {

                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }
                });
        ;
    }
}
