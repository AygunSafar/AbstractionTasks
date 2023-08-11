import shapeHierarchy.Circle;
import shapeHierarchy.Rectangle;
import shapeHierarchy.Shape;

public class Main {
    public static void main(String[] args) {

        // Test Code for Shape Hierarchy
        Shape shape = new Circle("Circle",8);
        shape.calculateArea();
        shape.calculatePerimeter();

        Shape shape2= new Rectangle("Rectangle",4,5);
        shape2.calculateArea();
        shape2.calculatePerimeter();




    }
}