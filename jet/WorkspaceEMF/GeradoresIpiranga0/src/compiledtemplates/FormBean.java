package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class FormBean
{
  protected static String nl;
  public static synchronized FormBean create(String lineSeparator)
  {
    nl = lineSeparator;
    FormBean result = new FormBean();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import org.apache.struts.action.ActionErrors;" + NL + "import org.apache.struts.action.ActionForm;" + NL + "import org.apache.struts.action.ActionMapping;" + NL + "import org.apache.struts.validator.ValidatorActionForm;";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL + "public abstract class ";
  protected final String TEXT_9 = " extends ";
  protected final String TEXT_10 = "  ";
  protected final String TEXT_11 = " ";
  protected final String TEXT_12 = " ValidatorActionForm ";
  protected final String TEXT_13 = "{" + NL;
  protected final String TEXT_14 = NL + "    private ";
  protected final String TEXT_15 = " ";
  protected final String TEXT_16 = ";";
  protected final String TEXT_17 = NL + "\t";
  protected final String TEXT_18 = NL + "    public ";
  protected final String TEXT_19 = " ";
  protected final String TEXT_20 = "() {" + NL + "    \treturn this.";
  protected final String TEXT_21 = ";" + NL + "    }" + NL + "    public void ";
  protected final String TEXT_22 = "(";
  protected final String TEXT_23 = " ";
  protected final String TEXT_24 = ") {" + NL + "    \tthis.";
  protected final String TEXT_25 = " = ";
  protected final String TEXT_26 = ";" + NL + "    }";
  protected final String TEXT_27 = NL + "\t" + NL + "" + NL + "\t" + NL + "\tpublic void reset(ActionMapping mapping, HttpServletRequest request) {" + NL + "\t\t// Reset field values here." + NL + "    }" + NL + "" + NL + "    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {" + NL + "\t\tActionErrors errors = new ActionErrors();" + NL + "\t\t// Validate the fields in your form, adding" + NL + "\t\t// adding each error to this.errors as found, e.g." + NL + "" + NL + "\t\t// if ((field == null) || (field.length() == 0)) {" + NL + "\t\t//   errors.add(\"field\", new org.apache.struts.action.ActionError(\"error.field.required\"));" + NL + "\t\t// }" + NL + "\t\treturn errors;" + NL + "    }" + NL + "    " + NL + "} ";
  protected final String TEXT_28 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EClass eClass = (EClass) argument;
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
AttributeWrapper atributo = new AttributeWrapper();
ReferenceWrapper referencia = null;

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteFormBean() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append( (classe.existeTipoData()?"import java.util.Date;":"") );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    stringBuffer.append( "/*" );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( "* Classe gerada automaticamente, nao realizar alteracoes " );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( "*/" );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_9);
     if (classe.getSuperTipo()!=null) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getSuperTipo().getNomeFormBean() );
    stringBuffer.append(TEXT_11);
     } else { 
    stringBuffer.append(TEXT_12);
     } 
    stringBuffer.append(TEXT_13);
    for (EAttribute item : eClass.getEAttributes()) {
     	atributo.setAtributo(item);
    stringBuffer.append(TEXT_14);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( item.getName() );
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    for (EAttribute item : eClass.getEAttributes()) {
     	atributo.setAtributo(item);
    stringBuffer.append(TEXT_18);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( atributo.getGetter() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( item.getName() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( atributo.getSetter() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( item.getName() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( item.getName() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( item.getName() );
    stringBuffer.append(TEXT_26);
    }
    stringBuffer.append(TEXT_27);
    stringBuffer.append(TEXT_28);
    return stringBuffer.toString();
  }
}
