package jet.csdn35.mvc;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class ListaView
{
  protected static String nl;
  public static synchronized ListaView create(String lineSeparator)
  {
    nl = lineSeparator;
    ListaView result = new ListaView();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "@model IEnumerable<";
  protected final String TEXT_2 = ".modelo.";
  protected final String TEXT_3 = ">" + NL + "" + NL + "<table width=\"100%\">" + NL + "    <tr>" + NL + "    \t";
  protected final String TEXT_4 = NL + "        <th>";
  protected final String TEXT_5 = NL + "            ";
  protected final String TEXT_6 = NL + "        </th>" + NL + "       \t";
  protected final String TEXT_7 = NL + "        <th width=\"12%\"></th>" + NL + "    </tr>" + NL + "" + NL + "@foreach (var item in Model) {" + NL + "    <tr>" + NL + "    \t";
  protected final String TEXT_8 = NL + "       \t<td>" + NL + "            @Html.DisplayFor(modelItem => item.";
  protected final String TEXT_9 = ")" + NL + "        </td>" + NL + "       \t";
  protected final String TEXT_10 = NL + "       \t<td>" + NL + "     \t@Html.ActionLink(\"Detalhe\",\"DisplayPage\", new { id = item.";
  protected final String TEXT_11 = " } )" + NL + "        <span class=\"ButtonLink Edita";
  protected final String TEXT_12 = "\" IdItem=\"@item.";
  protected final String TEXT_13 = "\">Editar</span>" + NL + "        </td>" + NL + "        " + NL + "    </tr>" + NL + "}" + NL + "" + NL + "</table>" + NL + "<script type=\"text/javascript\" >" + NL + "   $(function() {" + NL + "         $(\".Edita";
  protected final String TEXT_14 = "\").click(function () {" + NL + "            var id = $(this).attr(\"IdItem\");" + NL + "            $(\"#";
  protected final String TEXT_15 = "Dialog\").html(\"\")" + NL + "                .dialog(\"option\", \"title\", \"Altera\")" + NL + "                .load(\"@Url.Action(\"Edita\", \"";
  protected final String TEXT_16 = "\")/\" + id, function () { $(\"#";
  protected final String TEXT_17 = "Dialog\").dialog(\"open\"); });" + NL + "        });" + NL + "    })" + NL + "</script>";

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
    
    	Iterator<AtributoWrapper> it1 = classe.getListaAtributoEntidadeW().iterator();
       	while (it1.hasNext()) {
       		AtributoWrapper corrente = it1.next();
       		if (!corrente.ehChave()) {
    	
    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    stringBuffer.append( corrente.getNomePropriedade() );
    stringBuffer.append(TEXT_6);
    
       		}
       	}
       	
    stringBuffer.append(TEXT_7);
    
    	Iterator<AtributoWrapper> it2 = classe.getListaAtributoEntidadeW().iterator();
       	while (it2.hasNext()) {
       		AtributoWrapper corrente = it2.next();
       		if (!corrente.ehChave()) {
    	
    stringBuffer.append(TEXT_8);
    stringBuffer.append( corrente.getNomePropriedade() );
    stringBuffer.append(TEXT_9);
    
       		}
       	}
       	
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    return stringBuffer.toString();
  }
}
