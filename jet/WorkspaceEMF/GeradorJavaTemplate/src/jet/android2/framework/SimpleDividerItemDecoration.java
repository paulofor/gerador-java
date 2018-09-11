package jet.android2.framework;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class SimpleDividerItemDecoration
{
  protected static String nl;
  public static synchronized SimpleDividerItemDecoration create(String lineSeparator)
  {
    nl = lineSeparator;
    SimpleDividerItemDecoration result = new SimpleDividerItemDecoration();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".framework.tela;" + NL + "" + NL + "import android.content.Context;" + NL + "import android.graphics.Canvas;" + NL + "import android.graphics.drawable.Drawable;" + NL + "import android.support.v7.widget.RecyclerView;" + NL + "import android.view.View;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".template.R;" + NL + "" + NL + "" + NL + "public class SimpleDividerItemDecoration extends RecyclerView.ItemDecoration {" + NL + "    private Drawable mDivider;" + NL + "" + NL + "    public SimpleDividerItemDecoration(Context context) {" + NL + "        mDivider = context.getResources().getDrawable(R.drawable.line_divider);" + NL + "    }" + NL + "" + NL + "    @Override" + NL + "    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {" + NL + "        int left = parent.getPaddingLeft();" + NL + "        int right = parent.getWidth() - parent.getPaddingRight();" + NL + "" + NL + "        int childCount = parent.getChildCount();" + NL + "        for (int i = 0; i < childCount; i++) {" + NL + "            View child = parent.getChildAt(i);" + NL + "" + NL + "            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();" + NL + "" + NL + "            int top = child.getBottom() + params.bottomMargin;" + NL + "            int bottom = top + mDivider.getIntrinsicHeight();" + NL + "" + NL + "            mDivider.setBounds(left, top, right, bottom);" + NL + "            mDivider.draw(c);" + NL + "        }" + NL + "    }" + NL + "}";
  protected final String TEXT_5 = NL;

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
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
