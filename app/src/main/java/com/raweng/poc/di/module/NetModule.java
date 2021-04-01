package com.raweng.poc.di.module;

import com.raweng.poc.api.WebServices;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetModule {

    @Singleton
    @Provides
    Retrofit provideRetrofit(){
        OkHttpClient.Builder okHttpClient= new OkHttpClient.Builder();
        okHttpClient.addInterceptor(new HttpLoggingInterceptor());
        okHttpClient.readTimeout(30, TimeUnit.SECONDS);
        okHttpClient.connectTimeout(30, TimeUnit.SECONDS);
        okHttpClient.writeTimeout(30, TimeUnit.SECONDS);

        OkHttpClient client=okHttpClient.build();

        return new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }

    @Singleton
    @Provides
    WebServices provideWebServices(){
        return provideRetrofit().create(WebServices.class);
    }


}
