package aplicacao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import uml.FacadeUml;
import util.Comparador;
import util.wrappers.AplicacaoWrapper;
import util.wrappers.ClassWrapper;

import compiledtemplates.ActionAtualizar;
import compiledtemplates.ActionEditar;
import compiledtemplates.ActionMostraDados;
import compiledtemplates.ActionPesquisar;
import compiledtemplates.ActionTelaInicial;
import compiledtemplates.ActionVerificarManutencao;
import compiledtemplates.AssembledI;
import compiledtemplates.AssembledVo;
import compiledtemplates.Assembler;
import compiledtemplates.AssemblerImpl;
import compiledtemplates.BuilderDao;
import compiledtemplates.BuilderDaoImpl;
import compiledtemplates.DaoI;
import compiledtemplates.Derivada;
import compiledtemplates.DerivadaI;
import compiledtemplates.FormBean;
import compiledtemplates.FormBeanImpl;
import compiledtemplates.ModeloI;
import compiledtemplates.ModeloVo;
import compiledtemplates.OracleDao;
import compiledtemplates.ServiceI;
import compiledtemplates.ServiceImpl;
import compiledtemplates.ServiceLocator;

public class Gerador2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AplicacaoWrapper aplicacao = new AplicacaoWrapper();
		
		aplicacao.setNomeAplicacao("fidelizacao");
		aplicacao.setArquivoEcore("C:/WorkspaceEMF/ImportacaoModelo/model/clearcase.ecore");
		aplicacao.setNomeArquivoUml("C:/Documentos/diagramas/ModeloFidelizacao3.uml");
		aplicacao.setPathWorkspace("C:/ArquivosGeradorWorkspace/");
		aplicacao.setNomeProjetoWorkspace("ProjetoFidelizacao");
		aplicacao.setNomePacote("fidelizacao");

		FacadeUml.setAplicacao(aplicacao);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(URI.createFileURI(aplicacao.getArquivoEcore()),true);
		
		EPackage pacote = (EPackage) resource.getContents().get(0);
		EList<EClassifier> listaClassificadores = pacote.getEClassifiers();
		
		ECollections.sort(pacote.getEClassifiers(), new Comparador());
		ClassWrapper classeWrapper = new ClassWrapper();
		Iterator<EClassifier> iterador = listaClassificadores.iterator();
		
		limpaDiretorio(ClassWrapper.getPathModeloI(), aplicacao);
		limpaDiretorio(ClassWrapper.getPathAssembledI(), aplicacao);
		limpaDiretorio(ClassWrapper.getPathServiceI(), aplicacao);
		limpaDiretorio(ClassWrapper.getPathBuilderDao(), aplicacao);
		limpaDiretorio(ClassWrapper.getPathFormBean(), aplicacao);
		limpaDiretorio(ClassWrapper.getPathActionPesquisar(), aplicacao);
		limpaDiretorio(ClassWrapper.getPathAssembler(), aplicacao);
		limpaDiretorio(ClassWrapper.getPathActionMostraDados(), aplicacao);
		limpaDiretorio(ClassWrapper.getPathActionCadastrar(), aplicacao);
		limpaDiretorio(ClassWrapper.getPathAssembledVo(), aplicacao);
		limpaDiretorio(ClassWrapper.getPathActionEditar(), aplicacao);
		limpaDiretorio(ClassWrapper.getPathActionVerificarManutencao(), aplicacao);
		limpaDiretorio(ClassWrapper.getPathActionAtualizar(), aplicacao);
		limpaDiretorio(ClassWrapper.getPathActionTelaInicial(), aplicacao);

		
		try{
			String saida = ServiceLocator.create("\n").generate(pacote);
			geraArquivoFonte(saida,aplicacao, ClassWrapper.getPathServiceI() + "/ServiceLocator");
			
			//saida = HtmlClassesEntidade.create("\n").generate(pacote);
			//geraArquivoDocumentoHtml(saida,aplicacao,"/ClassesEntidades");

			
		} catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		while (iterador.hasNext()) {
			EClass classe = (EClass) iterador.next();
			classeWrapper.setClasse(classe);
			classeWrapper.setPacote(pacote);

			
			System.out.println("Gerando " + classe.getName() + "...");
			String saida;
			
			try{
				//Cria sempre os arquivos
				//if (classeWrapper.possuiAtributos()) {
				saida = ServiceI.create("\n").generate(classe);
				geraArquivoFonte(saida,aplicacao, classeWrapper.getPathServiceI() + "/" + classeWrapper.getNomeServiceI());
				//}

				
				//Cria sempre os arquivos
				//if (classeWrapper.possuiAtributos()) {
				saida = ModeloI.create("\n").generate(classe);
				geraArquivoFonte(saida,aplicacao, classeWrapper.getPathModeloI() + "/" + classeWrapper.getNomeModeloI());
				//}
					
				//Cria sempre os arquivos
				//if (classeWrapper.possuiAtributos()) {
				saida = AssembledI.create("\n").generate(classe);
				geraArquivoFonte(saida,aplicacao, classeWrapper.getPathAssembledI() + "/" + classeWrapper.getNomeAssembledI());
				//}
				
				//Cria sempre os arquivos
				//if (classeWrapper.possuiAtributos()) {
				saida = AssembledVo.create("\n").generate(classe);
				geraArquivoFonte(saida,aplicacao, classeWrapper.getPathAssembledVo() + "/" + classeWrapper.getNomeAssembledVo());
				//}
				
				//Cria sempre os arquivos
				if (classeWrapper.possuiAtributos()) {
					saida = Assembler.create("\n").generate(classe);
					geraArquivoFonte(saida,aplicacao, classeWrapper.getPathAssembler() + "/" + classeWrapper.getNomeAssembler());
				}
				
				//Cria sempre os arquivos
				if (classeWrapper.possuiAtributos()) {
					saida = FormBean.create("\n").generate(classe);
					geraArquivoFonte(saida,aplicacao, classeWrapper.getPathFormBean() + "/" + classeWrapper.getNomeFormBean());
				}	
				
				//Cria sempre os arquivos
				if (classeWrapper.possuiAtributos()) {
					saida = ActionPesquisar.create("\n").generate(classe);
					geraArquivoFonte(saida,aplicacao, classeWrapper.getPathActionPesquisar() + "/" + classeWrapper.getNomeActionPesquisar());
				}
				
				//Cria sempre os arquivos
				if (classeWrapper.possuiAtributos()) {
					saida = ActionEditar.create("\n").generate(classe);
					geraArquivoFonte(saida,aplicacao, classeWrapper.getPathActionEditar() + "/" + classeWrapper.getNomeActionEditar());
				}
				
				//Cria sempre os arquivos
				//if (classeWrapper.possuiAtributos()) {
					saida = BuilderDao.create("\n").generate(classeWrapper);
					geraArquivoFonte(saida,aplicacao, classeWrapper.getPathBuilderDao() + "/" + classeWrapper.getNomeBuilderDao());
				//}
				
				//Cria sempre os arquivos
				if (classeWrapper.possuiAtributos()) {
					saida = ActionMostraDados.create("\n").generate(classe);
					geraArquivoFonte(saida,aplicacao, classeWrapper.getPathActionMostraDados() + "/" + classeWrapper.getNomeActionMostraDados());
				}	

				//Cria sempre os arquivos
				if (classeWrapper.possuiAtributos()) {
					saida = ActionTelaInicial.create("\n").generate(classe);
					geraArquivoFonte(saida,aplicacao, classeWrapper.getPathActionTelaInicial() + "/" + classeWrapper.getNomeActionTelaInicial());
				}
				//Cria sempre os arquivos
				if (classeWrapper.possuiAtributos()) {
					saida = ActionAtualizar.create("\n").generate(classe);
					geraArquivoFonte(saida,aplicacao, classeWrapper.getPathActionAtualizar() + "/" + classeWrapper.getNomeActionAtualizar());
				}
				
				//Cria sempre os arquivos
				if (classeWrapper.possuiAtributos()) {
					saida = ActionEditar.create("\n").generate(classe);
					geraArquivoFonte(saida,aplicacao, classeWrapper.getPathActionEditar() + "/" + classeWrapper.getNomeActionEditar());
				}
				//Cria sempre os arquivos
				if (classeWrapper.possuiAtributos()) {
					saida = ActionVerificarManutencao.create("\n").generate(classe);
					geraArquivoFonte(saida,aplicacao, classeWrapper.getPathActionVerificarManutencao() + "/" + classeWrapper.getNomeActionVerificarManutencao());
				}
				
				//Cria arquivos caso eles não existam
				if (classeWrapper.possuiAtributos()) {
					saida = AssemblerImpl.create("\n").generate(classe);
					geraArquivoFonteInicial(saida,aplicacao, classeWrapper.getPathAssemblerImpl() + "/" + classeWrapper.getNomeAssemblerImpl());
				}
				
				//Cria arquivos caso eles não existam
				if (classeWrapper.possuiAtributos()) {
					saida = DaoI.create("\n").generate(classe);
					geraArquivoFonteInicial(saida,aplicacao, classeWrapper.getPathDaoI() + "/" + classeWrapper.getNomeDaoI());
				}
				
				//Cria arquivos caso eles não existam
				//if (classeWrapper.possuiAtributos()) {
				saida = ServiceImpl.create("\n").generate(classe);
				geraArquivoFonteInicial(saida,aplicacao, classeWrapper.getPathServiceImpl() + "/" + classeWrapper.getNomeServiceImpl());
				//}
				
				//Cria arquivos caso eles não existam
				if (classeWrapper.possuiAtributos()) {
					saida = OracleDao.create("\n").generate(classe);
					geraArquivoFonteInicial(saida,aplicacao, classeWrapper.getPathOracleDao() + "/" + classeWrapper.getNomeOracleDao());
				}

				//Cria arquivos caso eles não existam
				//if (classeWrapper.possuiAtributos()) {
					saida = BuilderDaoImpl.create("\n").generate(classe);
					geraArquivoFonteInicial(saida,aplicacao, classeWrapper.getPathBuilderDaoImpl() + "/" + classeWrapper.getNomeBuilderDaoImpl());
				//}
				
				//Cria arquivos caso eles não existam
				if (classeWrapper.possuiAtributos()) {
					saida = Derivada.create("\n").generate(classe);
					geraArquivoFonteInicial(saida,aplicacao, classeWrapper.getPathDerivada() + "/" + classeWrapper.getNomeDerivada());
				}
				
				//Cria arquivos caso eles não existam
				if (classeWrapper.possuiAtributos()) {
					saida = DerivadaI.create("\n").generate(classe);
					geraArquivoFonteInicial(saida,aplicacao, classeWrapper.getPathDerivadaI() + "/" + classeWrapper.getNomeDerivadaI());
				}
	
				if (classeWrapper.possuiAtributos()) {
					saida = DerivadaI.create("\n").generate(classe);
					geraArquivoFonteInicial(saida,aplicacao, classeWrapper.getPathDerivadaI() + "/" + classeWrapper.getNomeDerivadaI());
				}
				
				if (classeWrapper.possuiAtributos()) {
					saida = FormBeanImpl.create("\n").generate(classe);
					geraArquivoFonteInicial(saida,aplicacao, classeWrapper.getPathFormBeanImpl() + "/" + classeWrapper.getNomeFormBeanImpl());
				}
				
				//Cria arquivos caso eles não existam
				//if (classeWrapper.possuiAtributos()) {
					saida = ModeloVo.create("\n").generate(classe);
					geraArquivoFonteInicial(saida,aplicacao, classeWrapper.getPathModeloVo() + "/" + classeWrapper.getNomeModeloVo());
				//}
				

			}
			catch(Exception e){
				//JOptionPane.showMessageDialog(null,e.getMessage(),"Atenção",JOptionPane.WARNING_MESSAGE);
				e.printStackTrace();
			}
	
		}
		System.out.println("Finalizado com " + listaClassificadores.size() + " objetos tratados.");
		System.out.println("Arquivo de modelo ecore: " + aplicacao.getArquivoEcore());
		System.out.println("Diretório de gravação: " + aplicacao.getPathWorkspace() + aplicacao.getNomeProjetoWorkspace());
		System.out.println("Nome do pacote: " + aplicacao.getNomePacote());
		System.out.println("");
		
		
		
	}
	
	private static void limpaDiretorioEmUso(String diretorio, AplicacaoWrapper aplicacao, EList<EClassifier> listaClasses) {
		boolean sucesso;
		String path = aplicacao.getPathWorkspace() + aplicacao.getNomeProjetoWorkspace() + "/src/" + diretorio ;
		File dir = new File(path); 
		String[] children = dir.list(); 
		ClassWrapper classeWrapper = new ClassWrapper();
		boolean mantem = false;
		try{ 
			System.out.println("Limpando " + path + "...");
			for (int i=0; i<children.length; i++) 
			{ 
				mantem = false;
				String nomeArquivo = children[i];
				Iterator<EClassifier> iterador = listaClasses.iterator();
				while (iterador.hasNext()) {
					EClass classe = (EClass) iterador.next();
					classeWrapper.setClasse(classe);
					System.out.println("Comparando..." + nomeArquivo + " e " + classeWrapper.getNomeServiceImpl() + ".java");
					if (nomeArquivo.compareTo(classeWrapper.getNomeServiceImpl() + ".java")==0) {
						mantem = true;
						break;
					}
				}
				if (!mantem) {
					System.out.println("Não mantem..." + nomeArquivo);
				}
				//String arquivo = path + "/"  + children[i]; 
				//File file = new File(arquivo);
				//if (file.isFile()) sucesso = file.delete(); 
			} 
		} catch(Exception e) { 
			System.out.println("Error in Reading data" + e.getMessage()); 
		} 
		finally { 
			
		} 
	}
	
	private static void limpaDiretorio(String diretorio, AplicacaoWrapper aplicacao) {
		boolean sucesso;
		String path = aplicacao.getPathWorkspace() + aplicacao.getNomeProjetoWorkspace() + "/src/" + diretorio ;
		File dir = new File(path); 
		String[] children = dir.list(); 
		try{ 
			System.out.println("Limpando " + path + "...");
			for (int i=0; i<children.length; i++) 
			{ 
				String arquivo = path + "/"  + children[i]; 
				File file = new File(arquivo);
				if (file.isFile()) sucesso = file.delete(); 
			} 
		} catch(Exception e) { 
			System.out.println("Error in Reading data" + e.getMessage()); 
		} 
		finally { 
			
		} 
	}
	
	private static void geraArquivoDocumentoHtml(String texto, AplicacaoWrapper aplicacao, String nomeArquivo) throws IOException {
		String arquivo = aplicacao.getPathWorkspace() + aplicacao.getNomeProjetoWorkspace() + "/doc/" + nomeArquivo + ".html";
		FileWriter x = new FileWriter(arquivo); 
		x.write(texto); 
		x.close(); 
	}
	
	private static void geraArquivoFonte(String texto, AplicacaoWrapper aplicacao, String nomeArquivo) throws IOException {
		String arquivo = aplicacao.getPathWorkspace() + aplicacao.getNomeProjetoWorkspace() + "/src/" + nomeArquivo + ".java";
		FileWriter x = new FileWriter(arquivo); 
		x.write(texto); 
		x.close(); 
	}
	
	private static void geraArquivoFonteInicial(String texto, AplicacaoWrapper aplicacao, String nomeArquivo) throws IOException {
		String arquivo = aplicacao.getPathWorkspace() + aplicacao.getNomeProjetoWorkspace() + "/src/" + nomeArquivo + ".java";
		File file = new File(arquivo);
		if (!file.exists()) {
			FileWriter x = new FileWriter(arquivo); 
			x.write(texto); 
			x.close(); 
		}
	}

}
