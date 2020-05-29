import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class DrawSomeBeauty {
    public static void mainDraw(Graphics graphics){

        int side = 20;
        int colCounter = 1;
        int hexaCounter = 4;

        for (int i = 1; i < 8; i++) {
            int col = i*30+50;
            for (int j = 80; j < hexaCounter*35+80; j+=35 ) {
                int jyu = j - 17*i;
                if (i <= 4){
                    drawHexa(col, jyu, side, graphics);

                } else {
                    drawHexa(col, j-17*4+17*(i-4), side,graphics);
                }
            }
            if (i < 4) {
                hexaCounter++;
            } else if (i >= 7){
                hexaCounter = 0;
            } else {
                hexaCounter--;
            }
            /*
            xKCounter = xJCounter+1;
            for (int j = WIDTH/2-10; j < xJCounter*60+WIDTH/2; j+=60) {
                x0j = j;
                drawHexa(x0j, y0j, side, graphics);
            }
            for (int jNegative = WIDTH/2-10; jNegative > (WIDTH/2-10)-xJCounter*60; jNegative-=60) {
                x0j = jNegative;
                drawHexa(x0j, y0j, side, graphics);
            }
            for (int k = WIDTH/2-40; k < xKCounter*60+(WIDTH/2-40); k+=60) {
                x0k = k;
                drawHexa(x0k, y0k, side, graphics);
            }
            for (int kNegative = WIDTH/2-40; kNegative > WIDTH/2-40-xKCounter*60; kNegative-=60) {
                x0k = kNegative;
                drawHexa(x0k, y0k, side, graphics);
            }
            */
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
