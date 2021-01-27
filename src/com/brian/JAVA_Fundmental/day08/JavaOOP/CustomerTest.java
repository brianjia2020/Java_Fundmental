package com.brian.JAVA_Fundmental.day08.JavaOOP;

/**
 * 1. class method declaration and description
 *    method: a class function
 *    For Example: Math.xxx, Scanner.xxx, Arrays.xxx
 * 2. privilege level: public,private,N/A,protected
 * 3. return value:
 *      void VS other types;
 *      return XXX
 *    method name: start with smaller case
 */
public class CustomerTest {

}

class Customer{
    //attributes
    String name;
    int age;
    boolean isMale;

    //methods
    public void eat(){
        System.out.println("Customer is eating...");
    }

    public void sleep(int hour){
        System.out.println("Customer has slept for " + hour + " hours.");
    }

    public String getName(){
        return name;
    }

    public String getNation(String nation){
        return "My nationality is " + nation;
    }
}