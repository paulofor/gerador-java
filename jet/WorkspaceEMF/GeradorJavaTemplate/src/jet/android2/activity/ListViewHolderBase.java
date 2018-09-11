package jet.android2.activity;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ListViewHolderBase
{
  protected static String nl;
  public static synchronized ListViewHolderBase create(String lineSeparator)
  {
    nl = lineSeparator;
    ListViewHolderBase result = new ListViewHolderBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".template.lista;" + NL + "" + NL + "" + NL + "import java.util.List;" + NL + "" + NL + "import android.content.Context;" + NL + "import android.database.Cursor;" + NL + "import android.net.Uri;" + NL + "import android.support.v7.widget.RecyclerView;" + NL + "import android.view.View;" + NL + "import android.widget.TextView;" + NL + "import android.widget.ImageView;" + NL + "import android.widget.RatingBar;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".framework.modelo.DCIObjetoDominio;" + NL + "import ";
  protected final String TEXT_5 = ".data.contract.";
  protected final String TEXT_6 = "Contract;" + NL + "import ";
  protected final String TEXT_7 = ".framework.util.ItemChoiceManager;" + NL + "import ";
  protected final String TEXT_8 = ".modelo.";
  protected final String TEXT_9 = ";" + NL + "" + NL + "/**" + NL + " * Created by Paulo on 03/11/15." + NL + " */" + NL + "public abstract class ";
  protected final String TEXT_10 = "ListViewHolderBase extends RecyclerView.ViewHolder implements View.OnClickListener{" + NL + "" + NL + "    //protected Cursor mCursor;" + NL + "    protected List mLista;" + NL + "    protected ";
  protected final String TEXT_11 = "ListAdapterBase.";
  protected final String TEXT_12 = "ListAdapterOnClickHandler mClickHandler;" + NL + "    protected ItemChoiceManager mICM = null;" + NL + "" + NL + "" + NL + "\tprivate ";
  protected final String TEXT_13 = " item;" + NL + "\tpublic void setItem(";
  protected final String TEXT_14 = " dado) {" + NL + "\t\titem = dado;" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_15 = " getItem() {" + NL + "\t\treturn item;" + NL + "\t}" + NL + "" + NL + "    //public void setCursor(Cursor valor) {" + NL + "    //    mCursor = valor;" + NL + "    //}" + NL + "    public void setLista(List valor) {" + NL + "    \tmLista = valor;" + NL + "    }" + NL + "    " + NL + "    " + NL + "    public void setOnClickHandler(";
  protected final String TEXT_16 = "ListAdapterBase.";
  protected final String TEXT_17 = "ListAdapterOnClickHandler valor){" + NL + "        mClickHandler = valor;" + NL + "    }" + NL + "" + NL + "    public ";
  protected final String TEXT_18 = "ListViewHolderBase(View itemView) {" + NL + "        super(itemView);" + NL + "        itemView.setOnClickListener(this);" + NL + "    }" + NL + "" + NL + "    @Override" + NL + "    public final void onClick(View v) {" + NL + "        DCIObjetoDominio item = (DCIObjetoDominio) mLista.get(this.getAdapterPosition());" + NL + "        mClickHandler.onClick((int)item.getIdObj(), this);" + NL + "    }" + NL + "    " + NL + "    protected final TextView getTextView(View v, int id, String nome) {" + NL + "        TextView saida = (TextView) v.findViewById(id);" + NL + "        if (saida==null) throw new RuntimeException(\"TextView \" + nome + \" nao encontrado em \" + v);" + NL + "        return saida;" + NL + "    }" + NL + "    protected final ImageView getImageView(View v, int id, String nome) {" + NL + "        ImageView saida = (ImageView) v.findViewById(id);" + NL + "        if (saida==null) throw new RuntimeException(\"ImageView \" + nome + \" nao encontrado em \" + v);" + NL + "        return saida;" + NL + "    }" + NL + "    protected final RatingBar getRatingBar(View v, int id, String nome) {" + NL + "        RatingBar saida = (RatingBar) v.findViewById(id);" + NL + "        if (saida==null) throw new RuntimeException(\"RatingBar \" + nome + \" nao encontrado em \" + v);" + NL + "        return saida;" + NL + "    }" + NL + "}";
  protected final String TEXT_19 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
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
    stringBuffer.append( conf.getNamespaceExtendido() );
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
    stringBuffer.append(TEXT_19);
    return stringBuffer.toString();
  }
}
