import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class square implements DrawingObject{
  private double x;
  private double y;
  private double width;
  private double height;
  private Color color;

  public square(double x, double y, double width, double height, Color color){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.color = color;
  }
  public void draw(Graphics2D g2d){
    Rectangle2D.Double r = new Rectangle2D.Double(x, y, width, height);
    g2d.setColor(color);
    g2d.fill(r);


  }

}
