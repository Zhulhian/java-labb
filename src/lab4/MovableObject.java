package lab4;

public class MovableObject
{
    protected int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MovableObject(int x, int y) {
        this.x = x;
        this.y = y;
    }
}