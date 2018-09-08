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

public class GeradorParaServiceImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AplicacaoWrapper aplicacao = new AplicacaoWrapper();
		
		aplicacao.setNomeAplicacao("fidelizacao");
		aplicacao.setArquivoEcore("C:/WorkspaceEMF/ImportacaoModelo/model/clearcase.ecore");
		aplicacao.setPathWorkspace("C:/ClearCase/v_Fidelizacao1/Fidelizacao/Construcao/WorkspaceBD/");
		aplicacao.setNomeProjetoWorkspace("ProjetoFidelizacao");
		aplicacao.setNomePacote("fidelizacao");
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(URI.createFileURI(aplicacao.getArquivoEcore()),true);
		
		EPackage pacote = (EPackage) resource.getContents().get(0);
		EList<EClassifier> listaClassificadores = pacote.getEClassifiers();
		
		ECollections.sort(pacote.getEClassifiers(), new Comparador());
		ClassWrapper classeWrapper = new ClassWrapper();
		Iterator<EClassifier> iterador = listaClassificadores.iterator();
		
	
		
		while (iterador.hasNext()) {
			EClass classe = (EClass) iterador.next();
			classeWrapper.setClasse(classe);
			classeWrapper.setPacote(pacote);
			
			System.out.println("Gerando " + classe.getName() + "...");
			String saida;
			
			try{
				//Cria arquivos caso eles não existam
				//if (classeWrapper.possuiAtributos()) {
				saida = ServiceImpl.create("\n").generate(classe);
				geraArquivoFonteInicial(saida,aplicacao, classeWrapper.getPathServiceImpl() + "/" + classeWrapper.getNomeServiceImpl());
				//}
			}
			catch(Exception e){
				//JOptionPane.showMessageDialog(null,e.getMessage(),"Atenção",JOptionPane.WARNING_MESSAGE);
				e.printStackTrace();
			}
	
		}
		System.out.println("Finalizado com " + listaClassificadores.size() + " objetos tratados.");
		
		
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
