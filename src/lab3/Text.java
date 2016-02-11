package lab3;

import java.awt.*;

public class Text extends AbstractShape {
    private int size;
    private String text;

    public Text(int x, int y, int size, Color color, String text) {
        super(x, y, color);
        if (size < 0) {
            throw new IllegalArgumentException("Font size can't be negative.");
        }
        if (text.isEmpty()) {
            throw new IllegalArgumentException("Text string is empty.");
        }

        this.size = size;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Text{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", size=" + size +
                ", color=" + getColor() +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.setFont(new Font("serif", Font.PLAIN, this.size));
        g.drawString(this.text, this.x, this.y);
    }
}
