import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.

        int counter = 0;
        ArrayList<Integer> xCoordinates = new ArrayList<>();
        ArrayList<Integer> yCoordinates = new ArrayList<>();
        while (counter <= 160) {
            Random random = new Random();
            xCoordinates.add(random.nextInt(300));
            yCoordinates.add(random.nextInt(300));
            counter++;
        }
        for (int i = 0; i < xCoordinates.size(); i++) {
            Random random = new Random();
            graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            graphics.drawLine(WIDTH/2, HEIGHT/2, xCoordinates.get(i), yCoordinates.get(i));
        }



    }
    public static void drawLinesFromCenter (ArrayList<Integer> arrx, ArrayList<Integer> arry) {

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }

}
