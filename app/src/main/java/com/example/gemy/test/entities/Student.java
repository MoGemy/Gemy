package com.example.gemy.test.entities;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer id;
    private String name;
    private String img_url;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImg_url() {
        return img_url;
    }
}
