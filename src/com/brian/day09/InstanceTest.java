package com.brian.day09;

/**
 * 1. understand all are objects
 *      1.1 In Java, all instances of class and invoke methods of class to operate
 *      1.2 Java interacts with frontend Javascript and backend database in Object-oriented programming:
 *            one java object corresponds to one line of a database row
 *            one java object corresponds to json object
 *
 *            Student[] stus = new Student[5];
 *              =>>> heap: stus --> 0x7788(for example)
 *              =>>> stack: 0x7788 -> [null,null,null,null,null]
 *            stus[0] = new Student();
 *              =>>> heap: stus --> 0x7788(for example)
 *              =>>> stack: 0x7788 -> [address of the newly created Student instance,null,null,null,null]
 *      1.3
 */
public class InstanceTest {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu);
    }
}

class Student{
    String name;
    int age;
}
