import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class lamp implements DrawingObject{

  public void draw(Graphics2D g2d){
    Path2D.Double p = new Path2D.Double();
    p.moveTo(100,300);
    p.lineTo(150,200);
    p.lineTo(200,300);
    p.closePath();
    g2d.fill(p);
}
}
