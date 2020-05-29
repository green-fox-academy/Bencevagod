import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class GoToCenter2 {
    public static void mainDraw(Graphics graphics) {
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
            graphics.drawLine(5, 0, xCoordinates.get(i), 0);
        }
    }
        public static int eitherRandom () {
            //Random r = new Random();
            return Math.random() >= 0.5? 0 : 320;
        }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        GoToCenter2.ImagePanel panel = new GoToCenter2.ImagePanel();
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
