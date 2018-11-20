package com.example.gemy.test.QRcode;

import android.Manifest;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.gemy.test.R;
import com.google.zxing.Result;
import com.tbruyelle.rxpermissions2.RxPermissions;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class MainActivity extends AppCompatActivity {
    ZXingScannerView scannerView;

    private RxPermissions rxPermissions;

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

    private void onQrResult( Result result ) {
        Log.i ( "QR_RESULT" , result.getText () );

    }
}
