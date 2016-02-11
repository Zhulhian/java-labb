package lab3;

import java.awt.*;

public class Circle extends AbstractShape
{
    private int radius;

    public Circle(final int x, final int y, final int radius, final Color color) {
        super(x, y, color);
        if (radius < 0) {
            throw new IllegalArgumentException("Negative radius!");
        }

        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.drawOval(this.x, this.y, this.getRadius(), this.getRadius());
        g.fillOval(this.x, this.y, this.getRadius(), this.getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", radius=" + radius +
                ", color=" + getColor() +
                '}';
    }

    public int getRadius() {
        return radius;
    }

}
