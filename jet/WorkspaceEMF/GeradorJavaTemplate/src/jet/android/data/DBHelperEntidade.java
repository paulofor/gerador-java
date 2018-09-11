package jet.android.data;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DBHelperEntidade
{
  protected static String nl;
  public static synchronized DBHelperEntidade create(String lineSeparator)
  {
    nl = lineSeparator;
    DBHelperEntidade result = new DBHelperEntidade();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".data.helper;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".data.contract.*;" + NL + "" + NL + "public class ";
  protected final String TEXT_5 = "DbHelper {" + NL + "" + NL + "\tprotected static String getSqlChavesEstrangeiras() {" + NL + "\t\treturn  \"ALTER TABLE \" +";
  protected final String TEXT_6 = NL + "        ";
  protected final String TEXT_7 = "Contract.TABLE_NAME + \" \" +";
  protected final String TEXT_8 = NL + "\t\t\" ADD FOREIGN KEY (\" + ";
  protected final String TEXT_9 = "Contract.COLUNA_";
  protected final String TEXT_10 = " + \") REFERENCES \" + ";
  protected final String TEXT_11 = "Contract.TABLE_NAME + \" (\" + ";
  protected final String TEXT_12 = "Contract.COLUNA_CHAVE + \")  \" + ";
  protected final String TEXT_13 = NL + "        \";\";" + NL + "\t}" + NL + "" + NL + "\tprotected static String getSqlCreate(){" + NL + "\t\treturn  \"CREATE TABLE IF NOT EXISTS \"" + NL + "        + ";
  protected final String TEXT_14 = "Contract.TABLE_NAME + \" (\" +";
  protected final String TEXT_15 = NL + "        ";
  protected final String TEXT_16 = "Contract.COLUNA_CHAVE + \" INTEGER PRIMARY KEY \" ";
  protected final String TEXT_17 = NL + "        + \" , \" + ";
  protected final String TEXT_18 = "Contract.COLUNA_";
  protected final String TEXT_19 = " + \" ";
  protected final String TEXT_20 = " \"";
  protected final String TEXT_21 = NL + "\t\t+ \" , \" + ";
  protected final String TEXT_22 = "Contract.COLUNA_";
  protected final String TEXT_23 = " + \" INTEGER \"" + NL + "\t\t";
  protected final String TEXT_24 = NL + "\t\t//+ getSqlChaveEstrangeira()" + NL + "\t\t+ getSqlProcValor()" + NL + "\t\t+ getSqlIndices()" + NL + "        + \");\";" + NL + "\t}" + NL + "\tprotected static String getSqlCreateSinc(){" + NL + "\t\treturn  \"CREATE TABLE IF NOT EXISTS \"" + NL + "        + ";
  protected final String TEXT_25 = "Contract.TABLE_NAME_SINC + \" (\" +";
  protected final String TEXT_26 = NL + "        ";
  protected final String TEXT_27 = "Contract.COLUNA_CHAVE + \" INTEGER \" ";
  protected final String TEXT_28 = NL + "        + \" , \" + ";
  protected final String TEXT_29 = "Contract.COLUNA_";
  protected final String TEXT_30 = " + \" ";
  protected final String TEXT_31 = " \"";
  protected final String TEXT_32 = NL + "\t\t+ \" , \" + ";
  protected final String TEXT_33 = "Contract.COLUNA_";
  protected final String TEXT_34 = " + \" INTEGER \"" + NL + "\t\t";
  protected final String TEXT_35 = NL + "        + \", operacao_sinc TEXT);\";" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tprivate static String getSqlIndices() {" + NL + "\t\treturn \"\";" + NL + "\t}" + NL + "\t" + NL + "\tprivate static String getSqlProcValor() {" + NL + "\t\tString saida = \"\";" + NL + "\t\t";
  protected final String TEXT_36 = NL + "\t\tsaida += \" , \" + ";
  protected final String TEXT_37 = "Contract.COLUNA_";
  protected final String TEXT_38 = " + \" ";
  protected final String TEXT_39 = " \";" + NL + "\t\t";
  protected final String TEXT_40 = NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tprivate static String getSqlChaveEstrangeira() {" + NL + "\t\tString saida = \"\";";
  protected final String TEXT_41 = NL + "\t\tsaida += \" , FOREIGN KEY (\" + ";
  protected final String TEXT_42 = "Contract.COLUNA_";
  protected final String TEXT_43 = " + \") REFERENCES \" + ";
  protected final String TEXT_44 = "Contract.TABLE_NAME + \" (\" + ";
  protected final String TEXT_45 = "Contract.COLUNA_CHAVE + \") \";";
  protected final String TEXT_46 = NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t" + NL + "\tpublic static String getSqlDrop() {" + NL + "\t\treturn \"DROP TABLE IF EXISTS \" + ";
  protected final String TEXT_47 = "Contract.TABLE_NAME;" + NL + "\t}" + NL + "\tpublic static String getSqlDropSinc() {" + NL + "\t\treturn \"DROP TABLE IF EXISTS \" + ";
  protected final String TEXT_48 = "Contract.TABLE_NAME_SINC;" + NL + "\t}" + NL + "\t" + NL + "\tpublic static String onUpgrade(int oldVersion, int newVersion) { // pode precisar dos params no futuro" + NL + "\t \treturn \"DROP TABLE IF EXISTS \" + ";
  protected final String TEXT_49 = "Contract.TABLE_NAME;" + NL + "    }" + NL + "    public static String onUpgradeSinc(int oldVersion, int newVersion) { // pode precisar dos params no futuro" + NL + "\t \treturn \"DROP TABLE IF EXISTS \" + ";
  protected final String TEXT_50 = "Contract.TABLE_NAME_SINC;" + NL + "    }" + NL + "    " + NL + "   " + NL + "   " + NL + "    " + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    
	AtributoWrapper atributoW = new AtributoWrapperAndroid();
	AtributoWrapper chaveW = new AtributoWrapperAndroid();
	chaveW.setBase(classe.getChave());
	

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    
		Iterator<RelacionamentoWrapper> iteradorRel3 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iteradorRel3.hasNext()) {
			RelacionamentoWrapper relCorrente = iteradorRel3.next();
			ClasseWrapper classeOposta = relCorrente.getClasseOposta();

    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( relCorrente.getNomeConstante() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    
	}

    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
     
        for (AtributoEntidade atributo :classe.getListaAtributoEntidadeSemChave()) { 
        	atributoW.setBase(atributo);
        
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( atributoW.getNomeConstante() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( atributoW.getTipoSqlite() );
    stringBuffer.append(TEXT_20);
    
        }
        
    
		for (RelacionamentoWrapper relCorrente : classe.obtemListaComChaveEstrangeiraComUsuario()) {
		
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( relCorrente.getNomeConstante() );
    stringBuffer.append(TEXT_23);
    
		}
		
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
     
        for (AtributoEntidade atributo :classe.getListaAtributoEntidadeSemChave()) { 
        	atributoW.setBase(atributo);
        
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( atributoW.getNomeConstante() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( atributoW.getTipoSqlite() );
    stringBuffer.append(TEXT_31);
    
        }
        
    
		for (RelacionamentoWrapper relCorrente : classe.obtemListaComChaveEstrangeiraComUsuario()) {
		
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( relCorrente.getNomeConstante() );
    stringBuffer.append(TEXT_34);
    
		}
		
    stringBuffer.append(TEXT_35);
     for (ProcValorWrapper proc : classe.getListaDerivadaDemanda()) { 
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( proc.getNomeConstante() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( proc.getTipoSqlite() );
    stringBuffer.append(TEXT_39);
     } 
    stringBuffer.append(TEXT_40);
    
	Iterator<RelacionamentoWrapper> iteradorRel2 = classe.obtemListaComChaveEstrangeira().iterator();
	while (iteradorRel2.hasNext()) {
		RelacionamentoWrapper relCorrente = iteradorRel2.next();
		ClasseWrapper classeOposta = relCorrente.getClasseOposta();

    stringBuffer.append(TEXT_41);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( relCorrente.getNomeConstante() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_45);
    
	}

    stringBuffer.append(TEXT_46);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_50);
    return stringBuffer.toString();
  }
}
