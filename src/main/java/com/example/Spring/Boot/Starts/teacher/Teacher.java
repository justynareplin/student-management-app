package com.example.Spring.Boot.Starts.teacher;

public class Teacher {
    private String name;
    private String surname;
    private String position;
    private Integer age;

    public Teacher(String name, String surname, String position, Integer age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                '}';
    }
}
