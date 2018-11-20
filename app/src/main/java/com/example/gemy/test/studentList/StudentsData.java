package com.example.gemy.test.studentList;

import android.app.Application;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.gemy.test.APP;
import com.example.gemy.test.NetWork.StudentApi;
import com.example.gemy.test.R;

import javax.xml.transform.Result;

public class StudentsData extends AppCompatActivity {
    Application application;
    RecyclerView recyclerView = findViewById(R.id.recyclerView);
    StudentApi api = ((APP) application).getApi();
    FloatingActionButton button = findViewById(R.id.call);
    com.google.zxing.Result result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_data);
/*
        api.getStudent()
                .map(Studentlist -> Studentlist.getData())
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe(dataItem -> {
                    for (DataItem item : dataItem) {
                        StudentAdapter adaptar = new StudentAdapter(dataItem, studentlist);
                        recyclerView.setLayoutManager(new LinearLayoutManager(this));
                        recyclerView.setAdapter(adaptar);
                    }
                }, throwable -> {
                    throwable.printStackTrace();
                });*/
        }

}






