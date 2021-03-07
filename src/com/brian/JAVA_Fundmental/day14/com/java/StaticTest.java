package com.brian.JAVA_Fundmental.day14.com.java;


/**
 * static:
 *
 * 1. can be used to describe mostly the structures of class structure
 *    :attribute
 *    :code blocks
 *    :method
 *    :inner class
 * 2. using static to describe attributes
 *    : static attribute is shared by all the instances of the object
 *    : non-static attribute belongs to specific instance of object
 *
 * 3. 3.1 static attributes are loaded when class are loaded, can be called by "Class.attribute"
 *    3.2 static attributes are loaded before the creation of instances
 *    3.3 since class is only loaded once, static attribute will only be created once
 *    3.4 class attribute,
 *    For example, System.out, Math.PI
 *
 * 4. using static to describe code blocks
 *    4.1 static method are loaded with the class, so that can be called by "Class.method"
 *
 * 5. when to use static key word
 *    5.1 common method shared by all instances
 *    5.2 utility class, Arrays, Collections, System
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.age = 10;
        c1.name = "Brian";
        Chinese.nation = "China";
        System.out.println(c1);


    }
}

class Chinese {
    String name;
    int age;
    static String nation;
}
