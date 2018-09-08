package br.com.probid.gerador.app;

import javax.swing.JFrame;

import br.com.probid.gerador.swing.TelaDados;

public class GeraCodigo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  JFrame f = new JFrame("Gerador Java - Probid");
	      f.setDefaultCloseOperation(2);
	      f.add(new TelaDados());
	      f.pack();
	      f.setVisible(true);
	}

}
