import org.junit.Test;

/**
 * class Person:
 * 1. attribute--field
 * 2. method--function
 */
public class PersonTest {
    @Test
    public void test1(){
        //1. initiate a Person object
        Person person = new Person();
        //2. assign values to attributes
        person.age=20;
        person.isMale=true;
        person.name="Brian";
        System.out.println(person.name);
        //3. invoke the method of the instance
        person.talk();
        person.sleep();
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
