package com.example.demo.entity;

public class UserInfo {
  
    public String id;
    public String name;
    public String course;
    public String sex;
    public String birth;

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }
}
