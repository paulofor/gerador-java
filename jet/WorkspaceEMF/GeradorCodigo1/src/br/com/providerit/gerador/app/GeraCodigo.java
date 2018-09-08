package br.com.providerit.gerador.app;

import javax.swing.JFrame;

import br.com.providerit.gerador.swing.TelaDados;

public class GeraCodigo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  JFrame f = new JFrame("Gerador Java - Provider-it");
	      f.setDefaultCloseOperation(2);
	      f.add(new TelaDados());
	      f.pack();
	      f.setVisible(true);
	}

}
