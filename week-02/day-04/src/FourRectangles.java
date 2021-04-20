import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void drawImage(Graphics graphics) {
    // Draw four different size and color rectangles
    // Avoid code duplication!
    graphics.setColor(new Color(123, 234, 45));
    graphics.drawRect(35, 57, WIDTH / 4, HEIGHT / 6);

    graphics.setColor(new Color(45, 48, 234, 81));
    graphics.drawRect(18, 79, 260, 200);

    graphics.setColor(new Color((int) (Math.random() * 0x15fed37)));
    graphics.drawRect((int) (Math.random() * 320), (int) (Math.random() * 320) - HEIGHT / 10,
        (int) (Math.random() * 320 - WIDTH / 10)
        , (int) (Math.random() * 320));

    graphics.setColor(new Color(0xD50C45));
    graphics.drawRect(WIDTH / 3, WIDTH / 3, WIDTH / 3, WIDTH / 3);
  }

//solution with for loop and MAth.random....

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

