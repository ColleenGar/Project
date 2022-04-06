import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class square implements DrawingObject{
  private double x;
  private double y;
  private double size;
  private Color color;

  public square(double x, double y, double size, Color color){
    this.x = x;
    this.y = y;
    this.size = size;
    this.color = color;
  }
  public void draw(Graphics2D g2d){
    Rectangle2D.Double r = new Rectangle2D.Double(x, y, size, size);
    g2d.setColor(color);
    g2d.fill(r);


  }

}
