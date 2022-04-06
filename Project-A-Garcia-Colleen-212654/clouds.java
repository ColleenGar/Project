import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;

public class clouds implements DrawingObject{
  private double x;
  private double y;
  private double size;
  private Color color;

  public clouds(double x, double y, double size, Color color){
    this.x = x;
    this.y = y;
    this.size = size;
    this.color = color;
  }

  public void draw(Graphics2D g2d){
    Ellipse2D.Double c1 = new Ellipse2D.Double(x,y,size,size);
    Ellipse2D.Double c2 = new Ellipse2D.Double(x+size*.35, y-size*.2, size*1.75, size*1.4);
    Ellipse2D.Double c3 = new Ellipse2D.Double(x+size*1.5, y-size*.15, size*.9, size*.9);
    Ellipse2D.Double c4 = new Ellipse2D.Double(x+size*1.8, y-size*.05, size*.3, size*.3);

    g2d.setColor(color);
    g2d.fill(c1);
    g2d.fill(c2);
    g2d.fill(c3);
    g2d.fill(c4);
  }

  public void moveC(double n){
    x += n;
  }

}
