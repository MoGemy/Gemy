package com.example.gemy.test.QRcode;

import android.Manifest;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.gemy.test.R;
import com.example.gemy.test.studentList.StudentAdapter;
import com.google.zxing.Result;
import com.tbruyelle.rxpermissions2.RxPermissions;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class MainActivity extends AppCompatActivity {

    ZXingScannerView scannerView;
    private RxPermissions rxPermissions;
    RecyclerView recyclerView = findViewById(R.id.recyclerView);
    Result result ;

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

        StudentAdapter adaptar = new StudentAdapter(result);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adaptar);
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
    }


    private void onQrResult(Result result) {
        Log.i ( "QR_RESULT" , result.getText() );
        this.result=result;
    }

}
