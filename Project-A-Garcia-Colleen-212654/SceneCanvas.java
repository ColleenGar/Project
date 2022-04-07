import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class SceneCanvas extends JComponent{

  private int width;
  private int height;
  private Color bgColor;
  private square Square;
  private TextCircles tc;
  private circle Moon;
  private Text text;
  private couch c;
  private fountain f;
  private buildings b;
  private clouds c1;
  private clouds c2;
  private clouds c3;
  public SceneCanvas(int w, int h, Color bgc){
    width = w;
    height = h;
    bgColor = bgc;
    c = new couch(400,500,220,90);
    c1 = new clouds(10,60,75,Color.LIGHT_GRAY);
    c2 = new clouds(200,85,90,Color.LIGHT_GRAY);
    c3 = new clouds(400,55,60,Color.LIGHT_GRAY);
    b = new buildings(0,260,190,290);
    setPreferredSize(new Dimension(width, height));
  }

    @Override
    protected void paintComponent(Graphics g){
      Graphics2D g2d = (Graphics2D) g;

      RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
      g2d.setRenderingHints(rh);

      Rectangle2D.Double background = new Rectangle2D.Double(0,0,width,height);
      Color grass = new Color(14, 50, 5);
      Square = new square(0,550,1024,550,grass);
      text = new Text(Color.WHITE);
      Moon = new circle(850,50,100,Color.GRAY);
      f = new fountain();
      tc = new TextCircles();
      g2d.setColor(bgColor);
      g2d.fill(background);

      Square.draw(g2d);
      Moon.draw(g2d);
      c1.draw(g2d);
      c2.draw(g2d);
      c3.draw(g2d);
      b.draw(g2d);
      f.draw(g2d);
      c.draw(g2d);
      text.draw(g2d);
      tc.draw(g2d);
}
      public clouds getClouds(){
        return c1;

      }
    }
