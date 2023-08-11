package shapeHierarchy;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println(length*width);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2*(length+width));
    }
}
