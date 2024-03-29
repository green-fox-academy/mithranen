package Drawing;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColoredBox {

  public static void drawImage(Graphics graphics) {
    // Draw a box that has different colored lines on each edge
    graphics.drawRect(50, 150, 250, 100);
    graphics.setColor(Color.RED);
    graphics.drawLine(50,150, 300, 150);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(50, 250,300 , 250);
    graphics.setColor(Color.YELLOW);
    graphics.drawLine(50, 150,50 , 250);
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
      drawImage(graphics);
    }
  }
}