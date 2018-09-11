package jet.cs.mysql;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class MySqlScript
{
  protected static String nl;
  public static synchronized MySqlScript create(String lineSeparator)
  {
    nl = lineSeparator;
    MySqlScript result = new MySqlScript();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL;
  protected final String TEXT_2 = NL + "\tALTER TABLE ";
  protected final String TEXT_3 = NL + "\t\tADD FOREIGN KEY (`";
  protected final String TEXT_4 = "`) REFERENCES `";
  protected final String TEXT_5 = "` (`";
  protected final String TEXT_6 = "`)" + NL + "\t\tON DELETE NO ACTION" + NL + "\t\tON UPDATE NO ACTION" + NL + "\t";
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    
for (ClasseWrapper classe : classes) {

    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getNomeParaTabela() );
    
	for (RelacionamentoWrapper relCorrente : classe.obtemListaComChaveEstrangeira())  {
	
    stringBuffer.append(TEXT_3);
    stringBuffer.append( relCorrente.getNomeCampoTabela() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( relCorrente.getClasseOposta().getNomeParaTabela() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( relCorrente.getClasseOposta().getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_6);
    
	}
}

    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
