package com.example.finalproject;

public class UserClass {
    private String name,adrees,phone,username;

    @Override
    public String toString() {
        return "UserClass{" +
                "name='" + name + '\'' +
                ", adrees='" + adrees + '\'' +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public UserClass(String name, String adrees, String phone, String username) {
        this.name = name;
        this.adrees = adrees;
        this.phone = phone;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdrees() {
        return adrees;
    }

    public void setAdrees(String adrees) {
        this.adrees = adrees;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
