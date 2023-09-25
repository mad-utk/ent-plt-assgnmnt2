package com.example.usermanagement.model;

import java.util.Date;

public class User {

    // add new field named id
    private Long id;
    private String name;
    private String emailId;
    private Integer mobileNo;

    public User(String name, String emailId, Integer mobileNo) {
        this.name = name;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Integer getMobileNo() {
        return mobileNo;
    }

    public void getMobileNo(Integer mobileNo) {
        this.mobileNo = mobileNo;
    }

    // write toString method for all fields of User Class
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", mobileNo=" + mobileNo +
            '}';
    }

}
