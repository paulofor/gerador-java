import gerapp.app.GeradorArquivosAndroid2;
import gerapp.modelo.Aplicacao;
import gerapp.modelo.FabricaVo;
import br.com.digicom.ws.PrincipalFacade;




public class TestadorApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrincipalFacade facade = new PrincipalFacade();
		Aplicacao aplicacao = FabricaVo.criaAplicacao();
		aplicacao.setIdAplicacao(90);
		GeradorArquivosAndroid2 gerador = new GeradorArquivosAndroid2();
		//GeradorArquivosCpp gerador = new GeradorArquivosCpp();
		try {
			gerador.setAplicacao(aplicacao);
			gerador.criaArquivos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
