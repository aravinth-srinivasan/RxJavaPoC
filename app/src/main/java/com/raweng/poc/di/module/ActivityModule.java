package com.raweng.poc.di.module;

import com.raweng.poc.di.annotation.ActivityScope;
import com.raweng.poc.view.ToDoListActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector
    abstract ToDoListActivity contributeToDoListActivity();
}
