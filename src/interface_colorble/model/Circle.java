package interface_colorble.model;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public void getArea() {
        System.out.println("Area : Circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
