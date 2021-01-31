package com.brian.Java_OOD.principle.openClose;

public class OCP {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Triangle());
    }
}

/**
 * This way is against the OCP way
 *      the drawShape method can take all shape and its child class
 * The problem is we need to add one more Shape like triangle. we need to modify many places inside the class
 * OCP principle is that:
 *     open to supplier (Shape)
 *     close to customer (GraphicEditor)
 */
class GraphicEditor {
    //accept a shape then based on type to call the proper function
    public void drawShape(Shape s){
        if(s.m_type==1){
            drawRectangle(s);
        } else if (s.m_type==2){
            drawCircle(s);
        } else if (s.m_type==3){
            drawTriangle(s);
        }
    }

    //draw rectangle
    public void drawRectangle(Shape s){
        System.out.println("Rectangle");
    }

    //draw circle
    public void drawCircle(Shape s){
        System.out.println("Circle");
    }

    //draw triangle
    public void drawTriangle(Shape s){
        System.out.println("Triangle");
    }
}

class Shape {
    int m_type;
}

class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }
}

class Circle extends Shape{
    Circle(){
        super.m_type = 2;
    }
}
class Triangle extends Shape{
    Triangle(){
        super.m_type = 3;
    }
}