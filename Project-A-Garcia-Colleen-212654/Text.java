import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Text implements DrawingObject{
  private Color color;

  public Text(Color color){
    this.color = color;
  }
  public void draw(Graphics2D g2d){
    Font font = new Font("Comic Sans MS", Font.PLAIN, 60);
    g2d.setColor(color);
    g2d.setFont(font);
    g2d.drawString("F  R  I  E  N  D  S", 270, 270);


  }

}
