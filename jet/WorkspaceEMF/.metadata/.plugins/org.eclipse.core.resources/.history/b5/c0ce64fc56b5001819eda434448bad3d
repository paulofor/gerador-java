package jet.android2.tela;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class CriaAcoplaBaseActivity
{
  protected static String nl;
  public static synchronized CriaAcoplaBaseActivity create(String lineSeparator)
  {
    nl = lineSeparator;
    CriaAcoplaBaseActivity result = new CriaAcoplaBaseActivity();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".tela.base.activity.criaacopla;" + NL + "" + NL + "import android.os.Bundle;" + NL + "import android.support.annotation.Nullable;" + NL + "import ";
  protected final String TEXT_4 = ".framework.log.DCLog;" + NL + "import android.support.v7.app.AppCompatActivity;" + NL + "import ";
  protected final String TEXT_5 = ".framework.modelo.DCIObjetoDominio;" + NL + "" + NL + "" + NL + "import android.widget.ImageView;" + NL + "" + NL + "import com.bumptech.glide.Glide;" + NL + "import com.bumptech.glide.load.engine.DiskCacheStrategy;" + NL + "" + NL + "import ";
  protected final String TEXT_6 = ".template.R;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_7 = "CriaAcoplaBaseActivity<DCIObjetoDominio> extends AppCompatActivity  {" + NL + "" + NL + "\t@Override" + NL + "    protected void onCreate(@Nullable Bundle savedInstanceState) {" + NL + "        super.onCreate(savedInstanceState);" + NL + "        DCLog.d(DCLog.TRACE_DISPLAY,this,\"\");" + NL + "       \t//DCLog.d(DCLog.TRACE_DISPLAY,this,getClass().getSimpleName() + \" (\" + getLayoutResource().getNome() + \")\" );" + NL + "    }" + NL + "    " + NL + "    protected void carregaImagemCache(String urlImagem, ImageView viewImagem) {" + NL + "        Glide.with(this)" + NL + "                .load(urlImagem)" + NL + "                .error(R.drawable.img_nao_disponivel)" + NL + "                .diskCacheStrategy(DiskCacheStrategy.ALL)" + NL + "                .into(viewImagem);" + NL + "    }" + NL + "}";

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
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
