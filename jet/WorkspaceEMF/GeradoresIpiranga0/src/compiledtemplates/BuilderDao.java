package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class BuilderDao
{
  protected static String nl;
  public static synchronized BuilderDao create(String lineSeparator)
  {
    nl = lineSeparator;
    BuilderDao result = new BuilderDao();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.sql.ResultSet;" + NL + "import java.sql.SQLException;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".MetodoNaoImplementadoException;" + NL + "import ";
  protected final String TEXT_4 = ".ObjetoI;" + NL + "import ";
  protected final String TEXT_5 = ".BuilderI;" + NL + "import ";
  protected final String TEXT_6 = ".*;" + NL + "import ";
  protected final String TEXT_7 = ".*;" + NL;
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = NL + "public abstract class ";
  protected final String TEXT_14 = " implements BuilderI  {" + NL + "\t";
  protected final String TEXT_15 = NL + "\tprivate BuilderI ascendente = null;" + NL + "\tpublic ";
  protected final String TEXT_16 = "() {" + NL + "\t\tascendente = new ";
  protected final String TEXT_17 = "();" + NL + "\t}" + NL + "\t";
  protected final String TEXT_18 = NL + "\tprivate int fluxo = 0;" + NL + "\tpublic int getFluxo() {" + NL + "\t\treturn fluxo;" + NL + "\t}" + NL + "\tpublic void setFluxo(int novoFluxo) {" + NL + "\t\tfluxo = novoFluxo;" + NL + "\t}" + NL + "\t" + NL + "\tpublic void builder(ResultSet rs, ObjetoI objeto) {" + NL + "\t\t";
  protected final String TEXT_19 = NL + "\t\tif (fluxo!=FLUXO_DESCENDENTE) {" + NL + "\t\t\tascendente.setFluxo(FLUXO_ASCENDENTE);" + NL + "\t\t\tascendente.builder(rs,objeto);" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_20 = NL + "\t\t";
  protected final String TEXT_21 = " ";
  protected final String TEXT_22 = " = (";
  protected final String TEXT_23 = ") objeto;" + NL + "\t\ttry {" + NL + "\t\t\tpreparaBuilder(rs,";
  protected final String TEXT_24 = ");" + NL + "\t\t";
  protected final String TEXT_25 = "\t";
  protected final String TEXT_26 = ".";
  protected final String TEXT_27 = "(";
  protected final String TEXT_28 = "(rs));" + NL + "\t\t";
  protected final String TEXT_29 = NL + "\t\t\t";
  protected final String TEXT_30 = NL + "\t\t\tif ((fluxo != FLUXO_ASCENDENTE) && (objeto instanceof ";
  protected final String TEXT_31 = ")) {" + NL + "\t\t\t\tBuilderI builderFilha = new ";
  protected final String TEXT_32 = "();" + NL + "\t\t\t\tbuilderFilha.setFluxo(FLUXO_DESCENDENTE);" + NL + "\t\t\t\tbuilderFilha.builder(rs, ";
  protected final String TEXT_33 = ");" + NL + "\t\t\t}" + NL + "\t\t\t";
  protected final String TEXT_34 = NL + "\t\t\tcomplementaBuilder(rs,";
  protected final String TEXT_35 = ");" + NL + "\t\t} catch (SQLException e) {" + NL + "\t\t\te.printStackTrace();" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "\tpublic void complementaBuilder(ResultSet rs, ";
  protected final String TEXT_36 = " ";
  protected final String TEXT_37 = ") throws SQLException {" + NL + "\t}" + NL + "\tpublic void preparaBuilder(ResultSet rs, ";
  protected final String TEXT_38 = " ";
  protected final String TEXT_39 = ") throws SQLException {" + NL + "\t}" + NL + "" + NL + "" + NL + "\t";
  protected final String TEXT_40 = NL + "\tpublic ";
  protected final String TEXT_41 = " ";
  protected final String TEXT_42 = "(ResultSet rs)  throws SQLException {" + NL + "\t\t// A implementacao desse metodo deve ser feita em ";
  protected final String TEXT_43 = NL + "\t\t";
  protected final String TEXT_44 = NL + "\t\t//return rs.getString(\"";
  protected final String TEXT_45 = "\");" + NL + "\t\t";
  protected final String TEXT_46 = NL + "\t\t";
  protected final String TEXT_47 = NL + "\t\t//return rs.getLong(\"";
  protected final String TEXT_48 = "\");" + NL + "\t\t";
  protected final String TEXT_49 = NL + "\t\t";
  protected final String TEXT_50 = NL + "\t\t//return rs.getFloat(\"";
  protected final String TEXT_51 = "\");" + NL + "\t\t";
  protected final String TEXT_52 = NL + "\t\t";
  protected final String TEXT_53 = NL + "\t\t//if(rs.getString(\"";
  protected final String TEXT_54 = "\").equals(\"S\")) return true;" + NL + "\t\t//else return false;" + NL + "\t\t";
  protected final String TEXT_55 = NL + "\t\tthrow new MetodoNaoImplementadoException(\"";
  protected final String TEXT_56 = "\",\"";
  protected final String TEXT_57 = "(ResultSet rs)\");" + NL + "\t}" + NL + "\t";
  protected final String TEXT_58 = NL + "}";
  protected final String TEXT_59 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
//EClass eClass = (EClass) argument;  
//ClassWrapper classe = new ClassWrapper();
//classe.setClasse(eClass);
ClassWrapper classe = (ClassWrapper) argument;
AttributeWrapper atributo = new AttributeWrapper();
ReferenceWrapper referencia = null;
OperationWrapper operacao = new OperationWrapper();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteBuilderDao() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteUtil() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getPacoteReferencias() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getPacoteReferencias() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getPacoteModeloI() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getPacoteBuilderDaoImpl() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    stringBuffer.append( (classe.existeTipoData()?"import java.util.Date;":"") );
    stringBuffer.append(TEXT_9);
    stringBuffer.append(TEXT_10);
    stringBuffer.append( "/*" );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( "* Classe gerada automaticamente, nao realizar alteracoes " );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( "*/" );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeBuilderDao() );
    stringBuffer.append(TEXT_14);
    
	if (classe.getSuperTipo()!=null) { 
	
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeBuilderDao() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getSuperTipo().getNomeBuilderDaoImpl() );
    stringBuffer.append(TEXT_17);
     } 
    stringBuffer.append(TEXT_18);
     if (classe.getSuperTipo()!=null) { 
    stringBuffer.append(TEXT_19);
     } 
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_24);
    for (EAttribute item : classe.getEAttributes()) {
			atributo.setAtributo(item); 
		
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( atributo.getSetter() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( atributo.getGetter() );
    stringBuffer.append(TEXT_28);
    }
    stringBuffer.append(TEXT_29);
     
			List listaSubclasses = classe.getListaSubclasses();
			for (int i=0;i<listaSubclasses.size();i++) {
				ClassWrapper classeFilha = (ClassWrapper) listaSubclasses.get(i);
			
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classeFilha.getNomeModeloI() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classeFilha.getNomeBuilderDaoImpl() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_33);
    
			}
			
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_39);
    for (AttributeWrapper item : classe.getListaAtributo()) { 
		atributo = item;
	
    stringBuffer.append(TEXT_40);
    stringBuffer.append( atributo.getTipo());
    stringBuffer.append(TEXT_41);
    stringBuffer.append( atributo.getGetter() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( classe.getNomeBuilderDaoImpl() );
    stringBuffer.append(TEXT_43);
     if (atributo.tipoString()) { 
    stringBuffer.append(TEXT_44);
    stringBuffer.append( atributo.getNomeBD() );
    stringBuffer.append(TEXT_45);
     } 
    stringBuffer.append(TEXT_46);
     if (atributo.tipoLong()) { 
    stringBuffer.append(TEXT_47);
    stringBuffer.append( atributo.getNomeBD() );
    stringBuffer.append(TEXT_48);
     } 
    stringBuffer.append(TEXT_49);
     if (atributo.tipoFloat()) { 
    stringBuffer.append(TEXT_50);
    stringBuffer.append( atributo.getNomeBD() );
    stringBuffer.append(TEXT_51);
     } 
    stringBuffer.append(TEXT_52);
     if (atributo.tipoBoolean()) { 
    stringBuffer.append(TEXT_53);
    stringBuffer.append( atributo.getNomeBD() );
    stringBuffer.append(TEXT_54);
     } 
    stringBuffer.append(TEXT_55);
    stringBuffer.append( classe.getNomeBuilderDao() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( atributo.getGetter() );
    stringBuffer.append(TEXT_57);
    }
    stringBuffer.append(TEXT_58);
    stringBuffer.append(TEXT_59);
    return stringBuffer.toString();
  }
}
