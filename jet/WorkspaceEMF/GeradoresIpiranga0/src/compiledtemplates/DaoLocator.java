package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class DaoLocator
{
  protected static String nl;
  public static synchronized DaoLocator create(String lineSeparator)
  {
    nl = lineSeparator;
    DaoLocator result = new DaoLocator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".*;" + NL + "" + NL + "public class DaoLocator {" + NL + "\t";
  protected final String TEXT_4 = NL + "\tpublic ";
  protected final String TEXT_5 = " get";
  protected final String TEXT_6 = "() {" + NL + "\t\tString factoryName = DaoHelper.getFactoryName();" + NL + "\t\tfactory = DaoHelper.getDaoFactory(factoryName);" + NL + "\t\tfactory.beginTransaction();" + NL + "\t\t";
  protected final String TEXT_7 = " dao = (";
  protected final String TEXT_8 = ") DaoHelper.createDao(factory, Entities.ITEM_CONFIGURACAO);" + NL + "\t" + NL + "\t\treturn new dao;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_9 = NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EPackage pacote = (EPackage) argument; 
ClassWrapper classe = new ClassWrapper();
AttributeWrapper atributo = new AttributeWrapper();
ReferenceWrapper referencia = null;
Iterator<EClassifier> iterador = pacote.getEClassifiers().iterator();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteDaoI() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteMySqlDao() );
    stringBuffer.append(TEXT_3);
    
	while (iterador.hasNext()) {
		classe.setClasse((EClass) iterador.next());
	
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeDaoI() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeDaoI() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeDaoI() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeDaoI() );
    stringBuffer.append(TEXT_8);
    
	}
	
    stringBuffer.append(TEXT_9);
    return stringBuffer.toString();
  }
}
