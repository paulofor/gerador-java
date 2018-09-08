package util.wrappers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import uml.FacadeUml;
import uml.UMLAttribute;
import uml.UMLClass;
import util.FormataTexto;

public class ClassWrapper {

	public static String APLICACAO_PATH = "cbpi/aac/";
	public static String APLICACAO_PACOTE = "cbpi.aac.";
	private EClass classe= null;
	private FormataTexto formatador;
	private EPackage pacote = null;
	
	private List<AttributeWrapper> listaAtributos;
	private List<AttributeWrapper> listaNaoChave;
	private List<AttributeWrapper> listaChave;
	
	public List<AttributeWrapper> getListaAtributo() {
		return listaAtributos;
	}
	public List<AttributeWrapper> getListaChave() {
		return listaChave;
	}
	public List<AttributeWrapper> getListaNaoChave() {
		return listaNaoChave;
	}
	
	private void populaListaAtributos() {
		listaAtributos = new ArrayList<AttributeWrapper>();
		listaChave = new ArrayList<AttributeWrapper>();
		listaNaoChave = new ArrayList<AttributeWrapper>();
		UMLClass umlClasse = FacadeUml.getClasseUml(classe.getName());
		if (umlClasse==null) return;
		UMLAttribute umlAtributo = null;
		for (EAttribute item : getEAttributes()) {
			umlAtributo = umlClasse.getPorNome(item.getName());
			AttributeWrapper atributo = new AttributeWrapper();
			atributo.setAtributo(item);
			atributo.setNomeBD(umlAtributo.getEstereotipo());
			listaAtributos.add(atributo);
			if (umlAtributo.ehChave()) {
				listaChave.add(atributo);
			} else {
				listaNaoChave.add(atributo);
			}
		}
	}
	
	private String nomeTabela;
	
	public void setNomeTabela(String nomeTabela) {
		this.nomeTabela = nomeTabela;
	}
	public String getNomeTabela() {
		return this.nomeTabela;
	}
	
	public void setPacote(EPackage pacote) {
		this.pacote = pacote;
	}
	public EList<EAttribute> getEAttributes() {
		return classe.getEAttributes();
	}
	
	public void setClasse(EClass classe) {
		this.classe = classe;
		this.formatador = new FormataTexto();
		populaListaAtributos();
	}
	
	public static String getPacoteReferencias() {
		return APLICACAO_PACOTE;
	}
	
	public String getPacoteUtil() {
		return APLICACAO_PACOTE + ".util";
	}
	/*
	 * ModeloVo 
	 */
	public static String getPathModeloVo() {
		return APLICACAO_PATH + "/modelo/vo/impl";
	}
	public String getPacoteModeloVo() {
		return APLICACAO_PACOTE + ".modelo.vo.impl";
	}
	public String getNomeModeloVo() {
		return classe.getName() + "Vo";
	}
	
	/*
	 * ModeloI
	 */
	public static String getPathModeloI() {
		return APLICACAO_PATH + "/gerador/modelo";
	}
	public String getPacoteModeloI() {
		return APLICACAO_PACOTE + ".gerador.modelo";
	}
	public String getNomeModeloI() {
		return classe.getName() + "I";
	}
	/*
	 * Derivada 
	 */
	public static String getPathDerivada() {
		return APLICACAO_PATH + "/modelo/vo/derivada/impl";
	}
	public String getPacoteDerivada() {
		return APLICACAO_PACOTE + ".modelo.vo.derivada.impl";
	}
	public String getNomeDerivada() {
		return classe.getName() + "Derivada";
	}
	
	/*
	 * DerivadaI
	 */
	public static String getPathDerivadaI() {
		return APLICACAO_PATH + "/modelo/vo/derivada";
	}
	public String getPacoteDerivadaI() {
		return APLICACAO_PACOTE + ".modelo.vo.derivada";
	}
	public String getNomeDerivadaI() {
		return classe.getName() + "DerivadaI";
	}
	
	
	/*
	 *  AssembledI
	 */
	public static String getPathAssembledI() {
		return APLICACAO_PATH + "/gerador/modelo/vo/assembled";
	}
	public String getPacoteAssembledI() {
		return APLICACAO_PACOTE + ".gerador.modelo.vo.assembled";
	}
	public String getNomeAssembledI() {
		return classe.getName() + "AssembledI";
	}
	
	/*
	 *  AssembledVo
	 */
	public static String getPathAssembledVo() {
		return APLICACAO_PATH + "/gerador/modelo/vo/assembled/impl";
	}
	public String getPacoteAssembledVo() {
		return APLICACAO_PACOTE + ".gerador.modelo.vo.assembled.impl";
	}
	public String getNomeAssembledVo() {
		return classe.getName() + "AssembledVo";
	}
	
	/*
	 *  DaoI
	 */
	public static String getPathDaoI() {
		return APLICACAO_PATH + "/modelo/acesso";
	}
	public String getPacoteDaoI() {
		return APLICACAO_PACOTE + ".modelo.acesso";
	}
	public String getNomeDaoI() {
		return classe.getName() + "Dao";
	}
	
	/*
	 *  DaoOracle
	 */
	public static String getPathOracleDao() {
		return APLICACAO_PATH + "/modelo/acesso/oracle";
	}
	public String getPacoteOracleDao() {
		return APLICACAO_PACOTE + ".modelo.acesso.oracle";
	}
	public String getNomeOracleDao() {
		return "Oracle" + classe.getName() + "Dao";
	}

	/*
	 *  DaoMySql
	 */
	public static String getPathMySqlDao() {
		return APLICACAO_PATH + "/modelo/acesso/mysql";
	}
	public String getPacoteMySqlDao() {
		return APLICACAO_PACOTE + ".modelo.acesso.mysql";
	}
	public String getNomeMySqlDao() {
		return "MySql" + classe.getName() + "Dao";
	}

	
	/*
	 *  Assembler
	 */
	public static String getPathAssembler() {
		return APLICACAO_PATH + "/gerador/modelo/negocio/assembler";
	}
	public String getPacoteAssembler() {
		return APLICACAO_PACOTE + ".gerador.modelo.negocio.assembler";
	}
	public String getNomeAssembler() {
		return classe.getName() + "Assembler";
	}
	
	/*
	 *  AssemblerImpl
	 */
	public static String getPathAssemblerImpl() {
		return APLICACAO_PATH + "/modelo/negocio/assembler/impl";
	}
	public String getPacoteAssemblerImpl() {
		return APLICACAO_PACOTE + ".modelo.negocio.assembler.impl";
	}
	public String getNomeAssemblerImpl() {
		return classe.getName() + "AssemblerImpl";
	}
	
	/*
	 *  ServiceI
	 */
	public static String getPathServiceI() {
		return APLICACAO_PATH + "/gerador/modelo/negocio/service";
	}
	public String getPacoteServiceI() {
		return APLICACAO_PACOTE + ".gerador.modelo.negocio.service";
	}
	public String getNomeServiceI() {
		return classe.getName() + "Service";
	}
	
	/*
	 *  ServiceImpl
	 */
	public static String getPathServiceImpl() {
		return APLICACAO_PATH + "/modelo/negocio/service/impl";
	}
	public String getPacoteServiceImpl() {
		return APLICACAO_PACOTE + ".modelo.negocio.service.impl";
	}
	public String getNomeServiceImpl() {
		return classe.getName() + "ServiceImpl";
	}
	
	/*
	 *  BuilderDao
	 */
	public static String getPathBuilderDao() {
		return APLICACAO_PATH + "/gerador/modelo/acesso/builder";
	}
	public String getPacoteBuilderDao() {
		return APLICACAO_PACOTE + ".gerador.modelo.acesso.builder";
	}
	public String getNomeBuilderDao() {
		return classe.getName() + "BuilderDao";
	}
	/*
	 *  BuilderDaoImpl
	 */
	public static String getPathBuilderDaoImpl() {
		return APLICACAO_PATH + "/modelo/acesso/builder/impl";
	}
	public String getPacoteBuilderDaoImpl() {
		return APLICACAO_PACOTE + ".modelo.acesso.builder.impl";
	}
	public String getNomeBuilderDaoImpl() {
		return classe.getName() + "BuilderDaoImpl";
	}
	
	/*
	 *  ActionComum
	 */
	public static String getPathActionComum() {
		return APLICACAO_PATH + "/visao/action/comum";
	}
	public String getPacoteActionComum() {
		return APLICACAO_PACOTE + ".visao.action.comum";
	}

	
	/*
	 *  ActionAtualizar/Salvar
	 */
	public static String getPathActionAtualizar() {
		return APLICACAO_PATH + "/gerador/visao/action/salvar";
	}
	public String getPacoteActionAtualizar() {
		return APLICACAO_PACOTE + ".gerador.visao.action.salvar";
	}
	public String getNomeActionAtualizar() {
		return classe.getName() + "ActionSalvarBase";
	}
	
	/*
	 *  ActionConsultar
	 */
	public static String getPathActionConsultar() {
		return APLICACAO_PATH + "/visao/action";
	}
	public String getPacoteActionConsultar() {
		return APLICACAO_PACOTE + ".visao.action";
	}
	public String getNomeActionConsultar() {
		return classe.getName() + "ActionConsultar";
	}
	
	/*
	 *  ActionEditar
	 */
	public static String getPathActionEditar() {
		return APLICACAO_PATH + "/gerador/visao/action/editar";
	}
	public String getPacoteActionEditar() {
		return APLICACAO_PACOTE + ".gerador.visao.action.editar";
	}
	public String getNomeActionEditar() {
		return classe.getName() + "ActionEditarBase";
	}
	
	/*
	 *  ActionPesquisar
	 */
	public static String getPathActionPesquisar() {
		return APLICACAO_PATH + "/gerador/visao/action/pesquisar";
	}
	public String getPacoteActionPesquisar() {
		return APLICACAO_PACOTE + ".gerador.visao.action.pesquisar";
	}
	public String getNomeActionPesquisar() {
		return classe.getName() + "ActionPesquisarBase";
	}
	/*
	 *  ActionVerificarManutencao
	 */
	public static String getPathActionVerificarManutencao() {
		return APLICACAO_PATH + "/gerador/visao/action/verificarmanutencao";
	}
	public String getPacoteActionVerificarManutencao() {
		return APLICACAO_PACOTE + ".gerador.visao.action.verificarmanutencao";
	}
	public String getNomeActionVerificarManutencao() {
		return classe.getName() + "ActionVerificarManutencaoBase";
	}
	
	/*
	 *  ActionTelaInicial
	 */
	public static String getPathActionTelaInicial() {
		return APLICACAO_PATH + "/gerador/visao/action/telainicial";
	}
	public String getPacoteActionTelaInicial() {
		return APLICACAO_PACOTE + ".gerador.visao.action.telainicial";
	}
	public String getNomeActionTelaInicial() {
		return classe.getName() + "ActionTelaInicialBase";
	}
	
	/*
	 *  FormBean
	 */
	public static String getPathFormBean() {
		return APLICACAO_PATH + "/gerador/visao/form";
	}
	public String getPacoteFormBean() {
		return APLICACAO_PACOTE + ".gerador.visao.form";
	}
	public String getNomeFormBean() {
		return classe.getName() + "FormBeanBase";
	}
	
	/*
	 *  FormBeanImpl
	 */
	public static String getPathFormBeanImpl() {
		return APLICACAO_PATH + "/visao/form/impl";
	}
	public String getPacoteFormBeanImpl() {
		return APLICACAO_PACOTE + ".visao.form.impl";
	}
	public String getNomeFormBeanImpl() {
		return classe.getName() + "FormBean";
	}
	
	
	/*
	 *  ActionMostraDados
	 */
	public static String getPathActionMostraDados() {
		return APLICACAO_PATH + "/gerador/visao/action/mostradados";
	}
	public String getPacoteActionMostraDados() {
		return APLICACAO_PACOTE + ".gerador.visao.action.mostradados";
	}
	public String getNomeActionMostraDados() {
		return classe.getName() + "ActionMostraDadosBase";
	}
	/*
	 *  ActionCadastrar
	 */
	public static String getPathActionCadastrar() {
		return APLICACAO_PATH + "/gerador/visao/action/cadastrar";
	}
	public String getPacoteActionCadastrar() {
		return APLICACAO_PACOTE + ".gerador.visao.action.cadastrar";
	}
	public String getNomeActionCadastrar() {
		return classe.getName() + "ActionCadastrarBase";
	}
	
	
	
	
	public String getSetter() {
		return "set" + this.classe.getName();
	}
	public String getGetter() {
		return "get" + this.classe.getName();
	}
	public String getSetterMultiplo() {
		return "setLista" + this.classe.getName();
	}
	public String getGetterMultiplo() {
		return "getLista" + this.classe.getName();
	}
	
	public String getNomeVariavel() {
		return this.formatador.primeiraMinuscula(this.classe.getName());
	}
	public String getMetodoAssemblerCarrega() {
		return "carrega" + this.classe.getName();
	}
	public String getNomeSimples() {
		return this.classe.getName();
	}
	
	public ClassWrapper getSuperTipo() {
		List lista = this.classe.getESuperTypes();
		if (lista.size()>0) {
			ClassWrapper wrapper = new ClassWrapper();
			wrapper.setClasse((EClass)lista.get(0));
			return wrapper;
		} else {
			return null;
		}
	}
	
	// Relacionamentos onda a classe da extremidade oposta possui multiplicidade 'um'
	public List getReferenceWrappersOpostoUnico() {
		List listaSaida = new LinkedList();
		for (EReference item : classe.getEReferences()) {
			ReferenceWrapper reference = new ReferenceWrapper(item);
			try {
				if (!item.getEOpposite().isMany())
					listaSaida.add(reference);
			} catch (Exception e) {
				System.out.println(" **** Problema no relacionamento entre " + this.getNomeSimples() + " e " + reference.getClasseOposta().getNomeSimples());
				e.printStackTrace();
			}
		}
		return listaSaida;
	}
	
	// Relacionamentos onde a classe da extremidade oposto possui multiplcidade 'várias'
	public List getReferenceWrappersOpostoMultiplo() {
		List listaSaida = new LinkedList();
		for (EReference item : classe.getEReferences()) {
			ReferenceWrapper reference = new ReferenceWrapper(item);
			try {
			if (item.getEOpposite().isMany())
				listaSaida.add(reference);
			} catch (Exception e) {
				System.out.println(" **** Problema no relacionamento entre " + this.getNomeSimples() + " e " + reference.getClasseOposta().getNomeSimples());
				e.printStackTrace();
			}
		}
		return listaSaida;
	}
	
	public boolean possuiAtributos() {
		return (classe.getEAttributes().size()>0);
	}
	
	// Relacionamentos onde a classe da extremidade corrente possui multiplcidade 'um'
	public List getReferenceWrappersUnico() {
		List listaSaida = new LinkedList();
		for (EReference item : classe.getEReferences()) {
			ReferenceWrapper reference = new ReferenceWrapper(item);
			if (!item.isMany())
				listaSaida.add(reference);
		}
		return listaSaida;
	}

	public List getListaSubclasses() {
		EList<EClassifier> listaClassificadores = pacote.getEClassifiers();
		Iterator<EClassifier> iterador = listaClassificadores.iterator();
		ClassWrapper classeWrapper = null;
		List listaSaida = new LinkedList();
		while (iterador.hasNext()) {
			EClass classe = (EClass) iterador.next();
			classeWrapper = new ClassWrapper();
			classeWrapper.setClasse(classe);
			classeWrapper.setPacote(pacote);
			// comparar classWrapper
			if ((classeWrapper.getSuperTipo()!=null) && 
					(classeWrapper.getSuperTipo().getNomeSimples().compareTo(this.getNomeSimples())==0)) {
				listaSaida.add(classeWrapper);
			}
		}
		return listaSaida;
	}
	
	// Relacionamentos onde a classe da extremidade corrente possui multiplcidade 'várias'
	public List getReferenceWrappersMultiplo() {
		List listaSaida = new LinkedList();
		for (EReference item : classe.getEReferences()) {
			ReferenceWrapper reference = new ReferenceWrapper(item);
			if (item.isMany())
				listaSaida.add(reference);
		}
		return listaSaida;
	}
	
	public boolean existeTipoData() {
		AttributeWrapper atributo = new AttributeWrapper();
		for (EAttribute item: classe.getEAttributes()) {
			atributo.setAtributo(item);
			if (atributo.getTipo().compareTo("Date")==0) 
				return true;
		}
		return false;
	}
	
	public boolean ehAssociativa() {
		List listaItens = getReferenceWrappersUnico();
		if (listaItens.size()==2) {
			ReferenceWrapper item1 = (ReferenceWrapper)listaItens.get(0);
			ReferenceWrapper item2 = (ReferenceWrapper)listaItens.get(1);
			if (item1.isManyLadoOposto() && item2.isManyLadoOposto()) 
				return true;
		}
		return false;
	}
	
	public String parametrosParaAssociativa() {
		StringBuffer parametros = new StringBuffer();
		List listaItens = this.getReferenceWrappersUnico();
		Iterator iterador = listaItens.iterator();
		boolean primeiro = true;
		while (iterador.hasNext()) {
			ReferenceWrapper referencia = (ReferenceWrapper) iterador.next();
			if (!primeiro) {
				parametros.append("," + referencia.declaracaoParametro());
			} else {
				parametros.append(referencia.declaracaoParametro());
				primeiro = false;
			}
		}
		return parametros.toString();
	}
	
}
