package com.example.gemy.test.NetWork;

import com.example.gemy.test.POJO.Studentlist;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface StudentApi {

    @GET("competitions")
    Single<Studentlist> getStudent();
}
