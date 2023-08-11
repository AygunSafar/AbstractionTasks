package shapeHierarchy;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void calculateArea();
    public abstract void calculatePerimeter();

}
