package com.raweng.poc.view;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.raweng.poc.R;
import com.raweng.poc.databinding.ActivityTodoListBinding;
import dagger.android.support.DaggerAppCompatActivity;


public class ToDoListActivity extends DaggerAppCompatActivity {

    private ActivityTodoListBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_todo_list);
    }
}
