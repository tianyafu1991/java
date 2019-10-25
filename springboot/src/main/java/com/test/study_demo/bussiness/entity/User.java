package com.test.study_demo.bussiness.entity;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private Integer id;

    private String name;

    private String sex;

    private String school;

    public User() {
    }

    public User(String name, String sex, String school) {
        this.name = name;
        this.sex = sex;
        this.school = school;
    }

    public User(Integer id, String name, String sex, String school) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.school = school;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(sex, user.sex) &&
                Objects.equals(school, user.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, school);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
