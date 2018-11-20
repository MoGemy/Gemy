package com.example.gemy.test.QRcode;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.gemy.test.R;
import com.example.gemy.test.entities.Student;
import com.example.gemy.test.studentList.StudentAdapter;
import com.example.gemy.test.students_list.StudentsListActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.zxing.Result;
import com.tbruyelle.rxpermissions2.RxPermissions;

import java.lang.reflect.Type;
import java.util.List;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class MainActivity extends AppCompatActivity {

    ZXingScannerView scannerView;
    private RxPermissions rxPermissions;
    Result result ;

    private boolean isPermissionGranted = false;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        scannerView = findViewById ( R.id.scannerView );
        rxPermissions = new RxPermissions ( this );

        scannerView.setResultHandler ( this::onQrResult );

        rxPermissions
                .request ( Manifest.permission.CAMERA )
                .subscribe ( this::onPermissionsResult );
    }


    @Override protected void onResume() {
        super.onResume ();
        if(isPermissionGranted)
            scannerView.startCamera ();
    }

    private void onPermissionsResult( Boolean isGranted ) {
        if ( isGranted ) {
            onPermissionGranted ();
        } else {
            onPermissionDenied ();
        }
    }


    private void onPermissionDenied() {
        AlertDialog dialog = new AlertDialog.Builder ( this )
                .setMessage ( "Sorry must use camera to scan QR code, please grant permission in next time" )
                .setNegativeButton ( "Exit" , ( dialog1 , which ) -> dialog1.dismiss () )
                .create ();
        dialog.show ();
    }

    private void onPermissionGranted() {
        scannerView.startCamera ();
        isPermissionGranted = true;
    }


    private void onQrResult(Result result) {
        Log.i ( "QR_RESULT" , result.getText() );
        Student student = null;
        try{
            Type listType = new TypeToken<List<Student>> () {}.getType();
            student = new Gson ().fromJson ( result.getText (), listType );
            Intent intent = new Intent ( this, StudentsListActivity.class );
            intent.putExtra ( "students", student );
            startActivity ( intent );
        }catch ( Throwable throwable ){
            //TODO Show dialog with can not read qr
            scannerView.startCamera ();
        }
        this.result=result;
    }

}
