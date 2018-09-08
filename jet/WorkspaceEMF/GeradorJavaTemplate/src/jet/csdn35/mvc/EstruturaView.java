package jet.csdn35.mvc;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class EstruturaView
{
  protected static String nl;
  public static synchronized EstruturaView create(String lineSeparator)
  {
    nl = lineSeparator;
    EstruturaView result = new EstruturaView();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "@model IEnumerable<";
  protected final String TEXT_2 = ".modelo.";
  protected final String TEXT_3 = ">" + NL + "@using ";
  protected final String TEXT_4 = ".modelo;" + NL + "@{" + NL + "    ViewBag.Title = \"\";" + NL + "}" + NL + "<div id=\"";
  protected final String TEXT_5 = "Conteudo\"></div>" + NL + "<div class=\"";
  protected final String TEXT_6 = "Cria ButtonLink\">Criar Novo</div>" + NL + "<div id=\"";
  protected final String TEXT_7 = "Dialog\"></div>" + NL + "<script type=\"text/javascript\">" + NL + "    $( function() {" + NL + "        $(\"#";
  protected final String TEXT_8 = "Dialog\").dialog({" + NL + "            autoOpen: false, width: 600, height: 400, modal: true," + NL + "            buttons: {" + NL + "                \"Salvar\": function () {" + NL + "                    if ($(\"#";
  protected final String TEXT_9 = "Form\").validate().form()) {" + NL + "                       $.post(\"@Url.Action(\"CriaEditaRetornaLista\", \"";
  protected final String TEXT_10 = "\")\"," + NL + "                        $(\"#";
  protected final String TEXT_11 = "Form\").serialize()," + NL + "                        function (data) {" + NL + "                            $(\"#";
  protected final String TEXT_12 = "Dialog\").dialog(\"close\");" + NL + "                            $(\"#";
  protected final String TEXT_13 = "Conteudo\").html(data);" + NL + "                            Carrega";
  protected final String TEXT_14 = "();" + NL + "                        });" + NL + "                    }" + NL + "                }," + NL + "                \"Sair\": function () { $(this).dialog(\"close\"); }" + NL + "            }" + NL + "        });" + NL + "        $(\".";
  protected final String TEXT_15 = "Cria\").click(function () {" + NL + "            $(\"#";
  protected final String TEXT_16 = "Dialog\").html(\"\")" + NL + "                .dialog(\"option\", \"title\", \"Cria Novo\")" + NL + "                .load(\"@ViewData[\"DiretorioVirtual\"]/";
  protected final String TEXT_17 = "/Novo\", function () { $(\"#";
  protected final String TEXT_18 = "Dialog\").dialog(\"open\"); });" + NL + "        });" + NL + "        Carrega";
  protected final String TEXT_19 = "();" + NL + "    })" + NL + "    function Carrega";
  protected final String TEXT_20 = "() {" + NL + "        $(\"#";
  protected final String TEXT_21 = "Conteudo\").load(\"@Url.Action(\"ListaCorrente\", \"";
  protected final String TEXT_22 = "\")\");" + NL + "    }" + NL + "    " + NL + "</script>";

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    return stringBuffer.toString();
  }
}
