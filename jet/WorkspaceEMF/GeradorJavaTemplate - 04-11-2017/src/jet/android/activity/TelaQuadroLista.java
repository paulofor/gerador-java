package jet.android.activity;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class TelaQuadroLista
{
  protected static String nl;
  public static synchronized TelaQuadroLista create(String lineSeparator)
  {
    nl = lineSeparator;
    TelaQuadroLista result = new TelaQuadroLista();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".tela.quadro;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".app.R;" + NL + "import ";
  protected final String TEXT_5 = ".modelo.";
  protected final String TEXT_6 = ";" + NL + "import ";
  protected final String TEXT_7 = ".servico.FabricaServico;" + NL + "import ";
  protected final String TEXT_8 = ".servico.";
  protected final String TEXT_9 = "Servico;" + NL + "import ";
  protected final String TEXT_10 = ".view.adapter.";
  protected final String TEXT_11 = "ListAdapter;" + NL + "" + NL + "import ";
  protected final String TEXT_12 = ".tela.quadro.base.";
  protected final String TEXT_13 = "QuadroListaBase;" + NL + "import java.util.List;" + NL + "import br.com.digicom.animacao.TrocaQuadro;" + NL + "" + NL + "import android.content.Context;" + NL + "import android.os.Bundle;" + NL + "import android.view.LayoutInflater;" + NL + "import android.view.View;" + NL + "import android.view.ViewGroup;" + NL + "import android.widget.ListView;" + NL + "import br.com.digicom.quadro.BaseListFragment;" + NL + "" + NL + "public class ";
  protected final String TEXT_14 = "QuadroLista extends  ";
  protected final String TEXT_15 = "QuadroListaBase{" + NL + "" + NL + "\t@Override" + NL + "\tpublic void extraiBundle() {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t\t" + NL + "\t}" + NL + "\t" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    return stringBuffer.toString();
  }
}
