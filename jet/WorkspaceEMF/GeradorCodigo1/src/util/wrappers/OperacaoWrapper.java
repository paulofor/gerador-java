package util.wrappers;

import java.util.Iterator;
import java.util.List;

import br.com.providerit.gerador.interfaces.ClasseI;
import br.com.providerit.gerador.interfaces.OperacaoI;
import br.com.providerit.gerador.interfaces.ParametroI;

public class OperacaoWrapper {

	private OperacaoI base;
	public OperacaoWrapper() {
		
	}
	public OperacaoWrapper(OperacaoI inicial) {
		base = inicial;
	}
	
	public String getNomeEjb() {
		if (base.getEstereotipo().indexOf("CD")!=-1) return base.obtemClasse().getNome() + "CD";
		if (base.getEstereotipo().indexOf("CN")!=-1) return base.obtemClasse().getNome() + "CN";
		return null;
	}
	
	public String getNome() {
		return base.getNome();
	}
	
	public List listaParametros() {
		return base.getListaParametro();
	}
	
	public ParametroWrapper obtemParametroPorNome(String nome) {
		Iterator itParam = base.getListaParametro().iterator();
		while (itParam.hasNext()) {
			ParametroI param = (ParametroI) itParam.next();
			if (param.getNome().equals(nome)) {
				return new ParametroWrapper(param);
			}
		}
		return null;
	}
	
	public ClasseWrapper obtemTipoClassePorNome(String nome) {
		Iterator itParam = base.getListaParametro().iterator();
		while (itParam.hasNext()) {
			ParametroI param = (ParametroI) itParam.next();
			if (param.getNome().equals(nome)) {
				Object tipoClasse = param.getTipo();
				if (tipoClasse instanceof ClasseI)
					return new ClasseWrapper((ClasseI)tipoClasse);
				else
					return null;
			}
		}
		return null;
	}
}
