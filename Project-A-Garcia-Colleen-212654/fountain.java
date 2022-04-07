import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class fountain implements DrawingObject{
  private square Square;

  public void draw(Graphics2D g2d){
    Color stone = new Color(87,77,69);

    Square = new square(150,515,715,60,stone);

    Square.draw(g2d);

  }

}
