package jet.android2.framework.tela;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ResourceObj
{
  protected static String nl;
  public static synchronized ResourceObj create(String lineSeparator)
  {
    nl = lineSeparator;
    ResourceObj result = new ResourceObj();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".framework.tela;" + NL + "" + NL + "" + NL + "/**" + NL + " * Created by Paulo on 11/04/2016." + NL + " */" + NL + "public class ResourceObj {" + NL + "" + NL + "    private int codigo;" + NL + "    private String nome;" + NL + "" + NL + "    public ResourceObj(int codigo,String nome) {" + NL + "        this.codigo = codigo;" + NL + "        this.nome = nome;" + NL + "    }" + NL + "" + NL + "" + NL + "    private static final int sizeOfIntInHalfBytes = 8;" + NL + "    private static final int numberOfBitsInAHalfByte = 4;" + NL + "    private static final int halfByte = 0x0F;" + NL + "    private static final char[] hexDigits = { '0', '1', '2', '3', '4', '5'," + NL + "            '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };" + NL + "" + NL + "    public String getHexa() {" + NL + "        int dec = codigo;" + NL + "        StringBuilder hexBuilder = new StringBuilder(sizeOfIntInHalfBytes);" + NL + "        hexBuilder.setLength(sizeOfIntInHalfBytes);" + NL + "        for (int i = sizeOfIntInHalfBytes - 1; i >= 0; --i) {" + NL + "            int j = dec & halfByte;" + NL + "            hexBuilder.setCharAt(i, hexDigits[j]);" + NL + "            dec >>= numberOfBitsInAHalfByte;" + NL + "        }" + NL + "        return \"0x\" + hexBuilder.toString();" + NL + "    }" + NL + "" + NL + "    public int getCodigo() {" + NL + "        return codigo;" + NL + "    }" + NL + "    public String getNome() {" + NL + "        return nome;" + NL + "    }" + NL + "" + NL + "    public String getMensagemParaErro() {" + NL + "        return nome + \" ( \" + getHexa() + \" ) \";" + NL + "    }" + NL + "}";
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
