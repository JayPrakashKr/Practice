package com.dell.java8;

public class Student {
    private Integer StudentId;
    private String name;
    private String address;

    public Integer getStudentId() {
        return StudentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
