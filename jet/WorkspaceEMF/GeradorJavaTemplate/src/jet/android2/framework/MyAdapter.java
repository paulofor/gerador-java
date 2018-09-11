package jet.android2.framework;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class MyAdapter
{
  protected static String nl;
  public static synchronized MyAdapter create(String lineSeparator)
  {
    nl = lineSeparator;
    MyAdapter result = new MyAdapter();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import android.support.v7.widget.RecyclerView;" + NL + "import android.view.LayoutInflater;" + NL + "import android.view.View;" + NL + "import android.view.ViewGroup;" + NL + "import android.widget.TextView;" + NL + "" + NL + "import java.util.List;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".template.R;" + NL + "" + NL + "" + NL + "public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {" + NL + "    private List mDataset;" + NL + "" + NL + "    // Provide a reference to the views for each data item" + NL + "    // Complex data items may need more than one view per item, and" + NL + "    // you provide access to all the views for a data item in a view holder" + NL + "    public static class ViewHolder extends RecyclerView.ViewHolder {" + NL + "        // each data item is just a string in this case" + NL + "        public TextView mTextView;" + NL + "        public ViewHolder(TextView v) {" + NL + "            super(v);" + NL + "            mTextView = v;" + NL + "        }" + NL + "    }" + NL + "" + NL + "    // Provide a suitable constructor (depends on the kind of dataset)" + NL + "    public MyAdapter(List myDataset) {" + NL + "        mDataset = myDataset;" + NL + "    }" + NL + "" + NL + "    // Create new views (invoked by the layout manager)" + NL + "    @Override" + NL + "    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {" + NL + "        // create a new view" + NL + "        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.texto_simples, parent, false);" + NL + "        // set the view's size, margins, paddings and layout parameters" + NL + "        //ViewHolder vh = new ViewHolder((TextView) v);" + NL + "        return null;" + NL + "    }" + NL + "" + NL + "    // Replace the contents of a view (invoked by the layout manager)" + NL + "    @Override" + NL + "    public void onBindViewHolder(ViewHolder holder, int position) {" + NL + "        // - get element from your dataset at this position" + NL + "        // - replace the contents of the view with that element" + NL + "        //holder.mTextView.setText(mDataset.get(position).getNome());" + NL + "" + NL + "    }" + NL + "" + NL + "    // Return the size of your dataset (invoked by the layout manager)" + NL + "    @Override" + NL + "    public int getItemCount() {" + NL + "        return mDataset.size();" + NL + "    }" + NL + "}" + NL + NL;
  protected final String TEXT_4 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
