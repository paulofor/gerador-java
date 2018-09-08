package servicos;

import java.io.Serializable;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService(name = "TestWs")


@SOAPBinding
   (
         style = SOAPBinding.Style.DOCUMENT,
         use = SOAPBinding.Use.LITERAL,
         parameterStyle = SOAPBinding.ParameterStyle.WRAPPED
    )

    
    

public class ServicoWeb implements Serializable {

	@WebMethod
	public String getPalavra() {
		return "teffsterrryy";
	}
}
