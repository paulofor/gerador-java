package jet.android2.tela;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class FragmentListaUsoBase
{
  protected static String nl;
  public static synchronized FragmentListaUsoBase create(String lineSeparator)
  {
    nl = lineSeparator;
    FragmentListaUsoBase result = new FragmentListaUsoBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".tela.base;" + NL + "" + NL + "import android.os.Bundle;" + NL + "import android.support.v4.app.Fragment;" + NL + "import android.support.v7.widget.LinearLayoutManager;" + NL + "import android.support.v7.widget.RecyclerView;" + NL + "import android.view.LayoutInflater;" + NL + "import android.view.View;" + NL + "import android.view.ViewGroup;" + NL + "" + NL + "import java.util.List;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".MyAdapter;" + NL + "import ";
  protected final String TEXT_5 = ".modelo.";
  protected final String TEXT_6 = ";" + NL + "import ";
  protected final String TEXT_7 = ".template.R;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_8 = "FragmentListaUsoBase extends Fragment{" + NL + "" + NL + "\tprivate RecyclerView mRecyclerView;" + NL + "    private RecyclerView.Adapter mAdapter;" + NL + "    private RecyclerView.LayoutManager mLayoutManager;" + NL + "\t" + NL + "\t" + NL + "\tpublic final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {" + NL + "" + NL + "        View rootView = inflater.inflate(R.layout.lista_padrao, container, false);" + NL + "        super.onCreate(savedInstanceState);" + NL + "        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.rec_lista_padrao);" + NL + "        // use this setting to improve performance if you know that changes" + NL + "        // in content do not change the layout size of the RecyclerView" + NL + "        mRecyclerView.setHasFixedSize(true);" + NL + "" + NL + "        // use a linear layout manager" + NL + "        mLayoutManager = new LinearLayoutManager(this.getActivity());" + NL + "        mRecyclerView.setLayoutManager(mLayoutManager);" + NL + "" + NL + "\t\t/*" + NL + "        List<Cliente> listaCliente = new ArrayList<Cliente>();" + NL + "        Cliente cliente = new ClienteVo();" + NL + "        cliente.setNome(\"Cliente 1\");" + NL + "        listaCliente.add(cliente);" + NL + "        cliente = new ClienteVo();" + NL + "        cliente.setNome(\"Cliente 2\");" + NL + "        listaCliente.add(cliente);" + NL + "        cliente = new ClienteVo();" + NL + "        cliente.setNome(\"Cliente 3\");" + NL + "        listaCliente.add(cliente);" + NL + "" + NL + "        String[] myDataset = {\"Linha1\",\"Linha2\",\"Linha3\"};" + NL + "        // specify an adapter (see also next example)" + NL + "        mAdapter = new MyAdapter(listaCliente);" + NL + "        */" + NL + "        mAdapter = new MyAdapter(getLista());" + NL + "        mRecyclerView.setAdapter(mAdapter);" + NL + "" + NL + "        return rootView;" + NL + "    }" + NL + "    " + NL + "    protected abstract List<";
  protected final String TEXT_9 = "> getLista();" + NL + "\t" + NL + "}";

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
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    return stringBuffer.toString();
  }
}
