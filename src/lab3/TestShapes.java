package lab3;

import java.awt.*;
import java.util.ArrayList;

public class TestShapes {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(200, 200, 40, Color.LIGHT_GRAY));
        shapes.add(new Circle(250, 250, 10, Color.ORANGE));
        shapes.add(new Circle(400, 250, 100, Color.orange));

        shapes.add(new Rectangle(210, 220, 50, 20, Color.BLUE));
        shapes.add(new Rectangle(400, 301, 20, 5, Color.YELLOW));

        shapes.add(new Text(20, 10, 40, Color.DARK_GRAY, "SHAPES GALORE!"));
        shapes.add(new Text(shapes.get(0).getX() - 40, shapes.get(0).getY() + 40, 20,
                shapes.get(0).getColor(), "First shape in the shape list!"));

        //for (Shape shape : shapes) {
            //shape.draw();
            //System.out.println();
        //}
    }
}
