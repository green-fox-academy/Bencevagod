import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class DrawCheckerBoard {
    public static void mainDraw(Graphics graphics){
        int counterI = 0;
        for (int i = 0; i < HEIGHT; i+=40) {
            int counterJ = 0;
            int counterK = 0;
            for (int j = 0; j < WIDTH; j+=40) {
                Random random = new Random();
                if (counterI % 2 == 0) {
                    if (counterJ % 2 == 0) {
                        graphics.setColor(Color.BLACK);
                        graphics.drawRect(j, i, 40, 40);
                    } else {
                        graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
                        graphics.fillRect(j, i, 40, 40);
                    }
                }
                counterJ++;
            }
            for (int k = 0; k < WIDTH; k+=40) {
                    Random random = new Random();
                if (counterI%2!=0) {
                    graphics.setColor(Color.BLACK);
                    if (counterK % 2 != 0) {
                        graphics.drawRect(k, i, 40, 40);
                    } else {
                        graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
                        graphics.fillRect(k, i, 40, 40);
                    }
                }
                counterK++;
            }
        counterI++;
        }

    }

    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        DrawCheckerBoard.ImagePanel panel = new DrawCheckerBoard.ImagePanel();
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

