package com.brian.JAVA_Fundmental.day14.com.java;

/**
 * final keyword:
 *
 * 1. final can describe class,method,attribute
 *
 * 2. final class
 *
 * 3. final method: the method cannot override
 *
 * 4. final variable:
 */
public class FinalTest {
    public static void main(String[] args) {

    }
}

/**
 * once finalized, the FinalA cannot be inherited by other class
 * for example: String, System, StringBuffer
 *
 *
 */
final class FinalA {
    static final int width = 2;
}

class AA {
    public void show(){}
}

class BB extends AA{
    public void show(){};

}