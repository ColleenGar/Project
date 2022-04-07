import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class TextCircles implements DrawingObject{
  private circle Circle;
  private circle Circle2;
  private circle Circle3;
  private circle Circle4;
  private circle Circle5;
  private circle Circle6;

  public void draw(Graphics2D g2d){
    Circle = new circle(311,277,14,Color.RED);
    Circle2 = new circle(390,277,14,Color.CYAN);
    Circle3 = new circle(460,277,14,Color.YELLOW);
    Circle4 = new circle(530,277,14,Color.RED);
    Circle5 = new circle(615,277,14,Color.YELLOW);
    Circle6 = new circle(700,277,14,Color.CYAN);

    Circle.draw(g2d);
    Circle2.draw(g2d);
    Circle3.draw(g2d);
    Circle4.draw(g2d);
    Circle5.draw(g2d);
    Circle6.draw(g2d);
}
}
