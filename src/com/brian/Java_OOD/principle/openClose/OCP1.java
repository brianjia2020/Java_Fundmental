package com.brian.Java_OOD.principle.openClose;

public class OCP1 {
    public static void main(String[] args) {
        GraphicEditor1 graphicEditor = new GraphicEditor1();
        graphicEditor.drawShape(new Circle1());
        graphicEditor.drawShape(new Rectangle1());
        graphicEditor.drawShape(new Triangle1());
        graphicEditor.drawShape(new Other1());
    }
}

/**
 * This way is against the OCP way
 *      the drawShape method can take all shape and its child class
 * The problem is we need to add one more Shape like triangle. we need to modify many places inside the class
 * OCP principle is that:
 *     open to supplier (Shape)
 *     close to customer (GraphicEditor)
 * Improvement 1: make Shape abstract class then have a draw method
 *             2: no need to change in GraphicEditor1 class, only need to change inside the supplier class
 *             3: when adding the new Other1 class, we do not need to change the user side.
 * Beautiful!!!!!
 */
class GraphicEditor1 {
    //accept a shape then based on type to call the proper function
    public void drawShape(Shape1 s){
        s.draw();
    }

//    //draw rectangle
//    public void drawRectangle(Shape1 s){
//        System.out.println("Rectangle");
//    }
//
//    //draw circle
//    public void drawCircle(Shape1 s){
//        System.out.println("Circle");
//    }
//
//    //draw triangle
//    public void drawTriangle(Shape1 s){
//        System.out.println("Triangle");
//    }
}

abstract class Shape1 {
    int m_type;
    public abstract void draw();//abstract method
}

class Rectangle1 extends Shape1{
    Rectangle1(){
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle1 extends Shape1{
    Circle1(){
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
class Triangle1 extends Shape1{
    Triangle1(){
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

//new class
class Other1 extends Shape1{

    @Override
    public void draw() {
        System.out.println("Drawing Other");
    }
}
