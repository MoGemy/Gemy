package com.example.gemy.test.entities;

import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName( "gender" )
    private String gender;

    @SerializedName( "img_url" )
    private String imgUrl;

    @SerializedName( "name" )
    private String name;

    @SerializedName( "mobile" )
    private String mobile;

    @SerializedName( "gpa" )
    private double gpa;

    @SerializedName( "id" )
    private int id;

    @SerializedName( "class" )
    private int jsonMemberClass;

    @SerializedName( "email" )
    private String email;

    public void setGender( String gender ) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setImgUrl( String imgUrl ) {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMobile( String mobile ) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setGpa( double gpa ) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setJsonMemberClass( int jsonMemberClass ) {
        this.jsonMemberClass = jsonMemberClass;
    }

    public int getJsonMemberClass() {
        return jsonMemberClass;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return
                "Data{" +
                        "gender = '" + gender + '\'' +
                        ",img_url = '" + imgUrl + '\'' +
                        ",name = '" + name + '\'' +
                        ",mobile = '" + mobile + '\'' +
                        ",gpa = '" + gpa + '\'' +
                        ",id = '" + id + '\'' +
                        ",class = '" + jsonMemberClass + '\'' +
                        ",email = '" + email + '\'' +
                        "}";
    }
}