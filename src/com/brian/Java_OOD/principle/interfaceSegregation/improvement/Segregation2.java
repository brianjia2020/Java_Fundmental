package com.brian.Java_OOD.principle.interfaceSegregation.improvement;

public class Segregation2 {
    public static void main(String[] args) {
        //A depends on B by interface 1,2
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        //C depends on D by interface 1,3
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}

interface Interface1{
    void operation1();
}
interface Interface2{
    void operation2();
    void operation3();
}
interface Interface3{
    void operation4();
    void operation5();
}

class B implements Interface1,Interface2{

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
}

class D implements Interface1,Interface3{

    @Override
    public void operation1() {
        System.out.println("D implemented operation1");
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
    public void depend1(Interface1 i){
        i.operation1();
    }

    public void depend2(Interface2 i){
        i.operation2();
    }

    public void depend3(Interface2 i){
        i.operation3();
    }

}

class C {
    public void depend1(Interface1 i){
        i.operation1();
    }

    public void depend4(Interface3 i){
        i.operation4();
    }

    public void depend5(Interface3 i){
        i.operation5();
    }
}