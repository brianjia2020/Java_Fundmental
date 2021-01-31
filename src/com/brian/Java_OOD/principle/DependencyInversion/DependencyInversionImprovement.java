package com.brian.Java_OOD.principle.DependencyInversion;

public class DependencyInversionImprovement {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.receive(new Weixin());
        person2.receive(new Email2());
    }
}

//the interface
//three ways of getting the dependencies
//      1. method param
//      2. constructor
//      3. setter
interface IReceiver{
    String getInfo();
}

class Person2 {
    public void receive(IReceiver message){
        System.out.println("received " + message.getInfo());
    }
}
class Weixin implements IReceiver{

    @Override
    public String getInfo() {
        return "email content: Hello this is Brian. :) ";
    }
}

class Email2 implements IReceiver{
    String info;
    public Email2(){}
    public Email2(String info){
        this.info = info;
    }
    public String getInfo(){
        return "email content: Hello this is Brian. :) ";
    }
}
