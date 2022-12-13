package TH_Interface_Comparator.main;

import TH_Interface_Comparator.model.Circle;
import TH_Interface_Comparator.model.CircleComparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
     Circle[]circles=new Circle[3];
     circles[0] = new Circle(3.6);
     circles[1] = new Circle();
     circles[2] = new Circle(3.5,"red");


        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
