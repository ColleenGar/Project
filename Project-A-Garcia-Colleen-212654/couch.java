import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class couch implements DrawingObject{
  private double x;
  private double y;
  private double width;
  private double height;
  private square Square;
  private square Square2;
  private square Square3;
  private square Square4;
  private circle Circle;
  private circle Circle2;
  private line Line;

  public couch(double x, double y, double width, double height){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public void draw(Graphics2D g2d){
    Color brown = new Color(146,72,15);
    Color brown2 = new Color(74,34,0);
    Square = new square(x,y,width,height,brown);
    Square2 = new square(x-width*.08,y+height*.48,width*.125,height*.6,brown2);
    Square3 = new square(x+width*.95,y+height*.48,width*.125,height*.6,brown2);
    Square4 = new square(x-width*.03,y+height*.84,width*1.05,height*.4,brown2);
    Line = new line(510,505,510,580,brown2);


    Square.draw(g2d);
    Square2.draw(g2d);
    Square3.draw(g2d);
    Square4.draw(g2d);
    Line.draw(g2d);


  }

}
