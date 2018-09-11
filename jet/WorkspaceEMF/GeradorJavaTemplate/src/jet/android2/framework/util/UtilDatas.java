package jet.android2.framework.util;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class UtilDatas
{
  protected static String nl;
  public static synchronized UtilDatas create(String lineSeparator)
  {
    nl = lineSeparator;
    UtilDatas result = new UtilDatas();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".framework.util;" + NL + "" + NL + "" + NL + "import android.content.ContentValues;" + NL + "" + NL + "import java.sql.Timestamp;" + NL + "import java.text.SimpleDateFormat;" + NL + "import java.util.Calendar;" + NL + "import java.util.Date;" + NL + "" + NL + "/**" + NL + " * Created by Paulo on 20/11/2015." + NL + " */" + NL + "public class UtilDatas {" + NL + "" + NL + "" + NL + " \tpublic static Timestamp getDataHora() {" + NL + "        Date date= new Date();" + NL + "        return new Timestamp(date.getTime());" + NL + "    }" + NL + "" + NL + "    public static String getDataDeslocada(int dias) {" + NL + "        Calendar cal = Calendar.getInstance();" + NL + "        cal.add(Calendar.DAY_OF_YEAR, dias);" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"dd-MM-yyyy\");" + NL + "        String saida = formato.format(cal.getTime());" + NL + "        return saida;" + NL + "    }" + NL + "   \tpublic static String getDataDeslocada(int dias, Timestamp referencia) {" + NL + "        Calendar cal = Calendar.getInstance();" + NL + "        cal.setTimeInMillis(referencia.getTime());" + NL + "        cal.add(Calendar.DAY_OF_YEAR, dias);" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"dd-MM-yyyy\");" + NL + "        String saida = formato.format(cal.getTime());" + NL + "        return saida;" + NL + "    }" + NL + "" + NL + "    public static long getDataLong(String data) {" + NL + "    \tif (data.length()==0) return 0;" + NL + "        String dataNum = data.substring(6) + data.substring(3, 5) + data.substring(0, 2) ;" + NL + "        long num = Long.parseLong(dataNum);" + NL + "        return num;" + NL + "    }" + NL + "    public static long getDataHoraLong(String data) {" + NL + "        // DD-MM-AAAA HH:MM:SS" + NL + "        // 01234567890123456789" + NL + "        if (data.length()==0) return 0;" + NL + "        String dataNum = data.substring(6) + data.substring(3, 5) + data.substring(0, 2) +" + NL + "                data.substring(11,13) + data.substring(14,16) + data.substring(17);" + NL + "        long num = Long.parseLong(dataNum);" + NL + "        return num;" + NL + "    }" + NL + "" + NL + "    public static long getDataLong(Timestamp data) {" + NL + "    \tif (data==null) return 0;" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"yyyyMMdd\");" + NL + "        String saida = formato.format(data);" + NL + "        return Long.parseLong(saida);" + NL + "    }" + NL + "    public static long getDataHoraLong(Timestamp data) {" + NL + "    \tif (data==null) return 0;" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"yyyyMMddHHmmss\");" + NL + "        String saida = formato.format(data);" + NL + "        return Long.parseLong(saida);" + NL + "    }" + NL + "" + NL + "" + NL + "" + NL + "    protected void putValorData(ContentValues valores, String tipo, String campo) {" + NL + "        String dataNum = campo.substring(6) + campo.substring(3, 5) + campo.substring(0, 2) ;" + NL + "        long num = Long.parseLong(dataNum);" + NL + "        valores.put(tipo, num);" + NL + "    }" + NL + "    protected void putValorData(ContentValues valores, String tipo, Timestamp campo) {" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"yyyyMMdd\");" + NL + "        long num = 0;" + NL + "        if (campo!=null)" + NL + "            num = Long.parseLong(formato.format(campo));" + NL + "        valores.put(tipo, num);" + NL + "    }" + NL + "    protected void putValorDataHora(ContentValues valores, String tipo, Timestamp campo) {" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"yyyyMMddHHmmss\");" + NL + "" + NL + "        long num = 0;" + NL + "        if (campo!=null) {" + NL + "            String texto = formato.format(campo);" + NL + "            num = Long.parseLong(formato.format(campo));" + NL + "        }" + NL + "        valores.put(tipo, num);" + NL + "    }" + NL + "}";
  protected final String TEXT_4 = NL;

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
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
