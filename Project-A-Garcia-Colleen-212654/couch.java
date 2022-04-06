import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class couch implements DrawingObject{
  private double x;
  private double y;
  private double width;
  private double height;

  public couch(double x, double y, double width, double height){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public void draw(Graphics2D g2d){
    Rectangle2D.Double r1 = new Rectangle2D.Double(x,y,width,height);
    g2d.setColor(new Color(146,72,15));
    g2d.fill(r1);

    Rectangle2D.Double r2 = new Rectangle2D.Double(x-width*.08,y+height*.48,width*.125,height*.6);
    g2d.setColor(new Color(74,34,0));
    g2d.fill(r2);

    Rectangle2D.Double r3 = new Rectangle2D.Double(x+width*.95,y+height*.48,width*.125,height*.6);
    g2d.setColor(new Color(74,34,0));
    g2d.fill(r3);

    Rectangle2D.Double r4 = new Rectangle2D.Double(x-width*.03,y+height*.84,width*1.05,height*.4);
    g2d.setColor(new Color(74,34,0));
    g2d.fill(r4);



  }

}
