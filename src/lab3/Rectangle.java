package lab3;

import java.awt.*;

public class Rectangle extends AbstractShape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        if (width < 1) {
            throw new IllegalArgumentException("Width is less than 1.");
        }
        if (height < 1) {
            throw new IllegalArgumentException("Height is less than 1.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", width=" + width +
                ", height=" + height +
                ", color=" + getColor() +
                '}';
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.drawRect(this.x, this.y, this.width, this.height);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
}
