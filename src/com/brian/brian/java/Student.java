package com.brian.brian.java;

public class Student extends Person{
    String major;

    public Student(){};
    public Student(String name,int age, String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void eat(){
        System.out.println("Student eat");
    }

    public void show(){
        System.out.println("Show..."+ this.name);
    }

}
