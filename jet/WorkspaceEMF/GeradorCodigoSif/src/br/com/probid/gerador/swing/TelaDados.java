package br.com.probid.gerador.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.probid.gerador.app.Configuracao;
import br.com.probid.gerador.app.LeitorDiagrama;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

public class TelaDados extends JPanel implements ActionListener {

	// Campos de entrada
	private JTextField caminhoGeracao = new JTextField();
	private JTextField umlLeitura = new JTextField();
	
	// Comandos de tela
	private JButton confirmarBtn = new JButton("Ok");
	private JButton salvarBtn = new JButton("Salvar");
	
	// Auxiliares de tela
	private JButton caminhoGeracaoPesquisa = new JButton("Procurar");
	private JButton umlLeituraPesquisa = new JButton("Procurar");
	
	private JFileChooser fc = null;
	Properties propriedades = new Properties();
	
	private void carregaInicializacao() {
		File arqsaida = new File("entrada.properties");
		
		try {
			InputStream entrada = new FileInputStream(arqsaida);
			propriedades.loadFromXML(entrada);
		} catch (Exception e) {
			System.out.println("Erro:" + e);
		}
		caminhoGeracao.setText(propriedades.getProperty("caminhoGeracao"));
		umlLeitura.setText(propriedades.getProperty("umlLeituraPesquisa"));
	}
	
	private void salvaInicializacao() {
		File arqsaida = new File("entrada.properties");
		propriedades.setProperty("caminhoGeracao", caminhoGeracao.getText());
		propriedades.setProperty("umlLeituraPesquisa", umlLeitura.getText());
		try {
			OutputStream saida = new FileOutputStream(arqsaida);
			propriedades.storeToXML(saida,"inicializacao");
		} catch (Exception e) {
			System.out.println("Erro:" + e);
		}
		caminhoGeracao.setText(propriedades.getProperty("caminhoGeracao"));
		umlLeitura.setText(propriedades.getProperty("umlLeituraPesquisa"));
	}
	
	public TelaDados() {
		super(new BorderLayout());

		this.setName("Gerador Java");

		this.confirmarBtn.addActionListener(this);
		this.salvarBtn.addActionListener(this);
		this.caminhoGeracaoPesquisa.addActionListener(this);
		this.umlLeituraPesquisa.addActionListener(this);

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

		builder.append("Arquivo UML:", umlLeitura);
		builder.append(umlLeituraPesquisa);
		builder.nextLine();

		builder.append("Geração dos fontes:", caminhoGeracao);
		builder.append(caminhoGeracaoPesquisa);
		builder.nextLine();


		builder.append(confirmarBtn);
		builder.append(salvarBtn);

		add(builder.getPanel());
		carregaInicializacao();
	}

	public void actionPerformed(ActionEvent e) {

		// Handle open button action.
		if (e.getSource() == confirmarBtn) {
			Configuracao conf = new Configuracao();
			conf.setNomeArquivoStarUml(this.umlLeitura.getText());
			conf.setPathGeracaoClasses(this.caminhoGeracao.getText());
			LeitorDiagrama leitor = new LeitorDiagrama();
			leitor.executaLeitura(conf);
			// Handle save button action.
		} else if (e.getSource() == salvarBtn) {
			this.salvaInicializacao();
		} else if (e.getSource() == caminhoGeracaoPesquisa) {
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				this.caminhoGeracao.setText(file.getAbsolutePath());
			} else {
				// log.append("Save command cancelled by user." + newline);
			}
			// log.setCaretPosition(log.getDocument().getLength());
		} else if (e.getSource() == umlLeituraPesquisa) {
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				this.umlLeitura.setText(file.getAbsolutePath());
			} else {
				// log.append("Save command cancelled by user." + newline);
			}
			// log.setCaretPosition(log.getDocument().getLength());
		} 
	}

	
}
