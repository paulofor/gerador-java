package compiledtemplates;

import java.util.*;
import br.com.probid.gerador.execucao.wrappers.*;
import br.com.probid.gerador.interfaces.*;

public class BeanBase
{
  protected static String nl;
  public static synchronized BeanBase create(String lineSeparator)
  {
    nl = lineSeparator;
    BeanBase result = new BeanBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".bean.base;" + NL + "" + NL + "import java.sql.Date;" + NL + "import java.sql.Timestamp;" + NL + "import java.text.SimpleDateFormat;" + NL + "import java.text.DateFormat;" + NL + "import java.text.ParseException;" + NL + "" + NL + "" + NL + "public abstract class beanBase";
  protected final String TEXT_3 = "{" + NL + "" + NL + "\t";
  protected final String TEXT_4 = NL + "\tprivate beanBase";
  protected final String TEXT_5 = " item";
  protected final String TEXT_6 = " = null;" + NL + "\tpublic void set";
  protected final String TEXT_7 = "(beanBase";
  protected final String TEXT_8 = " item) {" + NL + "\t\titem";
  protected final String TEXT_9 = " = item;" + NL + "\t}" + NL + "\tpublic beanBase";
  protected final String TEXT_10 = " get";
  protected final String TEXT_11 = "() {" + NL + "\t\treturn item";
  protected final String TEXT_12 = ";" + NL + "\t}";
  protected final String TEXT_13 = NL + NL + NL + "\tprotected beanBase";
  protected final String TEXT_14 = "() {" + NL + "\t}" + NL + "\t" + NL + "\tpublic void copia(beanBase";
  protected final String TEXT_15 = " item) {" + NL + "\t";
  protected final String TEXT_16 = "\tthis.set";
  protected final String TEXT_17 = "(item.get";
  protected final String TEXT_18 = "());" + NL + "\t";
  protected final String TEXT_19 = NL + "\t}  " + NL;
  protected final String TEXT_20 = NL + "\tprotected ";
  protected final String TEXT_21 = " ";
  protected final String TEXT_22 = ";" + NL + "\tpublic void set";
  protected final String TEXT_23 = "(";
  protected final String TEXT_24 = " valor) {" + NL + "\t\t";
  protected final String TEXT_25 = " = valor;" + NL + "\t}\t" + NL + "\tpublic ";
  protected final String TEXT_26 = " get";
  protected final String TEXT_27 = "() {" + NL + "\t\treturn ";
  protected final String TEXT_28 = ";" + NL + "\t}" + NL + "\t";
  protected final String TEXT_29 = NL + "\t" + NL + "\tpublic long get";
  protected final String TEXT_30 = "Long() {" + NL + "\t\tif (";
  protected final String TEXT_31 = "==null) return 0;" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"yyyyMMdd\");" + NL + "        return Long.parseLong(formato.format(";
  protected final String TEXT_32 = "));" + NL + "    }" + NL + "\t" + NL + "\tpublic String get";
  protected final String TEXT_33 = "AAAAMMDD() {" + NL + "\t\tif (";
  protected final String TEXT_34 = "==null) return null;" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"yyyy-MM-dd\");" + NL + "        return formato.format(";
  protected final String TEXT_35 = ");" + NL + "    }" + NL + "\tpublic String get";
  protected final String TEXT_36 = "Formatada() {" + NL + "\t\tif (";
  protected final String TEXT_37 = "==null) return \"-\";" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"dd/MM/yyyy HH:mm:ss\");" + NL + "        return formato.format(";
  protected final String TEXT_38 = ");" + NL + "    }" + NL + "    public String get";
  protected final String TEXT_39 = "Str() {" + NL + "        if (";
  protected final String TEXT_40 = "==null) return \"-\";" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"dd/MM/yyyy\");" + NL + "        return formato.format(";
  protected final String TEXT_41 = ");" + NL + "    }" + NL + "    public void set";
  protected final String TEXT_42 = "Str(String data) {" + NL + "\t    if (data==null) return;" + NL + "        DateFormat formatter = new SimpleDateFormat(\"dd/MM/yyyy\");" + NL + "        try {" + NL + "\t        java.util.Date date = (java.util.Date)formatter.parse(data);" + NL + "\t        ";
  protected final String TEXT_43 = " = new Timestamp(date.getTime());" + NL + "\t    } catch (ParseException e) {" + NL + "\t    \t";
  protected final String TEXT_44 = " = null;" + NL + "\t    }" + NL + "    }" + NL + "    " + NL + "    public void set";
  protected final String TEXT_45 = "DDMMAA_HHMM(String dataHora) {" + NL + "\t    if (dataHora==null) return;" + NL + "        DateFormat formatter = new SimpleDateFormat(\"dd/MM/yy HH:mm\");" + NL + "        try {" + NL + "\t        java.util.Date date = (java.util.Date)formatter.parse(dataHora);" + NL + "\t        ";
  protected final String TEXT_46 = " = new Timestamp(date.getTime());" + NL + "\t    } catch (ParseException e) {" + NL + "\t    \t";
  protected final String TEXT_47 = " = null;" + NL + "\t    }" + NL + "    }" + NL + "    public void set";
  protected final String TEXT_48 = "MMDDAA_HHMM(String dataHora) {" + NL + "\t    if (dataHora==null) return;" + NL + "        DateFormat formatter = new SimpleDateFormat(\"MM/dd/yy HH:mm\");" + NL + "        try {" + NL + "\t        java.util.Date date = (java.util.Date)formatter.parse(dataHora);" + NL + "\t        ";
  protected final String TEXT_49 = " = new Timestamp(date.getTime());" + NL + "\t    } catch (ParseException e) {" + NL + "\t    \t";
  protected final String TEXT_50 = " = null;" + NL + "\t    }" + NL + "    }";
  protected final String TEXT_51 = "\t";
  protected final String TEXT_52 = NL + "    " + NL + "}" + NL;
  protected final String TEXT_53 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
RecursosClasse recursos = (RecursosClasse) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
ConfiguracaoWrapper conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNomePacoteModel() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_3);
    
	RelacionamentoWrapper relW = new RelacionamentoWrapper();
	Iterator itRel = classe.getBase().getListaRelacionamentoFonte().iterator();
	while (itRel.hasNext()) {
		relW.setBase((RelacionamentoI) itRel.next());

    stringBuffer.append(TEXT_4);
    stringBuffer.append( relW.getNomeClasseDestino() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( relW.getNomeClasseDestino() );
    stringBuffer.append( relW.getNomeRelacionamentoSufixo() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( relW.getNomeClasseDestino() );
    stringBuffer.append( relW.getNomeRelacionamentoSufixo() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( relW.getNomeClasseDestino() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( relW.getNomeClasseDestino() );
    stringBuffer.append( relW.getNomeRelacionamentoSufixo() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( relW.getNomeClasseDestino() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( relW.getNomeClasseDestino() );
    stringBuffer.append( relW.getNomeRelacionamentoSufixo() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( relW.getNomeClasseDestino() );
    stringBuffer.append( relW.getNomeRelacionamentoSufixo() );
    stringBuffer.append(TEXT_12);
    		
	}
	
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_15);
    
	AtributoWrapper atributoW = new AtributoWrapper();
	Iterator iterador = classe.getBase().getListaAtributo().iterator();
	while (iterador.hasNext()) {
		atributoW.setBase((AtributoI) iterador.next());
	
    stringBuffer.append(TEXT_16);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_18);
    
	}
	
    stringBuffer.append(TEXT_19);
    
	//AtributoWrapper atributoW = new AtributoWrapper();
	iterador = classe.getBase().getListaAtributo().iterator();
	while (iterador.hasNext()) {
		atributoW.setBase((AtributoI) iterador.next());

    stringBuffer.append(TEXT_20);
    stringBuffer.append( atributoW.getTipoJava() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( atributoW.getTipoJava() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( atributoW.getTipoJava() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_28);
     if (atributoW.getTipoJava()=="Timestamp") { 
    stringBuffer.append(TEXT_29);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_50);
     } 
    stringBuffer.append(TEXT_51);
    
	}

    stringBuffer.append(TEXT_52);
    stringBuffer.append(TEXT_53);
    return stringBuffer.toString();
  }
}
