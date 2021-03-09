package kodilla.collections.arrays;

import kodilla.collections.interfaces.Circle;
import kodilla.collections.interfaces.Shape;
import kodilla.collections.interfaces.Square;
import kodilla.collections.interfaces.Triangle;

import java.util.Random;

 public class ShapeApplication {

     public static void main(String[] args) {
         Shape[] shapes = new Shape[5];
         for (int n = 0; n < shapes.length; n++)
         shapes[n] = drawShape();
         for (Shape shape : shapes)
             ShapeUtils.displayShapeInfo(shape);
     }

     private static Shape drawShape() {
         Random random = new Random();
         // draw a kind of the shape
         int drawShapeKind = random.nextInt(3);  // possible values: 0, 1, 2

         double a = random.nextDouble() * 100 + 1;      // possible values: 1.000-100.999 ...
         double b = random.nextDouble() * 100 + 1;
         double c = random.nextDouble() * 100 + 1;
         double d = random.nextDouble() * 100 + 1;

         if (drawShapeKind == 0)
             return new Circle(a);
         else if (drawShapeKind == 1)
             return new Square(a);
         else
             return new Triangle(a, b, c);
     }
 }