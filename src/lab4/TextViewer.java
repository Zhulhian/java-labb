package lab4;

import javax.swing.*;
import java.awt.*;

public class TextViewer extends JComponent {

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 1000;
    public static final int LEFT_ALIGNED = 0;
    public static final int FONT_SIZE = 40;
    public static final int ROW_DISTANCE = 2;
    public static final int PARAGRAPH_DISTANCE = 30;

    public int startX = LEFT_ALIGNED;
    public int paragraph = 0;
    public int row = 0;

    public TextViewer() throws HeadlessException {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public void drawRow(Graphics g, String text) {
        g.drawString(text, startX, (row + 1) * FONT_SIZE + row*ROW_DISTANCE + paragraph * PARAGRAPH_DISTANCE);
        row++;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TextViewer");
        frame.add(new TextViewer());
        frame.pack();
        frame.setVisible(true);
    }

    @Override protected void paintComponent(final Graphics g) {
        g.setColor(Color.BLACK);
        g.setFont(new Font("serif", Font.PLAIN, FONT_SIZE));
        drawRow(g, "This is the first line of the first paragraph of text.");
        drawRow(g, "It is followed by the second line of text.");
        drawRow(g, "Which is followed by the third line of text.");
        paragraph++;

        drawRow(g, "Start of the second paragraph of text.");
        drawRow(g, "Continuation of the second paragraph of text.");
        drawRow(g, "Conclusion of the second paragraph of text.");
        paragraph++;

        drawRow(g, "Start of the third paragraph of text.");
        drawRow(g, "Continuation of the third paragraph of text.");
        drawRow(g, "Conclusion of the third paragraph of text.");
        paragraph++;
    }
}