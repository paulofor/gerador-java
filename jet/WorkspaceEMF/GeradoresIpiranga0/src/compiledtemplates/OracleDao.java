package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class OracleDao
{
  protected static String nl;
  public static synchronized OracleDao create(String lineSeparator)
  {
    nl = lineSeparator;
    OracleDao result = new OracleDao();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.sql.ResultSet;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".*;" + NL + "import ";
  protected final String TEXT_4 = ".";
  protected final String TEXT_5 = ";" + NL + "import ";
  protected final String TEXT_6 = ".DaoFidelizacao;" + NL + "import ";
  protected final String TEXT_7 = ".BuilderI;" + NL + "import ";
  protected final String TEXT_8 = ".ObjetoI;" + NL + "import ";
  protected final String TEXT_9 = ".";
  protected final String TEXT_10 = ";" + NL + "import ";
  protected final String TEXT_11 = ".MetodoNaoImplementadoException;" + NL + "" + NL + "public class ";
  protected final String TEXT_12 = "  extends DaoFidelizacao implements ";
  protected final String TEXT_13 = "{" + NL + "" + NL + "\tprotected ObjetoI criaObjeto(ResultSet rs) {" + NL + "\t\tthrow new MetodoNaoImplementadoException(\"";
  protected final String TEXT_14 = "\",\"criaObjeto(ResultSet rs)\");" + NL + "\t}" + NL + "\tprotected BuilderI criaBuilder(ResultSet rs) {" + NL + "\t\treturn new ";
  protected final String TEXT_15 = "();" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_16 = " cadastra";
  protected final String TEXT_17 = "(";
  protected final String TEXT_18 = " item) throws DaoException {" + NL + "\t\tStringBuffer campos = new StringBuffer();" + NL + "\t\tStringBuffer valores = new StringBuffer();" + NL + "\t\t";
  protected final String TEXT_19 = NL + "\t\tcampos.append(\"";
  protected final String TEXT_20 = "\");" + NL + "\t\t";
  protected final String TEXT_21 = NL + "\t\tvalores.append(\"";
  protected final String TEXT_22 = "'\" + item.";
  protected final String TEXT_23 = "() + \"'\");" + NL + "\t\t";
  protected final String TEXT_24 = NL + "\t\t";
  protected final String TEXT_25 = NL + "\t\tvalores.append(\"";
  protected final String TEXT_26 = " \" + item.";
  protected final String TEXT_27 = "() + \" \");" + NL + "\t\t";
  protected final String TEXT_28 = NL + "\t\t";
  protected final String TEXT_29 = NL + "\t\t";
  protected final String TEXT_30 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_31 = NL + "\t\tif (items.";
  protected final String TEXT_32 = "() != null) {" + NL + "\t\t\tcampos.append(\",";
  protected final String TEXT_33 = "\");" + NL + "\t\t\t";
  protected final String TEXT_34 = NL + "\t\t\tvalores.append(\",'\" + item.";
  protected final String TEXT_35 = "() + \"'\");" + NL + "\t\t\t";
  protected final String TEXT_36 = NL + "\t\t\t";
  protected final String TEXT_37 = NL + "\t\t\tvalores.append(\", \" + item.";
  protected final String TEXT_38 = "() + \" \");" + NL + "\t\t\t";
  protected final String TEXT_39 = NL + "\t\t\t";
  protected final String TEXT_40 = NL + "\t\t\tvalores.append(\",\" + (motorista.";
  protected final String TEXT_41 = "() ? \"'S'\" : \"'N'\"));" + NL + "\t\t\t";
  protected final String TEXT_42 = NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_43 = NL + "\t\t" + NL + "\t\tcampos.append(\")\");" + NL + "\t\tvalores.append(\")\");" + NL + "\t\t" + NL + "\t\t" + NL + "\t\tString sql = \"insert into fideliza.cliente_fidelizacao \" + campos.toString()" + NL + "\t\t\t\t+ \" values \" + valores.toString();" + NL + "" + NL + "\t\tQuery query = new Query();" + NL + "\t\tquery.setText(sql);" + NL + "\t\tthis.alterData(query);" + NL + "\t\treturn item;" + NL + "\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EClass eClass = (EClass) argument;  
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
AttributeWrapper atributo = new AttributeWrapper();
ReferenceWrapper referencia = null;

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteOracleDao() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteModeloI() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getPacoteDaoI() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeDaoI() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getPacoteDaoI() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getPacoteReferencias() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getPacoteReferencias() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getPacoteBuilderDaoImpl() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeBuilderDaoImpl() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getPacoteUtil() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeOracleDao() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeDaoI() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeOracleDao() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeBuilderDaoImpl() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeSimples() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_18);
    
		boolean primeiro = true;
		
		for (AttributeWrapper item : classe.getListaChave()) { 
			atributo = item;
		
    stringBuffer.append(TEXT_19);
    stringBuffer.append( (primeiro?"(":",") );
    stringBuffer.append( atributo.getNomeBD() );
    stringBuffer.append(TEXT_20);
     if (item.tipoString()) {
    stringBuffer.append(TEXT_21);
    stringBuffer.append( (primeiro?"(":",") );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( atributo.getGetter() );
    stringBuffer.append(TEXT_23);
     } 
    stringBuffer.append(TEXT_24);
     if (item.tipoLong() || item.tipoFloat()) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append( (primeiro?"(":",") );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( atributo.getGetter() );
    stringBuffer.append(TEXT_27);
     } 
    stringBuffer.append(TEXT_28);
     if (primeiro) primeiro = false; 
    stringBuffer.append(TEXT_29);
    }
    stringBuffer.append(TEXT_30);
    for (AttributeWrapper item : classe.getListaNaoChave()) { 
			atributo = item;
		
    stringBuffer.append(TEXT_31);
    stringBuffer.append( atributo.getGetter() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( atributo.getNomeBD() );
    stringBuffer.append(TEXT_33);
     if (item.tipoString()) {
    stringBuffer.append(TEXT_34);
    stringBuffer.append( atributo.getGetter() );
    stringBuffer.append(TEXT_35);
     } 
    stringBuffer.append(TEXT_36);
     if (item.tipoLong() || item.tipoFloat()) {
    stringBuffer.append(TEXT_37);
    stringBuffer.append( atributo.getGetter() );
    stringBuffer.append(TEXT_38);
     } 
    stringBuffer.append(TEXT_39);
     if (item.tipoBoolean()) {
    stringBuffer.append(TEXT_40);
    stringBuffer.append( atributo.getGetter() );
    stringBuffer.append(TEXT_41);
     } 
    stringBuffer.append(TEXT_42);
    }
    stringBuffer.append(TEXT_43);
    return stringBuffer.toString();
  }
}
