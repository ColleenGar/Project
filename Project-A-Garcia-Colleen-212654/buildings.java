import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class buildings implements DrawingObject{
  private double x;
  private double y;
  private double width;
  private double height;
  private square Square;
  private square Square2;
  private square Square3;
  private square Square4;
  private square Square5;
  private square Square6;
  private square Square7;
  private square Square8;
  private square Square9;
  private square Square10;
  private square Square11;
  private square Square12;
  private square Square13;
  private square Square14;
  private square Square15;
  private line Line;
  private line Line2;

  public buildings(double x, double y, double width, double height){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }
  public void draw(Graphics2D g2d){
    Color grey = new Color(57,56,48);
    Color flesh = new Color(95,83,62);

    Square = new square(x,y,width,height,grey);
    Square2 = new square(x+width,y-height*.30,width,height*1.3,flesh);
    Square3 = new square(x+width*1.1,y-height*.23,width*.175,height*.167,Color.BLACK);
    Square4 = new square(x+width*1.425,y-height*.23,width*.175,height*.167,Color.YELLOW);
    Square5 = new square(x+width*1.725,y-height*.23,width*.175,height*.167,Color.BLACK);
    Square6 = new square(x+width*1.1,y+height*0.1,width*.175,height*.233,Color.YELLOW);
    Square7 = new square(x+width*1.425,y+height*0.1,width*.175,height*.233,Color.BLACK);
    Square8 = new square(x+width*1.725,y+height*0.1,width*.175,height*.233,Color.BLACK);
    Square9 = new square(x+width*1.1,y+height*0.47,width*.175,height*.30,Color.BLACK);
    Square10 = new square(x+width*1.425,y+height*0.47,width*.175,height*.30,Color.YELLOW);
    Square11 = new square(x+width*1.725,y+height*0.47,width*.175,height*.30,Color.BLACK);
    Square12 = new square(x+width*.175,y+height*.06,width*.25,height*.233,Color.BLACK);
    Square13 = new square(x+width*.6,y+height*.06,width*.25,height*.233,Color.BLACK);
    Square14 = new square(x,y+height*.4,width*.35,height*.333,Color.YELLOW);
    Square15 = new square(x+width*.6,y+height*.4,width*.25,height*.3,Color.BLACK);
    Line = new line(0,260,185,260,Color.GRAY);
    Line2 = new line(200,170,370,170,Color.GRAY);


    Square.draw(g2d);
    Square2.draw(g2d);
    Square3.draw(g2d);
    Square4.draw(g2d);
    Square5.draw(g2d);
    Square6.draw(g2d);
    Square7.draw(g2d);
    Square8.draw(g2d);
    Square9.draw(g2d);
    Square10.draw(g2d);
    Square11.draw(g2d);
    Square12.draw(g2d);
    Square13.draw(g2d);
    Square14.draw(g2d);
    Square15.draw(g2d);
    Line.draw(g2d);
    Line2.draw(g2d);


  }

}
