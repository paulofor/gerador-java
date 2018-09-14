package jet.cs.vo;

public class MobileVo
{
  protected static String nl;
  public static synchronized MobileVo create(String lineSeparator)
  {
    nl = lineSeparator;
    MobileVo result = new MobileVo();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using System;" + NL;
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
