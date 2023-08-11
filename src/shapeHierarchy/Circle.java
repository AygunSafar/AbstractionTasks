package shapeHierarchy;

public class Circle extends Shape {


    private double radius;

    public Circle(String name,double radius) {
        super(name);
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        System.out.println( radius*radius*Math.PI);

    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2*Math.PI*radius);
    }
}
