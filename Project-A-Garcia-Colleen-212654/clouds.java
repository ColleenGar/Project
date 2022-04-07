import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;

public class clouds implements DrawingObject{
  private circle Circle;
  private circle Circle2;
  private circle Circle3;
  private circle Circle4;
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
    Circle = new circle(x,y,size,color);
    Circle2 = new circle(x+size*.35, y-size*.6, size*1.75, Color.LIGHT_GRAY);
    Circle3 = new circle(x+size*1.5, y-size*.15, size*.9, Color.LIGHT_GRAY);
    Circle4 = new circle(x+size*1.8, y-size*.15, size*.3, Color.LIGHT_GRAY);

    Circle.draw(g2d);
    Circle2.draw(g2d);
    Circle3.draw(g2d);
    Circle4.draw(g2d);
  }

  public void moveC(double n){
    x += n;
  }

}
