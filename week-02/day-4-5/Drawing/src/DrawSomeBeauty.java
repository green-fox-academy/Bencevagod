import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class DrawSomeBeauty {
    public static void mainDraw(Graphics graphics){

        //ay x0 y0 az elozo vonal utolso koordinataival egyenlo
        int side = 20;
        int x0 = WIDTH/2;
        int y0 = HEIGHT/2;
        for (int line = 0; line < 7; line++) {

            for (int j = 0; j < 7; j++) {
                drawHexa(x0, y0, side, graphics);
            }
        }



    }
    public static void drawHexa (int x0, int y0, int side, Graphics graphics) {
        int angle = 60;
        int x1 = x0+side;
        int y1 = y0;
        graphics.drawLine(x0, y0, x1, y1);
        for (int i = 0; i < 5; i++) {
            x0 = x1;
            y0 = y1;
            x1 = (int)(side*(Math.cos(Math.toRadians(angle)))+x0);
            y1 = (int)(side*(Math.sin(Math.toRadians(angle)))+y0);
            graphics.drawLine(x0, y0, x1, y1);
            angle+=60;
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
