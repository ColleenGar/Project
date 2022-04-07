import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;

public class SceneFrame{

  private JFrame frame;
  private JButton button;
  private SceneCanvas sceneCanvas;

  public SceneFrame(){
    frame = new JFrame();
    button = new JButton("TOUCH ME");
    sceneCanvas = new SceneCanvas(1024,768,Color.BLACK);

  }


  public void setUpGUI(){
    Container cp = frame.getContentPane();
    second s = new second();
    frame.setTitle("F R I E N D S");
    frame.add(s);

    cp.add(sceneCanvas, BorderLayout.CENTER);
    cp.add(button, BorderLayout.SOUTH);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}
  public class second extends JPanel implements ActionListener{
    Timer t = new Timer(5, this);

    @Override
    public void actionPerformed(ActionEvent e){
      t.start();
      sceneCanvas.getClouds().moveC(3);
      sceneCanvas.repaint();

  }
}

}
