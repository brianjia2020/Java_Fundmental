package com.brian.Java_OOD.principle.liskov;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(b.func2(1,1));
    }
}
//class A
class A {
    public int func1(int num1, int num2){
        return num1-num2;
    }
}

//class B extends A
//as the fun1 has been overridden, the two functions are now different
//as the system becomes more and more complex, especially when people use polymorphism,
//the likelihood of collision increases
//Based on liskov replacement rule, in this case, we should have A,B to extend a more common class
class B extends A {
    public int func1(int num1, int num2){
        return num1+num2;
    }

    public int func2(int num1, int num2){
        return func1(num1,num2)+9;
    }
}