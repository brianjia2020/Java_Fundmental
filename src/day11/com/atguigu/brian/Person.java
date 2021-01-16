package day11.com.atguigu.brian;

public class Person {

    String name;
    int age;

    public Person(){};
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("Eat...");
    }

    public void sleep(){
        System.out.println("Sleep...");
    }
}
