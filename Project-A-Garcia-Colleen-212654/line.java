import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class line implements DrawingObject{
  private double x;
  private double y;
  private double x1;
  private double y1;
  private Color color;

  public line(double x, double y, double x1, double y1, Color color){
    this.x = x;
    this.y = y;
    this.x1 = x1;
    this.y1 = y1;
    this.color = color;
  }
  public void draw(Graphics2D g2d){
    Line2D.Double line = new Line2D.Double(x,y,x1,y1);
    g2d.setStroke(new BasicStroke(10));
    g2d.setColor(color);
    g2d.draw(line);


  }

}
