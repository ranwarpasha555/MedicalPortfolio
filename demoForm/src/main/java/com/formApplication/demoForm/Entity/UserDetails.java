package com.formApplication.demoForm.Entity;

import jakarta.persistence.*;


import java.util.*;

@Entity
@Table(name = "Feed_back")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String fullName;


    @Column(name = "Date")
    private  String date;

    @Column(name = "Email_address")
    private String email;

    @Column(name = "Phone_Number")
    private String phone;

    @Column(name = "Descriptions")
    private String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", date='" + date + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", desc='" + desc + '\'' +
                '}';
    }
}
