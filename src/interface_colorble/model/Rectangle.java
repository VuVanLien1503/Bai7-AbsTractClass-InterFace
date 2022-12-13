package interface_colorble.model;

public class Rectangle extends Shape{
    private double weight;
    private double height;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle() {
    }

    @Override
    public void getArea() {
        System.out.println("Area: Rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
