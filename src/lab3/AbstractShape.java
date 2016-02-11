package lab3;

import java.awt.*;

public abstract class AbstractShape implements Shape{

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractShape that = (AbstractShape) o;

        if (x != that.x) return false;
        if (y != that.y) return false;
        return color.equals(that.color);

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + color.hashCode();
        return result;
    }

    protected int x;
    protected int y;
    protected Color color;

    public AbstractShape(final int x, final int y, final Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
