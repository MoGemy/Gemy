package com.example.gemy.test.NetWork;


import com.example.gemy.test.entities.Response;

import io.reactivex.Single;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface StudentApi {

    @FormUrlEncoded
    @POST( "get_students_details.php" )
    Single <Response> getStudent( @Field( "student_id" ) int id );
}
