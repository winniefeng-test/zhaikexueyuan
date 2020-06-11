package com.zhaike.entity;

public class Lecturer {
    private Integer id;

    private String lecturername;

    private String describe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLecturername() {
        return lecturername;
    }

    public void setLecturername(String lecturername) {
        this.lecturername = lecturername == null ? null : lecturername.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}