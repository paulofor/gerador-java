package app;

import exemplo.ServicoTeste;
import exemplo.ServicoTesteServiceLocator;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServicoTesteServiceLocator locator = new ServicoTesteServiceLocator();
			ServicoTeste servico = locator.getServicoTestePort();
			String nome = servico.obtemNome();
			System.out.println("Nome:" + nome);
			String resultadoNum = servico.recebeNumero(1009);
			System.out.println("Resultado:" + resultadoNum);
		} catch (Exception e) {
			System.out.println("Erro");
		}
	}

}
