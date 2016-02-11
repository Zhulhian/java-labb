package lab3;

import javax.swing.*;
import java.awt.*;

public class DiagramViewer {
    public static void main(String[] args) {
        DiagramComponent comp = new DiagramComponent();

        comp.addShape(new Circle(200, 200, 600, Color.RED));
        comp.addShape(new Text(50, 75, 30, Color.DARK_GRAY, "SO MUCH TEXT"));
        comp.addShape(new Text(400, 500, 200, Color.blue, "COOOOOOL"));
        comp.addShape(new Rectangle(1000, 100, 800, 300, Color.ORANGE));


        JFrame frame = new JFrame("Diagram Viewer");
        frame.setLayout(new BorderLayout());
        frame.add(comp, BorderLayout.CENTER);
        frame.setSize(1920, 1080);
        frame.setVisible(true);
    }
}
