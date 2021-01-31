package com.brian.Java_OOD.principle.interfaceSegregation;

public class Segregation1 {
    public static void main(String[] args) {

    }
}

interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements com.brian.Java_OOD.principle.interfaceSegregation.Interface1 {

    @Override
    public void operation1() {
        System.out.println("B implemented operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B implemented operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B implemented operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B implemented operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B implemented operation5");
    }
}

class D implements com.brian.Java_OOD.principle.interfaceSegregation.Interface1 {

    @Override
    public void operation1() {
        System.out.println("D implemented operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D implemented operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D implemented operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D implemented operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D implemented operation5");
    }
}

class A {//class A depends on B through interface i but it only uses the 1,2,3 method
    public void depend1(com.brian.Java_OOD.principle.interfaceSegregation.Interface1 i){
        i.operation1();
    }

    public void depend2(com.brian.Java_OOD.principle.interfaceSegregation.Interface1 i){
        i.operation2();
    }

    public void depend3(com.brian.Java_OOD.principle.interfaceSegregation.Interface1 i){
        i.operation3();
    }

}

class C {
    public void depend1(com.brian.Java_OOD.principle.interfaceSegregation.Interface1 i){
        i.operation1();
    }

    public void depend4(com.brian.Java_OOD.principle.interfaceSegregation.Interface1 i){
        i.operation4();
    }

    public void depend5(com.brian.Java_OOD.principle.interfaceSegregation.Interface1 i){
        i.operation5();
    }
}