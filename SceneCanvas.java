import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class SceneCanvas extends JComponent{

  private int width;
  private int height;
  private Color bgColor;
  private square Square;
  private circle Circle;
  private circle Circle2;
  private circle Circle3;
  private circle Circle4;
  private circle Circle5;
  private circle Circle6;
  private circle Moon;
  private Text text;
  private couch c;
  private fountain f;
  private buildings b;
  private lamp l;
  private clouds c1;
  private clouds c2;

  Color grass = new Color(14, 50, 5);

  public SceneCanvas(int w, int h, Color bgc){
    width = w;
    height = h;
    bgColor = bgc;
    c = new couch(355,450,320,125);
    c1 = new clouds(10,50,75,Color.LIGHT_GRAY);
    setPreferredSize(new Dimension(width, height));
  }

    @Override
    protected void paintComponent(Graphics g){
      Graphics2D g2d = (Graphics2D) g;

      RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
      g2d.setRenderingHints(rh);

      Rectangle2D.Double background = new Rectangle2D.Double(0,0,width,height);
      Square = new square(0,550,1500,grass);
      text = new Text(Color.WHITE);
      Circle = new circle(311,237,14,Color.RED);
      Circle2 = new circle(390,237,14,Color.CYAN);
      Circle3 = new circle(460,237,14,Color.YELLOW);
      Circle4 = new circle(530,237,14,Color.RED);
      Circle5 = new circle(615,237,14,Color.YELLOW);
      Circle6 = new circle(700,237,14,Color.CYAN);
      Moon = new circle(850,50,100,Color.GRAY);
      f = new fountain();
      b = new buildings();
      l = new lamp();
      c2 = new clouds(200,75,90,Color.LIGHT_GRAY);
      g2d.setColor(bgColor);
      g2d.fill(background);

      Square.draw(g2d);
      Moon.draw(g2d);
      c1.draw(g2d);
      c2.draw(g2d);
      b.draw(g2d);
      Circle.draw(g2d);
      Circle2.draw(g2d);
      Circle3.draw(g2d);
      Circle4.draw(g2d);
      Circle5.draw(g2d);
      Circle6.draw(g2d);
      f.draw(g2d);
      c.draw(g2d);
      text.draw(g2d);
}
      public clouds getClouds(){
        return c1;
      }
    }
