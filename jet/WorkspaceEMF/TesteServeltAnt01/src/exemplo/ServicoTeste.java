package exemplo;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
@Stateless()
public class ServicoTeste {

	
	   
	@WebMethod(operationName = "obtemNome")
	public String obtemNome() {
		return "Ola Mundo";
	}
	
	@WebMethod(operationName = "recebeNumero")
	public String recebeNumero(@WebParam(name = "num") long num) {
		return "" + num;
	}
}
