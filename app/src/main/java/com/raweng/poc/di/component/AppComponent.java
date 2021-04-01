package com.raweng.poc.di.component;


import android.app.Application;
import com.raweng.poc.app.App;
import com.raweng.poc.di.module.NetModule;
import javax.inject.Singleton;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        NetModule.class
})
public interface AppComponent extends AndroidInjector<App> {

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder bindApplication(Application application);
        AppComponent build();
    }

}
