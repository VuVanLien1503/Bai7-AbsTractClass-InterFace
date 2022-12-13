package interface_colorble.model;

public class Square extends Shape implements ColorAble{
    private double sides;

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public Square(String color, double sides) {
        super(color);
        this.sides = sides;
    }

    public Square(double sides) {
        this.sides = sides;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public Square(String color) {
        super(color);
    }

    public Square() {
        super();
    }

    @Override
    public void getArea() {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public void howToColor() {
        System.out.println("Square : Interface-ColorAble");
    }

    @Override
    public String toString() {
        return "Square{" +
                "sides=" + sides +
                '}';
    }
}
