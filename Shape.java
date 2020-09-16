package com.practice2;

public class Shape {
    private double area;

    Shape(double area){
        this.area=area;
    }
    public String toString() {
        return "Shape{" +
                "area=" + area +
                '}';
    }

}

class ShapeTest{
    public static void main(String[] args){
        Shape shape=new Shape(32);
        AboutShape(shape);
    }
    public static void AboutShape(Shape shape){
        System.out.println(shape.toString());
    }
}