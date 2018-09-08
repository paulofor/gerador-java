
/*
Code revised from Desktop Java Live:
http://www.sourcebeat.com/downloads/
*/


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

public class DefaultFormBuilderExample1 extends JPanel implements ActionListener {
	JButton openButton, saveButton;
	JFileChooser fc;
	
	JButton pathBtn = new JButton("Procurar");
  	JButton pacoteBtn = new JButton("Procurar");
  	JButton aplicacaoBtn = new JButton("Procurar");
  	JButton mdlBtn = new JButton("Procurar");
  	JButton ecoreBtn = new JButton("Procurar");
  	JButton umlBtn = new JButton("Procurar");
  	
  	JButton confirmarBtn = new JButton("Ok");
  	JButton salvarBtn = new JButton("Salvar");
  	
  	JTextField path = new JTextField();
  	JTextField pacote = new JTextField();
  	JTextField aplicacao = new JTextField();
  	JTextField mdl = new JTextField();
  	JTextField ecore = new JTextField();
  	JTextField uml = new JTextField();
  	
  	OutputStream saida;
  	InputStream entrada;

  	
  	private void carregaArquivo() {
  		File arqsaida = new File("teste.prop");
      	try {
      		saida = new FileOutputStream(arqsaida,false);
      		entrada = new FileInputStream(arqsaida);
      	} catch (FileNotFoundException e) {
      		System.out.println("Arquivo não encontrado");
      	}
  	}
	
    public DefaultFormBuilderExample1() {
      super(new BorderLayout());
      
      	
      	
      	this.setName("Gerador Java");
  
      	this.mdlBtn.addActionListener(this);
      	this.ecoreBtn.addActionListener(this);
      	this.umlBtn.addActionListener(this);
      	this.pathBtn.addActionListener(this);
      
      	this.salvarBtn.addActionListener(this);
        	
      	fc = new JFileChooser();
      	
      
        DefaultFormBuilder builder = new DefaultFormBuilder(new FormLayout(""));
        builder.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        builder.appendColumn("right:pref");
        builder.appendColumn("3dlu");
        builder.appendColumn("fill:max(pref; 620px)");
        builder.appendColumn("5dlu");
        builder.appendColumn("right:pref");
        builder.appendColumn("3dlu");
        builder.appendColumn("fill:max(pref; 80px)");

        builder.appendSeparator("Configurações");
        
        builder.append("Path:", path);
        builder.append(pathBtn);
        builder.nextLine();

        builder.append("Nome pacote:", pacote);
        //builder.append(pacoteBtn);
        builder.nextLine();

        builder.append("Nome aplicação:", aplicacao);
        //builder.append(aplicacaoBtn);
        builder.nextLine();
        
        builder.appendSeparator("Arquivos Entrada");

        builder.append("mdl:", mdl);
        builder.append(mdlBtn);
        builder.nextLine();

        builder.append("ecore:", ecore);
        builder.append(ecoreBtn);
        builder.nextLine();

        builder.append("uml:", uml);
        builder.append(umlBtn);
        builder.nextLine();
        
        builder.append(confirmarBtn);
        builder.append(salvarBtn);

        add(builder.getPanel());
        carregaInicializacao();
    }
    
    public void actionPerformed(ActionEvent e) {

        //Handle open button action.
        if (e.getSource() == ecoreBtn) {
          int returnVal = fc.showOpenDialog(DefaultFormBuilderExample1.this);

          if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            this.ecore.setText(file.getAbsolutePath());

           } else {
            //log.append("Open command cancelled by user." + newline);
          }
          //log.setCaretPosition(log.getDocument().getLength());

          //Handle save button action.
        } else if (e.getSource() == mdlBtn) {
          int returnVal = fc.showSaveDialog(this);
          if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            this.mdl.setText(file.getAbsolutePath());
            //This is where a real application would save the file.
            //log.append("Saving: " + file.getName() + "." + newline);
          } else {
            //log.append("Save command cancelled by user." + newline);
          }
          //log.setCaretPosition(log.getDocument().getLength());
        } else if (e.getSource() == umlBtn) {
            int returnVal = fc.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
              File file = fc.getSelectedFile();
              this.uml.setText(file.getAbsolutePath());
              //This is where a real application would save the file.
              //log.append("Saving: " + file.getName() + "." + newline);
            } else {
              //log.append("Save command cancelled by user." + newline);
            }
            //log.setCaretPosition(log.getDocument().getLength());
        } else if (e.getSource() == pathBtn) {
            int returnVal = fc.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
              File file = fc.getSelectedFile();
              this.path.setText(file.getAbsolutePath());
              //This is where a real application would save the file.
              //log.append("Saving: " + file.getName() + "." + newline);
            } else {
              //log.append("Save command cancelled by user." + newline);
            }
            //log.setCaretPosition(log.getDocument().getLength());
        } else if (e.getSource() == salvarBtn) {
        	Properties propriedades = new Properties();
        	propriedades.setProperty("path", path.getText());
        	propriedades.setProperty("uml", uml.getText());
        	propriedades.setProperty("mdl", mdl.getText());
        	propriedades.setProperty("ecore", ecore.getText());
        
        	try {
        		propriedades.storeToXML(saida, "");
        	} catch (Exception e2) {
        		System.out.println("Erro");
        	}
            //log.setCaretPosition(log.getDocument().getLength());
          }
      }

     private void carregaInicializacao() {
    	 this.carregaArquivo();
    	 Properties propriedades = new Properties();
    	 try {
    		 propriedades.loadFromXML(entrada);
    	 } catch (Exception e) {
    		 System.out.println("Erro:" + e);
    	 }
    	 path.setText(propriedades.getProperty("path"));
    	 uml.setText(propriedades.getProperty("uml"));
    	 mdl.setText(propriedades.getProperty("mdl"));
    	 ecore.setText(propriedades.getProperty("ecore"));
     }

    public static void main(String[] a){
      JFrame f = new JFrame("Gerador Java - Ipiranga");
      f.setDefaultCloseOperation(2);
      f.add(new DefaultFormBuilderExample1());
      f.pack();
      f.setVisible(true);
    }
}



