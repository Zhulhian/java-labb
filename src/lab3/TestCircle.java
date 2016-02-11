package lab3;

import java.awt.*;
import java.util.ArrayList;

public class TestCircle {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();

        circles.add(new Circle(200, 200, 40, Color.LIGHT_GRAY));
        circles.add(new Circle(250, 250, 10, Color.ORANGE));
        circles.add(new Circle(400, 250, 100, Color.orange));

        for (Circle circle : circles) {
            System.out.println(circle);
            System.out.println(circle.getX());
            System.out.println(circle.getY());
            System.out.println();
        }
    }
}
