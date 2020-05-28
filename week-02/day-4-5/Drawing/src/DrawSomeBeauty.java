import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class DrawSomeBeauty {
    public static void mainDraw(Graphics graphics){
        int side = 30;
        int angle = 120;
        //ay x0 y0 az elozo vonal utolso koordinataival egyenlo
        int x0 = WIDTH/2+20;
        int y0 = HEIGHT/2;
        graphics.drawLine(WIDTH/2, HEIGHT/2, WIDTH/2+20, HEIGHT/2);
        for (int i = 0; i < 5; i++) {
            int x1 = (int)(side*(Math.cos(angle))+x0);
            int y1 = (int)(side*(Math.sin(angle))+y0);
            graphics.drawLine(x0, y0, x1, y1);
            x0 = x1;
            y0 = y1;
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
