package com.example.demo.api.model;

public class User {

    private int id;

    private int age;

    private String firstname;

    private int demossn;

    private int dob;

    private String address;

    private int phonenumber;

    public User(int id, int age, String firstname, int demossn, int dob, String address, int phonenumber){
        this.id = id;
        this.age = age;
        this.firstname = firstname;
        this.demossn = demossn;
        this.dob = dob;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getDemossn() {
        return demossn;
    }

    public void setDemossn(int demossn) {
        this.demossn = demossn;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }


}
