package Drawing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MiddleLines {
  public static void drawImage(Graphics graphics){
    // draw a red horizontal line to the canvas' middle
    graphics.setColor(Color.RED);
    graphics.drawLine(0, 360, 720, 360);
    // draw a green vertical line to the canvas' middle
    graphics.setColor(Color.green);
    graphics.drawLine(360, 0, 360, 720);
  }

  // Don't touch the code below
  static int WIDTH = 720;
  static int HEIGHT = 720;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("MiddleLines");
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