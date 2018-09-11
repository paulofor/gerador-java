package jet.csdn35.mvc;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class DisplayPageView
{
  protected static String nl;
  public static synchronized DisplayPageView create(String lineSeparator)
  {
    nl = lineSeparator;
    DisplayPageView result = new DisplayPageView();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "@model ";
  protected final String TEXT_2 = ".modelo.";
  protected final String TEXT_3 = NL + NL + "@{" + NL + "    ViewBag.Title = \"\";" + NL + "}";
  protected final String TEXT_4 = NL + "<h2>@Model.";
  protected final String TEXT_5 = "</h2>";
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL + "<div id=\"";
  protected final String TEXT_8 = "Conteudo\"></div>" + NL + "<div class=\"";
  protected final String TEXT_9 = "Cria ButtonLink\">Criar Novo</div>" + NL + "<div id=\"";
  protected final String TEXT_10 = "Dialog\"></div>";
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL + "<script type=\"text/javascript\">" + NL + "    $( function() {" + NL + "        $(\"#";
  protected final String TEXT_13 = "Dialog\").dialog({" + NL + "            autoOpen: false, width: 600, height: 400, modal: true," + NL + "            buttons: {" + NL + "                \"Salvar\": function () {" + NL + "                    if ($(\"#";
  protected final String TEXT_14 = "Form\").validate().form()) {" + NL + "                       $.post(\"@Url.Action(\"CriaEditaRetornaLista\", \"";
  protected final String TEXT_15 = "\")\"," + NL + "                        $(\"#";
  protected final String TEXT_16 = "Form\").serialize()," + NL + "                        function (data) {" + NL + "                            $(\"#";
  protected final String TEXT_17 = "Dialog\").dialog(\"close\");" + NL + "                            $(\"#";
  protected final String TEXT_18 = "Conteudo\").html(data);" + NL + "                            Carrega";
  protected final String TEXT_19 = "();" + NL + "                        });" + NL + "                    }" + NL + "                }," + NL + "                \"Sair\": function () { $(this).dialog(\"close\"); }" + NL + "            }" + NL + "        });" + NL + "        $(\".";
  protected final String TEXT_20 = "Cria\").click(function () {" + NL + "        \tvar id = @Model.";
  protected final String TEXT_21 = ";" + NL + "            $(\"#";
  protected final String TEXT_22 = "Dialog\").html(\"\")" + NL + "                .dialog(\"option\", \"title\", \"Cria Novo\")" + NL + "                .load(\"@ViewData[\"DiretorioVirtual\"]/";
  protected final String TEXT_23 = "/Novo?";
  protected final String TEXT_24 = "=\" + id, function () { $(\"#";
  protected final String TEXT_25 = "Dialog\").dialog(\"open\"); });" + NL + "        });" + NL + "        Carrega";
  protected final String TEXT_26 = "();" + NL + "    })" + NL + "    function Carrega";
  protected final String TEXT_27 = "() {" + NL + "         $(\"#";
  protected final String TEXT_28 = "Conteudo\").load(\"@Url.Action(\"ListaCorrente\", \"";
  protected final String TEXT_29 = "\")?";
  protected final String TEXT_30 = "=@Model.";
  protected final String TEXT_31 = "\");" + NL + "    }" + NL + "</script>";

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
    
if (!classe.isAssociativa()) {

    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getIdentificadorW().getNomePropriedade() );
    stringBuffer.append(TEXT_5);
    
}

    stringBuffer.append(TEXT_6);
    
Iterator<RelacionamentoWrapper> it1 = classe.obtemListaDependente().iterator();
while (it1.hasNext()) {
	RelacionamentoWrapper relac = it1.next();

    stringBuffer.append(TEXT_7);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    
}

    stringBuffer.append(TEXT_11);
    
it1 = classe.obtemListaDependente().iterator();
while (it1.hasNext()) {
	RelacionamentoWrapper relac = it1.next();

    stringBuffer.append(TEXT_12);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( relac.getNomePropriedadeEntidadeOposta() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( relac.getNomePropriedadeEntidadeOposta() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_31);
    
}

    return stringBuffer.toString();
  }
}
