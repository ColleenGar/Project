import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class fountain implements DrawingObject{

  public void draw(Graphics2D g2d){
    Rectangle2D.Double r1 = new Rectangle2D.Double(150,505,715,70);
    g2d.setColor(new Color(87,77,69));
    g2d.fill(r1);

  }

}
