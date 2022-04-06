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
    frame.setTitle("F R I E N D S");

    cp.add(sceneCanvas, BorderLayout.CENTER);
    cp.add(button, BorderLayout.SOUTH);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}

  public void setUpBottonListener(){
    ButtonListener bl = new ButtonListener();
    button.addActionListener(bl);
  }

  private class ButtonListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
      sceneCanvas.getClouds().moveC(20);
      sceneCanvas.repaint();
    }
  }
}
