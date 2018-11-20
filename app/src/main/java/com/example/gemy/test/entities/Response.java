package com.example.gemy.test.entities;

import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName( "data" )
    private Data data;

    @SerializedName( "error" )
    private boolean error;

    public void setData( Data data ) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setError( boolean error ) {
        this.error = error;
    }

    public boolean isError() {
        return error;
    }

    @Override
    public String toString() {
        return
                "Response{" +
                        "data = '" + data + '\'' +
                        ",error = '" + error + '\'' +
                        "}";
    }
}