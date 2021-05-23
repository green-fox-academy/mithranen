package Drawing;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles2 {

  public static void drawImage(Graphics graphics){
    // Draw four different size and color rectangles
    // Avoid code duplication!

    for (int i = 0; i < 100; i++) {
      drawRndRectangle(graphics);
    }
  }


  public static void drawRndRectangle(Graphics graphics){

    int a = rgbFiller();
    int b = rgbFiller();
    int c = rgbFiller();

    int x = positionGiver();
    int y = positionGiver();
    int width = positionGiver();
    int height = positionGiver();

    graphics.setColor(new Color(a, b, c));
    graphics.fillRect(x, y, width, height);

    System.out.println("HELLO!!!!!!!!!!!!!!!!!!444");

  }

  public static int rgbFiller(){

    int rgb = (int) (Math.random()*256);

    return rgb;

  }

  public static int positionGiver(){

    int pos = (int) (Math.random()*321);

    return pos;

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