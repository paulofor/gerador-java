import java.awt.Container;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
 
public class JPanelExample {
  
  JButton openButton, saveButton;
  JTextArea log;
  JFileChooser fc;
	
  public static void main(String[] args) {
    JFrame frame1=new JFrame("Creating a Jframe and using JPanel JComponent");
    frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
    frame1.setSize(400,200);
    
    Container c=new SwingFileChooserDemo();    
 
    
    frame1.getContentPane().add(c);
    
    frame1.show();
    
  }
  

}

