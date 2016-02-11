package lab3;

import java.awt.*;

public interface Shape {
    void draw(Graphics g);

    int getX();

    int getY();

    Color getColor();
}
