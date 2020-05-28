import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void mainDraw(Graphics graphics) {
        Random random = new Random();
        graphics.setColor(Color.ORANGE);
        for (int i = 10; i <= WIDTH; i+=10) {
            graphics.drawLine(i, i, (int)(Math.pow(Math.sqrt(i), random.nextInt(3))), (int)(Math.pow(Math.sqrt(i), random.nextInt(10))));
        }
        graphics.setColor(Color.BLACK);
        for (int j = WIDTH-10; j >= 0; j -= 10) {
            //Random might drop zerodiv exception
            graphics.drawLine((int) (j*random.nextInt(20)/(random.nextInt(30)+1)), random.nextInt(300), j, j);
            graphics.setColor(Color.BLUE);
        }

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

