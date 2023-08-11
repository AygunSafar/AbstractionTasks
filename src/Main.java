import bankingSystem.SavingsAccount;
import shapeHierarchy.Circle;
import shapeHierarchy.Rectangle;
import shapeHierarchy.Shape;
import vehicle.Airplane;
import vehicle.Car;

public class Main {
    public static void main(String[] args) {

        // Test Code for Shape Hierarchy
        Shape shape = new Circle("Circle",8);
        shape.calculateArea();
        shape.calculatePerimeter();

        Shape shape2= new Rectangle("Rectangle",4,5);
        shape2.calculateArea();
        shape2.calculatePerimeter();

        //Test code for vehicle

        Car car= new Car();
        car.accelerate(100);
        car.brake();
        car.start();
        car.stop();

        Airplane airplane= new Airplane();
        airplane.fly();
        airplane.takeOff();
        airplane.land();

        //



    }
}