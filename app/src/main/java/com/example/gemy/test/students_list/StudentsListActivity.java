package com.example.gemy.test.students_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gemy.test.entities.Student;

import java.util.List;

public class StudentsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );

        List<Student> list = ( List <Student> ) getIntent ().getSerializableExtra ( "students" );
        // Now you have list, display it inside adapter
    }
}
