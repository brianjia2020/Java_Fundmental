package day08.JavaOOP;

import org.junit.Test;

/**
 * class Person:
 * 1. attribute--field
 * 2. method--function
 *
 * 3. if multiple instances have been initiated, all instances will have independent set of attributes
 * 4. object memory details:
 *      4.1 Heap: store class instance
 *      4.2 Stack: store local variables
 *      4.3 Method Area: class info, constants, static variable values
 */
public class PersonTest {
    @Test
    public void test1(){
        //1. initiate a Person object
        Person person1 = new Person();
        //2. assign values to attributes
        person1.age=20;
        person1.isMale=true;
        person1.name="Brian";
        System.out.println(person1.name);
        //3. invoke the method of the instance
        person1.talk();
        person1.sleep();

        Person person2 = new Person();
        System.out.println(person2.name); //will be null, no default value for name
        System.out.println(person2.isMale); //default to false

    }
}

class Person{
    //1. attribute
    String name;
    int age=1;
    boolean isMale;


    //2. method
    public void eat(){
        System.out.println("I  can eat");
    }

    public void sleep(){
        System.out.println("I can sleep");
    }

    public void talk(){
        System.out.println("I can talk");
    }
}
