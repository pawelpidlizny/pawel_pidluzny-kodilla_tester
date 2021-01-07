package com.kodilla.collections.interfaces;

public class InterfacesDemo {

    public static void main(String[] args) {

        Square square = new Square(10.0);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());


        Circle circle = new Circle(7.0);
        System.out.println(circle.getArea());
        System.out.println(square.getPerimeter());

        Triangle triangle = new Triangle(6.0,4.0,7.211);
        showTriangleDetails(triangle);
    }

    private static void showShapeDetails(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }

    private static void showSquareDetails (Square square){
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

    }
    private static void showCircleDetails (Circle circle){
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
    private static void showTriangleDetails (Triangle triangle) {
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }

}
