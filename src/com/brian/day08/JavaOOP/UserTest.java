package com.brian.day08.JavaOOP;

/**
 * 1. use of class attributes
 *    attribute VS local variable
 *    1. similarities:
 *    2. differences:
 *        2.1: places are different.
 *             variables declared inside static code blocks, methods, constructors are called local variables
 *             variables declared inside the class used to describe class
 *        2.2: privilege level:
 *             attribute can use private,public,N/A,protected to define the privilege
 *             local variables can only be used locally inside where it's been defined
 *        2.3: default values:
 *             byte,short,int,long: 0
 *             float,double: 0.0
 *             char: 0 or "\u0000"
 *             boolean: false
 *             quoted types (Object,Interface,Array):null
 *        2.4: memory location:
 *             attributes(non-static): heap
 *             local variables: stack
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.talk("English");
    }
}

class User{
    //User attributes
    String name;
    int age;
    boolean isMale;

    public void talk(String lang){
        System.out.println("I can speak " + lang);
    }

}

