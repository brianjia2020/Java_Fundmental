package com.brian.Java_OOD.principle.DependencyInversion;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

//a person class receive message
//1: receive method depends on the Email class
//2. what if we have received not only email but wechat, phone message....
//   then we will need to add more classes and methods inside Person
//3. to address this issue, we introduce an interface called IReceiver then the person
//   class depends on IReceiver
//4. As the Email, Wechat all belongs to the scope of receiver, if they both implement
//   the IReceiver interface, this will solve the issue. This applies to the dependency
//   inversion
/**
 * Person class
 */
class Person{
    public void receive(Email email){
        System.out.println("received " + email.getInfo());
    }
}

class Email{
    String info;
    public Email(){}
    public Email(String info){
        this.info = info;
    }
    public String getInfo(){
        return "email content: Hello this is Brian. :) ";
    }
}