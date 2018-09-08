package br.com.probid.gerador.execucao.wrappers;

import br.com.probid.gerador.interfaces.ClasseI;

public class FabricaWrapper {

	public static ClasseWrapper criaClasse(ClasseI classe) {
		if (classe.possuiEstereotipo("Funcionalidade")) {
			return new ClasseFuncionalidade(classe);
		} else {
			return new ClasseWrapper(classe);
		}
	}
}
