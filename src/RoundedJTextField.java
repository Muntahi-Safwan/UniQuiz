package src;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

// implement a round-shaped JTextField
public class RoundedJTextField extends JTextField {
   public Shape shape;
   public RoundedJTextField(int size) {
   super(size);
   setOpaque(false);
}
public void paintComponent(Graphics g) {
   g.setColor(getBackground());
   g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 35, 35);
   super.paintComponent(g);
}
public void paintBorder(Graphics g) {
   g.setColor(new Color(0xB8E4FA));
   g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 35, 35);
}
public boolean contains(int x, int y) {
   if (shape == null || !shape.getBounds().equals(getBounds())) {
      shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 35, 35);
   }
   return shape.contains(x, y);
   }
}