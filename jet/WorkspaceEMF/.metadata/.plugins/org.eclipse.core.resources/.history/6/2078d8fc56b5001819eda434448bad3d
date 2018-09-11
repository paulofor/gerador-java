package jet.csdn35.mvc;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class EditView
{
  protected static String nl;
  public static synchronized EditView create(String lineSeparator)
  {
    nl = lineSeparator;
    EditView result = new EditView();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "@model ";
  protected final String TEXT_2 = ".modelo.";
  protected final String TEXT_3 = NL + NL + "@using (Html.BeginForm(\"CriaNovoRetornaLista\", \"";
  protected final String TEXT_4 = "\", FormMethod.Post, new { id = \"";
  protected final String TEXT_5 = "Form\" }))" + NL + "{" + NL + "\t<input type=\"hidden\" name=\"";
  protected final String TEXT_6 = "\" value=\"@Model.";
  protected final String TEXT_7 = "\" />" + NL + "\t";
  protected final String TEXT_8 = NL + "\t<input type=\"hidden\" name=\"";
  protected final String TEXT_9 = "\" value=\"@Model.";
  protected final String TEXT_10 = "\" />" + NL + "\t";
  protected final String TEXT_11 = NL + "    <fieldset>" + NL + "        <legend>";
  protected final String TEXT_12 = "</legend>" + NL + "\t\t";
  protected final String TEXT_13 = NL + "        <div class=\"editor-label\">" + NL + "            @Html.LabelFor(model => model.";
  protected final String TEXT_14 = ")" + NL + "        </div>" + NL + "        <div class=\"editor-field\">" + NL + "            @Html.EditorFor(model => model.";
  protected final String TEXT_15 = ")" + NL + "            @Html.ValidationMessageFor(model => model.";
  protected final String TEXT_16 = ")" + NL + "        </div>" + NL + "\t\t";
  protected final String TEXT_17 = NL + "    </fieldset>" + NL + "}" + NL + "<script type=\"text/javascript\">" + NL + "    $(function () {" + NL + "        $(\"#";
  protected final String TEXT_18 = "Form\").validate({" + NL + "            rules: {" + NL + "                Descricao: { required: true }" + NL + "            }" + NL + "        });" + NL + "    });" + NL + "</script>";
  protected final String TEXT_19 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_7);
    
	Iterator<RelacionamentoWrapper> it3 = classe.obtemListaComChaveEstrangeira().iterator();
	while (it3.hasNext()) {
		RelacionamentoWrapper corrente = it3.next();
	
    stringBuffer.append(TEXT_8);
    stringBuffer.append( corrente.getNomePropriedade() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( corrente.getNomePropriedade() );
    stringBuffer.append(TEXT_10);
    
	}
	
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    
		Iterator<AtributoWrapper> it2 = classe.getListaCamposEdicao().iterator();
       	while (it2.hasNext()) {
       		AtributoWrapper corrente = it2.next();
		
    stringBuffer.append(TEXT_13);
    stringBuffer.append( corrente.getNomePropriedade() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( corrente.getNomePropriedade() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( corrente.getNomePropriedade() );
    stringBuffer.append(TEXT_16);
    
		}
		
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append(TEXT_19);
    return stringBuffer.toString();
  }
}
