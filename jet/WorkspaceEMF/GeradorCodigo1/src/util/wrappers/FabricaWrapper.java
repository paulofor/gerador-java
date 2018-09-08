package util.wrappers;

import br.com.providerit.gerador.interfaces.ClasseI;

public class FabricaWrapper {

	public static ClasseWrapper criaClasse(ClasseI classe) {
		if (classe.possuiEstereotipo("Funcionalidade")) {
			return new ClasseFuncionalidade(classe);
		} else {
			return new ClasseWrapper(classe);
		}
	}
}
