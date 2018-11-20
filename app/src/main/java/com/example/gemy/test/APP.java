package com.example.gemy.test;

import android.app.Application;
import android.util.Log;

import com.example.gemy.test.NetWork.StudentApi;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APP extends Application {
    private StudentApi api;

    @Override
    public void onCreate() {
        super.onCreate ();

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor ( message -> Log.i("ESLAMMMMMM",message) );
        logging.setLevel ( HttpLoggingInterceptor.Level.BODY );

        api = new Retrofit.Builder ()
                .baseUrl ( "http://m4saad.fekrait.com/test-api/" )
                .addCallAdapterFactory ( RxJava2CallAdapterFactory.create () )
                .addConverterFactory ( GsonConverterFactory.create () )
                .build ()
                .create ( StudentApi.class );

    }

    public StudentApi getApi() {
        return api;
    }

}
