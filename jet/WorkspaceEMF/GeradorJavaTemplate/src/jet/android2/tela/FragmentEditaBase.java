package jet.android2.tela;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class FragmentEditaBase
{
  protected static String nl;
  public static synchronized FragmentEditaBase create(String lineSeparator)
  {
    nl = lineSeparator;
    FragmentEditaBase result = new FragmentEditaBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".tela.base.fragment;" + NL + "" + NL + "import android.content.ContentResolver;" + NL + "import android.net.Uri;" + NL + "import android.os.Bundle;" + NL + "import android.provider.BaseColumns;" + NL + "import android.support.v4.app.Fragment;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.";
  protected final String TEXT_5 = ";" + NL + "import android.view.View;" + NL + "import android.view.LayoutInflater;" + NL + "import android.view.ViewGroup;" + NL + "import android.widget.Button;" + NL + "import android.widget.EditText;" + NL + "import ";
  protected final String TEXT_6 = ".servico.base.";
  protected final String TEXT_7 = "Servico;" + NL + "import ";
  protected final String TEXT_8 = ".servico.base.FabricaServico;" + NL + "import ";
  protected final String TEXT_9 = ".modelo.";
  protected final String TEXT_10 = "Vo;" + NL + "import ";
  protected final String TEXT_11 = ".framework.log.DCLog;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_12 = "FragmentEditaBase extends Fragment{" + NL + "" + NL + "\tprivate Button btnOk = null;" + NL + "" + NL + "\tprivate ";
  protected final String TEXT_13 = " item = null;" + NL + "\t" + NL + "\tprotected ";
  protected final String TEXT_14 = "Servico srv = FabricaServico.getInstancia().get";
  protected final String TEXT_15 = "Servico();" + NL + "\t" + NL + "\tprotected ";
  protected final String TEXT_16 = " getItem() {" + NL + "\t\treturn item;" + NL + "\t}" + NL + "\tpublic void setItem(";
  protected final String TEXT_17 = " valor) {" + NL + "\t\titem = valor;" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {" + NL + "        DCLog.d(DCLog.TRACE_DISPLAY,this,this.getClass().getSimpleName());" + NL + "         if (getIdLayout()==0) {" + NL + "            throw new RuntimeException(\"Voce precisa implementar getIdLayout() em \" + this.getClass().getSimpleName());" + NL + "        }" + NL + "        View v = inflater.inflate(getIdLayout(), container, false);" + NL + "        inicializaCamposTela(v);" + NL + "        btnOk = getButton(v,getIdBtnOk(),\"btnOk\");" + NL + "        btnOk.setOnClickListener(new View.OnClickListener() {" + NL + "            @Override" + NL + "            public void onClick(View view) {" + NL + "                enviaDados();" + NL + "            }" + NL + "        });" + NL + "        return v;" + NL + "    }" + NL + "\t" + NL + "\tprivate void enviaDados() {" + NL + "\t\tDCLog.d(DCLog.TRACE_CRUD,this,\"enviaDados click\");" + NL + "\t\tif (item==null) {" + NL + "            // Insercao" + NL + "            item = new ";
  protected final String TEXT_18 = "Vo();" + NL + "            DCLog.d(DCLog.TRACE_CRUD,this,\"Insercao\");" + NL + "        }" + NL + "        DCLog.d(DCLog.TRACE_CRUD,this,\"antes  copiaTelaParaVo: \" + item.getContentValues().toString());" + NL + "        copiaTelaParaVo(item);" + NL + "        DCLog.d(DCLog.TRACE_CRUD,this,\"depois copiaTelaParaVo: \" + item.getContentValues().toString());" + NL + "        srv.insereAtualiza(item,this.getContext());" + NL + "        fechar();" + NL + "    }" + NL + "\tprivate void fechar() {" + NL + "\t}" + NL + "" + NL + "" + NL + "    protected abstract void copiaTelaParaVo(";
  protected final String TEXT_19 = " item);" + NL + "\t" + NL + "\tprotected abstract void inicializaCamposTela(View v);" + NL + "\t" + NL + "\tprotected abstract int getIdLayout();" + NL + "\tprotected abstract int getIdBtnOk();" + NL + "" + NL + "\t// Tem em varios lugares, pode depois ficar centralizada." + NL + "    // (28-11-2016) ate 28-01-2017" + NL + "    " + NL + "    protected final EditText getEditText(View v, int id, String nome) {" + NL + "        EditText saida = (EditText) v.findViewById(id);" + NL + "        if (saida==null) throw new RuntimeException(\"EditText \" + nome + \" nao encontrado em \" + v);" + NL + "        return saida;" + NL + "    }" + NL + "    protected final Button getButton(View v, int id, String nome) {" + NL + "        Button saida = (Button) v.findViewById(id);" + NL + "        if (saida==null) throw new RuntimeException(\"Button \" + nome + \" nao encontrado em \" + v);" + NL + "        return saida;" + NL + "    }" + NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( conf.getNamespaceExtendido() );
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
    return stringBuffer.toString();
  }
}
