import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class line implements DrawingObject{
  private double x;
  private double y;
  private double size;
  private Color color;

  public line(double x, double y, double size, Color color){
    this.x = x;
    this.y = y;
    this.size = size;
    this.color = color;
  }
  public void draw(Graphics2D g2d){


  }

}
