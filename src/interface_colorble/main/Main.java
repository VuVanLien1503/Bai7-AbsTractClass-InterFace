package interface_colorble.main;
import interface_colorble.model.Circle;
import interface_colorble.model.Rectangle;
import interface_colorble.model.Shape;
import interface_colorble.model.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for (Shape s : shapes) {
            if (s!=null){
                s.getArea();
            }
            if (s instanceof Square){
                s.getArea();
                ((Square) s).howToColor();
            }
        }
    }
}
