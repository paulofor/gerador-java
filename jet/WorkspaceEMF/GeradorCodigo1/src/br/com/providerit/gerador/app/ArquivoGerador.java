package br.com.providerit.gerador.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoGerador {

	
	private String nomeArquivo = null;
	private String caminhoArquivo = null;
	private String conteudoArquivo = null;
	
	public void setNomeArquivo(String nome) {
		nomeArquivo = nome;
	}
	public void setCaminhoArquivo(String caminho) {
		caminhoArquivo = caminho;
	}
	public void setConteudoArquivo(String conteudo) {
		conteudoArquivo = conteudo;
	}
	
	public void salvaAquivo() throws IOException{
		String nomeCompleto = caminhoArquivo + File.separator + nomeArquivo;
		System.out.println("Vai criar classe em " + nomeCompleto);
		FileWriter arquivo = new FileWriter(nomeCompleto);
		arquivo.write(conteudoArquivo);
		arquivo.close();
	}
	
	public void criaCaminho() throws IOException {
		File caminho = new File(caminhoArquivo);
		caminho.mkdirs();
	}
	
}
