package kodilla.collections.arrays;

import kodilla.collections.interfaces.Circle;
import kodilla.collections.interfaces.Shape;
import kodilla.collections.interfaces.Square;
import kodilla.collections.interfaces.Triangle;


public class ShapeUtils {
    public static void displayShapeInfo( Shape shape){
        System.out.println("------------------");
        System.out.println("Shape kind:" + getShapeName(shape));
        System.out.println("Shape area:" + shape.getArea());
        System.out.println("Shape perimeter: " + shape.getPerimeter());

    }
    private static String getShapeName(Shape shape) {
        if (shape instanceof Circle)
            return "Circle";
        else if (shape instanceof Triangle)
            return "Triangle";
        else if (shape instanceof Square)
            return "Square";
        else
            return "Unknown shape name";
    }
}
