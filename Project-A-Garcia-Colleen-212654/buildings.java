import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class buildings implements DrawingObject{

  public void draw(Graphics2D g2d){

    Rectangle2D.Double r1 = new Rectangle2D.Double(0,220,200,300);
    g2d.setColor(new Color(57,56,48));
    g2d.fill(r1);

    Rectangle2D.Double r2 = new Rectangle2D.Double(200,110,200,450);
    g2d.setColor(new Color(95,84,63));
    g2d.fill(r2);

    Rectangle2D.Double r3 = new Rectangle2D.Double(220,150,35,50);
    g2d.setColor(Color.BLACK);
    g2d.fill(r3);

    Rectangle2D.Double r4 = new Rectangle2D.Double(285,150,35,50);
    g2d.setColor(Color.YELLOW);
    g2d.fill(r4);

    Rectangle2D.Double r5 = new Rectangle2D.Double(345,150,35,50);
    g2d.setColor(Color.BLACK);
    g2d.fill(r5);

    Rectangle2D.Double r6 = new Rectangle2D.Double(220,250,35,70);
    g2d.setColor(Color.YELLOW);
    g2d.fill(r6);

    Rectangle2D.Double r7 = new Rectangle2D.Double(285,250,35,70);
    g2d.setColor(Color.BLACK);
    g2d.fill(r7);

    Rectangle2D.Double r8 = new Rectangle2D.Double(345,250,35,70);
    g2d.setColor(Color.BLACK);
    g2d.fill(r8);

    Rectangle2D.Double r9 = new Rectangle2D.Double(220,350,35,80);
    g2d.setColor(Color.BLACK);
    g2d.fill(r9);

    Rectangle2D.Double r10 = new Rectangle2D.Double(285,350,35,80);
    g2d.setColor(Color.YELLOW);
    g2d.fill(r10);

    Rectangle2D.Double r11 = new Rectangle2D.Double(345,350,35,80);
    g2d.setColor(Color.BLACK);
    g2d.fill(r11);

    Rectangle2D.Double r12 = new Rectangle2D.Double(35,235,50,70);
    g2d.setColor(Color.BLACK);
    g2d.fill(r12);

    Rectangle2D.Double r13 = new Rectangle2D.Double(120,235,50,70);
    g2d.setColor(Color.BLACK);
    g2d.fill(r13);
  }

}
