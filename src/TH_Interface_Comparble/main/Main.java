package TH_Interface_Comparble.main;

import TH_Interface_Comparble.model.ComparableCircle;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles=new ComparableCircle[3];
        circles[0]=new ComparableCircle(3.4);
        circles[1]=new ComparableCircle();
        circles[2]=new ComparableCircle(3.5,"red");

        System.out.println(" Pre-Sorted");
        for (ComparableCircle comparableCircle:circles) {
            System.out.println(comparableCircle);
        }
        Arrays.sort(circles);
        System.out.println("After-Sorted");
        for (ComparableCircle comparableCircle :
                circles) {
            System.out.println(comparableCircle);
        }
    }
}
