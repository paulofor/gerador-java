package jet.android.data;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ContractEntidade
{
  protected static String nl;
  public static synchronized ContractEntidade create(String lineSeparator)
  {
    nl = lineSeparator;
    ContractEntidade result = new ContractEntidade();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + "package  ";
  protected final String TEXT_4 = ".data.contract;" + NL + "" + NL + "" + NL + "" + NL + "import android.content.ContentResolver;" + NL + "import android.database.Cursor;" + NL + "import android.net.Uri;" + NL + "import android.provider.BaseColumns;" + NL + "import android.content.ContentUris;" + NL + "" + NL + "import java.util.ArrayList;" + NL + "import java.util.List;" + NL + "" + NL + "import ";
  protected final String TEXT_5 = ".framework.dao.DaoException;" + NL + "import ";
  protected final String TEXT_6 = ".framework.dao.DaoItemRetorno;" + NL + "import ";
  protected final String TEXT_7 = ".framework.dao.MontadorDaoI;" + NL + "import ";
  protected final String TEXT_8 = ".framework.data.MontadorDaoComposite;" + NL + "import ";
  protected final String TEXT_9 = ".framework.log.DCLog;" + NL + "import ";
  protected final String TEXT_10 = ".framework.modelo.DCIObjetoDominio;" + NL + "import ";
  protected final String TEXT_11 = ".modelo.";
  protected final String TEXT_12 = ";" + NL + "import ";
  protected final String TEXT_13 = ".modelo.montador.";
  protected final String TEXT_14 = "Montador;" + NL + "" + NL + "" + NL + "public final class ";
  protected final String TEXT_15 = "Contract implements BaseColumns {" + NL + "\t" + NL + "\t" + NL + "\tprivate static AplicacaoContract aplicacaoContract;" + NL + "\tpublic static void setAplicacaoContract(AplicacaoContract valor) {" + NL + "\t\taplicacaoContract = valor;" + NL + "\t}" + NL + "\tpublic static String getContentAuthority() {" + NL + "\t\treturn aplicacaoContract.getContentAuthority();" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tpublic static final String PATH = \"";
  protected final String TEXT_16 = "\";" + NL + "\tpublic static final String COM_COMPLEMENTO = \"ComComplemento\";" + NL + "\tpublic static final String COM_RETIRADA = \"ComRetirada\";" + NL + "" + NL + "\t//public static final Uri CONTENT_URI = aplicacaoContract.getBaseContentUri().buildUpon().appendPath(PATH).build();" + NL + "" + NL + "    //public static final String CONTENT_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + \"/\" + aplicacaoContract.getContentAuthority() + \"/\" + PATH;" + NL + "    //public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + \"/\" + aplicacaoContract.getContentAuthority() + \"/\" + PATH;" + NL + "" + NL + "    public static final String TABLE_NAME = \"";
  protected final String TEXT_17 = "\";" + NL + "    public static final String TABLE_NAME_SINC = \"";
  protected final String TEXT_18 = "_sinc\";" + NL + "" + NL + "\tpublic static Uri getContentUri() {" + NL + "\t\treturn aplicacaoContract.getBaseContentUri().buildUpon().appendPath(PATH).build();" + NL + "\t}" + NL + "\tpublic static String getContentType() {" + NL + "\t\treturn ContentResolver.CURSOR_DIR_BASE_TYPE + \"/\" + aplicacaoContract.getContentAuthority() + \"/\" + PATH;" + NL + "\t}" + NL + "\tpublic static String getContentItemType() {" + NL + "\t\treturn ContentResolver.CURSOR_ITEM_BASE_TYPE + \"/\" + aplicacaoContract.getContentAuthority() + \"/\" + PATH;" + NL + "\t}" + NL + "\tpublic static Uri build";
  protected final String TEXT_19 = "Uri(long id) {" + NL + "    \treturn ContentUris.withAppendedId(getContentUri(), id);" + NL + "    }" + NL + "    ";
  protected final String TEXT_20 = NL + "\tpublic static Uri buildGetPor";
  protected final String TEXT_21 = "Uri(long id) {" + NL + "    \tUri saida = getContentUri();" + NL + "\t\tsaida = saida.buildUpon().appendPath(\"\"+id).build();" + NL + "\t\tsaida = saida.buildUpon().appendPath(";
  protected final String TEXT_22 = "Contract.PATH).build();" + NL + "    \treturn saida;" + NL + "    }" + NL + "\t";
  protected final String TEXT_23 = NL + "\t" + NL + "\t";
  protected final String TEXT_24 = NL + "    //public static final int COL_ID = 0;" + NL + "   ";
  protected final String TEXT_25 = NL + "    public static final String COLUNA_";
  protected final String TEXT_26 = " = \"";
  protected final String TEXT_27 = "\";" + NL + "    public static final int COL_";
  protected final String TEXT_28 = " = ";
  protected final String TEXT_29 = ";";
  protected final String TEXT_30 = NL + "    public static final String COLUNA_";
  protected final String TEXT_31 = " = \"";
  protected final String TEXT_32 = "\";" + NL + "    public static final int COL_";
  protected final String TEXT_33 = " = ";
  protected final String TEXT_34 = ";" + NL + "\t";
  protected final String TEXT_35 = NL + "    public static final String COLUNA_";
  protected final String TEXT_36 = " = \"";
  protected final String TEXT_37 = "\";" + NL + "    public static final int COL_";
  protected final String TEXT_38 = " = ";
  protected final String TEXT_39 = ";" + NL + "\t";
  protected final String TEXT_40 = NL + "\t" + NL + " \tpublic static final String COLUNA_CHAVE = COLUNA_";
  protected final String TEXT_41 = ";" + NL + " \tpublic static final String COLUNA_OPERACAO_SINC = \"operacao_sinc\";" + NL + " \tpublic static final int COL_OPERACAO_SINC = ";
  protected final String TEXT_42 = ";" + NL + "\t" + NL + "\tpublic static final String[] COLS = new String[] { " + NL + "\t\t\tTABLE_NAME + \".\" + COLUNA_CHAVE";
  protected final String TEXT_43 = NL + "        \t, TABLE_NAME + \".\" +COLUNA_";
  protected final String TEXT_44 = NL + "\t\t\t, TABLE_NAME + \".\" +COLUNA_";
  protected final String TEXT_45 = NL + "\t";
  protected final String TEXT_46 = NL + "    };" + NL + "    " + NL + "    public static final String[] COLS_SINC = new String[] { " + NL + "\t\t\tTABLE_NAME_SINC + \".\" + COLUNA_CHAVE";
  protected final String TEXT_47 = NL + "        \t, TABLE_NAME_SINC + \".\" +COLUNA_";
  protected final String TEXT_48 = NL + "\t\t\t, TABLE_NAME_SINC + \".\" +COLUNA_";
  protected final String TEXT_49 = NL + "\t";
  protected final String TEXT_50 = NL + "\t\t\t, TABLE_NAME_SINC + \".\" + COLUNA_OPERACAO_SINC" + NL + "    };" + NL + "    " + NL + "    private static ";
  protected final String TEXT_51 = "Operacao operacao = new ";
  protected final String TEXT_52 = "Operacao();";
  protected final String TEXT_53 = NL + " \tpublic static Uri build";
  protected final String TEXT_54 = "() {" + NL + "\t\treturn operacao.build";
  protected final String TEXT_55 = "(getFiltro());" + NL + "    }" + NL + "    private static MontadorDaoI _montador";
  protected final String TEXT_56 = " = null;" + NL + "    public static MontadorDaoI getMontador";
  protected final String TEXT_57 = "() {" + NL + "    \treturn _montador";
  protected final String TEXT_58 = ";" + NL + "    }" + NL + "    public static void setMontador";
  protected final String TEXT_59 = "(MontadorDaoI montador) {" + NL + "    \t_montador";
  protected final String TEXT_60 = " = montador;" + NL + "    }";
  protected final String TEXT_61 = NL + "    " + NL + "\tprivate static ";
  protected final String TEXT_62 = "Filtro filtro = null;" + NL + "\tpublic static ";
  protected final String TEXT_63 = "Filtro getFiltro() {" + NL + "\t\tif (filtro==null) {" + NL + "\t\t\tfiltro = new ";
  protected final String TEXT_64 = "Filtro();" + NL + "\t\t}" + NL + "\t\treturn filtro;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "    public static Uri buildAllSinc() {" + NL + "\t\tUri saida = getContentUri();" + NL + "\t\tsaida = saida.buildUpon().appendPath(\"Sinc\").build();" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t" + NL + "\tpublic static Uri buildAll() {" + NL + "\t\tUri saida = getContentUri();" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t" + NL + "\tpublic static Uri buildInsereSinc() {" + NL + "\t\tUri saida = getContentUri();" + NL + "\t\tsaida = saida.buildUpon().appendPath(\"InsereSinc\").build();" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tpublic static Uri buildAtualizaSinc() {" + NL + "\t\tUri saida = getContentUri();" + NL + "\t\tsaida = saida.buildUpon().appendPath(\"AtualizaSinc\").build();" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t" + NL + "\t// Sem chave" + NL + "\t";
  protected final String TEXT_65 = NL + "\tpublic static String innerJoin";
  protected final String TEXT_66 = "_";
  protected final String TEXT_67 = "() {" + NL + "\t\treturn \" inner join \" + ";
  protected final String TEXT_68 = "Contract.TABLE_NAME + \" on \" + ";
  protected final String TEXT_69 = "Contract.TABLE_NAME + \".";
  protected final String TEXT_70 = " = \" + TABLE_NAME + \".\" + COLUNA_CHAVE + \" \";  " + NL + "\t}" + NL + "\tpublic static String innerJoinSinc";
  protected final String TEXT_71 = "_";
  protected final String TEXT_72 = "() {" + NL + "\t\treturn \" inner join \" + ";
  protected final String TEXT_73 = "Contract.TABLE_NAME_SINC + \" on \" + ";
  protected final String TEXT_74 = "Contract.TABLE_NAME_SINC + \".";
  protected final String TEXT_75 = " = \" + TABLE_NAME_SINC + \".\" + COLUNA_CHAVE + \" \";  " + NL + "\t}" + NL + "\tpublic static String outerJoin";
  protected final String TEXT_76 = "_";
  protected final String TEXT_77 = "() {" + NL + "\t\treturn \" left outer join \" + ";
  protected final String TEXT_78 = "Contract.TABLE_NAME + \" on \" + ";
  protected final String TEXT_79 = "Contract.TABLE_NAME + \".";
  protected final String TEXT_80 = " = \" + TABLE_NAME + \".\" + COLUNA_CHAVE + \" \"; " + NL + "\t}" + NL + "\tpublic static String outerJoinSinc";
  protected final String TEXT_81 = "_";
  protected final String TEXT_82 = "() {" + NL + "\t\treturn \" left outer join \" + ";
  protected final String TEXT_83 = "Contract.TABLE_NAME_SINC + \" on \" + ";
  protected final String TEXT_84 = "Contract.TABLE_NAME_SINC + \".";
  protected final String TEXT_85 = " = \" + TABLE_NAME_SINC + \".\" + COLUNA_CHAVE + \" \";   " + NL + "\t}" + NL + "\tpublic static MontadorDaoI adicionaMontador";
  protected final String TEXT_86 = "Lista (MontadorDaoI montador) {" + NL + "\t\t((MontadorDaoComposite)montador).adicionaMontador(";
  protected final String TEXT_87 = "Contract.getMontador(), \"";
  protected final String TEXT_88 = "_";
  protected final String TEXT_89 = "\");" + NL + "\t\treturn montador;" + NL + "\t}" + NL + " \t";
  protected final String TEXT_90 = NL + "\t// Com chave" + NL + "\t";
  protected final String TEXT_91 = NL + "\t";
  protected final String TEXT_92 = NL + "\tpublic static String innerJoin";
  protected final String TEXT_93 = "_";
  protected final String TEXT_94 = "() {" + NL + "\t\treturn \" inner join \" + ";
  protected final String TEXT_95 = "Contract.TABLE_NAME + \" on \" + ";
  protected final String TEXT_96 = "Contract.TABLE_NAME + \".\" + ";
  protected final String TEXT_97 = "Contract.COLUNA_CHAVE + \" = \" + TABLE_NAME + \".\" + COLUNA_";
  protected final String TEXT_98 = " + \" \";  " + NL + "\t}" + NL + "\tpublic static String innerJoinSinc";
  protected final String TEXT_99 = "_";
  protected final String TEXT_100 = "() {" + NL + "\t\treturn \" inner join \" + ";
  protected final String TEXT_101 = "Contract.TABLE_NAME_SINC + \" on \" + ";
  protected final String TEXT_102 = "Contract.TABLE_NAME_SINC + \".\" + ";
  protected final String TEXT_103 = "Contract.COLUNA_CHAVE + \" = \" + TABLE_NAME_SINC + \".\" + COLUNA_";
  protected final String TEXT_104 = " + \" \";  " + NL + "\t}" + NL + "\tpublic static String outerJoin";
  protected final String TEXT_105 = "_";
  protected final String TEXT_106 = "() {" + NL + "\t\treturn \" left outer join \" + ";
  protected final String TEXT_107 = "Contract.TABLE_NAME + \" on \" + ";
  protected final String TEXT_108 = "Contract.TABLE_NAME + \".\" + ";
  protected final String TEXT_109 = "Contract.COLUNA_CHAVE + \" = \" + TABLE_NAME + \".\" + COLUNA_";
  protected final String TEXT_110 = " + \" \"; " + NL + "\t}" + NL + "\tpublic static String outerJoinSinc";
  protected final String TEXT_111 = "_";
  protected final String TEXT_112 = "() {" + NL + "\t\treturn \" left outer join \" + ";
  protected final String TEXT_113 = "Contract.TABLE_NAME_SINC + \" on \" + ";
  protected final String TEXT_114 = "Contract.TABLE_NAME_SINC + \".\" + ";
  protected final String TEXT_115 = "Contract.COLUNA_CHAVE + \" = \" + TABLE_NAME_SINC + \".\" + COLUNA_";
  protected final String TEXT_116 = " + \" \";   " + NL + "\t}" + NL + "\t";
  protected final String TEXT_117 = NL + "\t" + NL + "\tpublic static MontadorDaoI adicionaMontador";
  protected final String TEXT_118 = " (MontadorDaoI montador) {" + NL + "\t\t((MontadorDaoComposite)montador).adicionaMontador(";
  protected final String TEXT_119 = "Contract.getMontador(), \"";
  protected final String TEXT_120 = "_";
  protected final String TEXT_121 = "\");" + NL + "\t\treturn montador;" + NL + "\t}" + NL + "\tpublic static Uri adiciona";
  protected final String TEXT_122 = "(Uri uri) {" + NL + "\t\treturn uri.buildUpon().appendPath(\"Com";
  protected final String TEXT_123 = "\").build();" + NL + "\t}" + NL + " \t";
  protected final String TEXT_124 = NL + "\t" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\tpublic static String camposOrdenados() " + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_125 = "\" \" + TABLE_NAME + \".\" + COLUNA_";
  protected final String TEXT_126 = "  " + NL + "\t\t";
  protected final String TEXT_127 = "+ \" , \" + TABLE_NAME + \".\" + COLUNA_";
  protected final String TEXT_128 = " " + NL + "\t\t";
  protected final String TEXT_129 = NL + "\t\t";
  protected final String TEXT_130 = NL + "\t\t+ \" , \" + TABLE_NAME + \".\" + COLUNA_";
  protected final String TEXT_131 = " " + NL + "\t\t";
  protected final String TEXT_132 = NL + "\t\t;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\tpublic static String camposOrdenadosSinc() " + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_133 = "\" ";
  protected final String TEXT_134 = " \" " + NL + "\t\t";
  protected final String TEXT_135 = "+ \" ,";
  protected final String TEXT_136 = " \" " + NL + "\t\t";
  protected final String TEXT_137 = NL + "\t\t";
  protected final String TEXT_138 = NL + "\t\t+ \" , \" + TABLE_NAME_SINC + \".\" + COLUNA_";
  protected final String TEXT_139 = " " + NL + "\t\t";
  protected final String TEXT_140 = NL + "\t\t+ \" ,";
  protected final String TEXT_141 = "_sinc.operacao_sinc \"" + NL + "\t\t;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tpublic static MontadorDaoComposite getMontadorComposto() {" + NL + "\t\tMontadorDaoComposite montador = new MontadorDaoComposite();" + NL + "\t\tmontador.adicionaMontador(getMontador(),null);" + NL + "\t\treturn montador;" + NL + "\t}" + NL + "\tpublic static MontadorDaoI getMontador() {" + NL + "\t\treturn new ";
  protected final String TEXT_142 = "Montador();" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t// ComChaveEstrangeira" + NL + "  \t";
  protected final String TEXT_143 = NL + "\tpublic static Uri buildAllCom";
  protected final String TEXT_144 = "() {" + NL + "\t\tUri saida = getContentUri();" + NL + "\t\tsaida = saida.buildUpon().appendPath(";
  protected final String TEXT_145 = "Contract.COM_COMPLEMENTO).build();" + NL + "\t\tsaida = saida.buildUpon().appendPath(\"Com";
  protected final String TEXT_146 = "\").build();" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t//  Recoloquei o metodo abaixo pq existe referencia no Provider" + NL + "\tpublic static Uri buildAllSem";
  protected final String TEXT_147 = "() {" + NL + "\t\tUri saida = getContentUri();" + NL + "\t\tsaida = saida.buildUpon().appendPath(";
  protected final String TEXT_148 = "Contract.COM_COMPLEMENTO).build();" + NL + "\t\tsaida = saida.buildUpon().appendPath(\"Sem";
  protected final String TEXT_149 = "\").build();" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_150 = NL + "\t" + NL + "\t// SemChaveEstrangeira" + NL + "  \t";
  protected final String TEXT_151 = NL + "\t";
  protected final String TEXT_152 = NL + "\tpublic static Uri buildAllCom";
  protected final String TEXT_153 = "() {" + NL + "\t\tUri saida = getContentUri();" + NL + "\t\tsaida = saida.buildUpon().appendPath(";
  protected final String TEXT_154 = "Contract.COM_COMPLEMENTO).build();" + NL + "\t\tsaida = saida.buildUpon().appendPath(\"Com";
  protected final String TEXT_155 = "\").build();" + NL + "\t\treturn saida;" + NL + "\t}\t" + NL + "\tpublic static Uri buildAllSem";
  protected final String TEXT_156 = "() {" + NL + "\t\tUri saida = getContentUri();" + NL + "\t\tsaida = saida.buildUpon().appendPath(";
  protected final String TEXT_157 = "Contract.COM_RETIRADA).build();" + NL + "\t\tsaida = saida.buildUpon().appendPath(\"Sem";
  protected final String TEXT_158 = "\").build();" + NL + "\t\treturn saida;" + NL + "\t}\t" + NL + "\t";
  protected final String TEXT_159 = NL + "\t";
  protected final String TEXT_160 = NL + "\t" + NL + "\tpublic static Uri buildDeleteAllSinc() {" + NL + "\t\tUri saida = getContentUri();" + NL + "\t\tsaida = saida.buildUpon().appendPath(\"DeleteAllSinc\").build();" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tpublic static Uri buildDeleteAllRecreate() {" + NL + "\t\tUri saida = getContentUri();" + NL + "\t\tsaida = saida.buildUpon().appendPath(\"DeleteAllRecreate\").build();" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tpublic static Uri buildDeleteSinc(int id) {" + NL + "\t\tUri saida = getContentUri();" + NL + "\t\tsaida = saida.buildUpon().appendPath(\"DeleteSinc\").build();" + NL + "\t\treturn ContentUris.withAppendedId(saida, id);" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tpublic static List<";
  protected final String TEXT_161 = "> converteLista(Cursor data) {" + NL + "\t\treturn converteLista(data, getMontador());" + NL + "\t}" + NL + "\tpublic static List<";
  protected final String TEXT_162 = "> converteLista(Cursor data, MontadorDaoI montador) {" + NL + "        //MontadorDaoI montador = getMontador();" + NL + "        List lista = new ArrayList();" + NL + "        try {" + NL + "            lista = getListaSqlListaInterna(data, montador);" + NL + "        } catch (Exception e) {" + NL + "            lista = new ArrayList();" + NL + "        }" + NL + "        return lista;" + NL + "    }" + NL + "    private static List getListaSqlListaInterna(Cursor c, MontadorDaoI montador) throws DaoException {" + NL + "        ArrayList<DCIObjetoDominio> listaSaida = new ArrayList<DCIObjetoDominio>();" + NL + "        int numRows = c.getCount();" + NL + "        boolean insere = false;" + NL + "        DCIObjetoDominio objeto = null;" + NL + "        DaoItemRetorno retorno = null;" + NL + "        while (c.moveToNext()) {" + NL + "            try {" + NL + "                retorno = montador.extraiRegistroListaInterna(c, objeto);" + NL + "                insere = retorno.getInsere();" + NL + "                objeto = retorno.getObjeto();" + NL + "            } catch (Exception e) {" + NL + "                DCLog.e(DCLog.DATABASE_ERRO_CORE, null, e);" + NL + "            }" + NL + "            if (insere) {" + NL + "                listaSaida.add(objeto);" + NL + "            }" + NL + "        }" + NL + "        return listaSaida;" + NL + "    }" + NL + "\t" + NL + "" + NL + "\tpublic static Uri buildAtualiza() {" + NL + "\t\tUri saida = getContentUri();" + NL + "\t\tsaida = saida.buildUpon().appendPath(\"Atualiza\").build();" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    
	AtributoWrapper atributoW = new AtributoWrapperAndroid();
	AtributoWrapper chaveW = new AtributoWrapperAndroid();
	chaveW.setBase(classe.getChave());
	

    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    
	Iterator<RelacionamentoWrapper> iterador = classe.obtemListaComChaveEstrangeira().iterator();
	while (iterador.hasNext()) {
		RelacionamentoWrapper relCorrente = iterador.next();
	
    stringBuffer.append(TEXT_20);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( relCorrente.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    
	}
	
    stringBuffer.append(TEXT_23);
    
    int cont = 0;
    
    stringBuffer.append(TEXT_24);
    
    for (AtributoEntidade corrente : classe.getListaAtributoEntidade()) {
     	atributoW.setBase(corrente);
    
    stringBuffer.append(TEXT_25);
    stringBuffer.append( atributoW.getNomeConstante() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( atributoW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( atributoW.getNomeConstante() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( String.valueOf(cont++) );
    stringBuffer.append(TEXT_29);
    
    }
    for (RelacionamentoWrapper relCorrente : classe.obtemListaComChaveEstrangeiraComUsuario()) {
	
    stringBuffer.append(TEXT_30);
    stringBuffer.append( relCorrente.getNomeConstante() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( relCorrente.getNomeCampoTabela() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( relCorrente.getNomeConstante() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( String.valueOf(cont++) );
    stringBuffer.append(TEXT_34);
    
	}
	for (ProcValorWrapper proc : classe.getListaDerivadaDemanda()) {
	
    stringBuffer.append(TEXT_35);
    stringBuffer.append( proc.getNomeConstante() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( proc.getNomeCampoTabela() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( proc.getNomeConstante() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( String.valueOf(cont++) );
    stringBuffer.append(TEXT_39);
    
	}
	
    stringBuffer.append(TEXT_40);
    stringBuffer.append( classe.getChaveW().getNomeConstante() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( String.valueOf(cont++) );
    stringBuffer.append(TEXT_42);
     
    for (AtributoEntidade corrente : classe.getListaAtributoEntidadeSemChave()) {
     	atributoW.setBase(corrente);
    
    stringBuffer.append(TEXT_43);
    stringBuffer.append( atributoW.getNomeConstante() );
    
     }
    
    
    for (RelacionamentoWrapper relCorrente : classe.obtemListaComChaveEstrangeiraComUsuario()) {
	
    stringBuffer.append(TEXT_44);
    stringBuffer.append( relCorrente.getNomeConstante() );
    stringBuffer.append(TEXT_45);
    
	}
	
    stringBuffer.append(TEXT_46);
     
    for (AtributoEntidade corrente : classe.getListaAtributoEntidadeSemChave()) {
     	atributoW.setBase(corrente);
    
    stringBuffer.append(TEXT_47);
    stringBuffer.append( atributoW.getNomeConstante() );
    
     }
    
    
    for (RelacionamentoWrapper relCorrente : classe.obtemListaComChaveEstrangeiraComUsuario()) {
	
    stringBuffer.append(TEXT_48);
    stringBuffer.append( relCorrente.getNomeConstante() );
    stringBuffer.append(TEXT_49);
    
	}
	
    stringBuffer.append(TEXT_50);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_52);
    
 	for (RegraColecao regra : classe.getListaRegraColecao()) {
 	if (regra.getAtivoFlex()) {

    stringBuffer.append(TEXT_53);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_57);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_60);
    
 	}
 	}

    stringBuffer.append(TEXT_61);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_62);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_64);
    
	Iterator<RelacionamentoWrapper> itSemChave = classe.obtemListaSemChaveEstrangeira().iterator();
	while (itSemChave.hasNext()) {
	RelacionamentoWrapper relac = itSemChave.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	AtributoWrapper chaveOposta = classeOposta.getChaveW();
	
    stringBuffer.append(TEXT_65);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_69);
    stringBuffer.append( relac.getNomeCampoTabelaEntidadeOposta() );
    stringBuffer.append(TEXT_70);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_71);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_72);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_73);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_74);
    stringBuffer.append( relac.getNomeCampoTabelaEntidadeOposta() );
    stringBuffer.append(TEXT_75);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_76);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_77);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_78);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append( relac.getNomeCampoTabelaEntidadeOposta() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_82);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( relac.getNomeCampoTabelaEntidadeOposta() );
    stringBuffer.append(TEXT_85);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_86);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_87);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_89);
    
		}
	
    stringBuffer.append(TEXT_90);
    
	Iterator<RelacionamentoWrapper> itComChave = classe.obtemListaComChaveEstrangeira().iterator();
	while (itComChave.hasNext()) {
	RelacionamentoWrapper relac = itComChave.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	AtributoWrapper chaveOposta = classeOposta.getChaveW();
	
    stringBuffer.append(TEXT_91);
     if (!relac.ehAuto()) { 
    stringBuffer.append(TEXT_92);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_93);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_94);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_96);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_97);
    stringBuffer.append( relac.getNomeConstante() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_99);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_100);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_101);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_102);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_103);
    stringBuffer.append( relac.getNomeConstante() );
    stringBuffer.append(TEXT_104);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_106);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_107);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_108);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_109);
    stringBuffer.append( relac.getNomeConstante() );
    stringBuffer.append(TEXT_110);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_111);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_112);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_113);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_114);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_115);
    stringBuffer.append( relac.getNomeConstante() );
    stringBuffer.append(TEXT_116);
     } // Auto 
    stringBuffer.append(TEXT_117);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento());
    stringBuffer.append(TEXT_118);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_119);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_120);
    stringBuffer.append( relac.getNomeRelacionamento());
    stringBuffer.append(TEXT_121);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento());
    stringBuffer.append(TEXT_122);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento());
    stringBuffer.append(TEXT_123);
    
		}
	
    stringBuffer.append(TEXT_124);
    
		Iterator<AtributoTotalI> iterador9 = classe.getListaAtributoTotal().iterator();
		boolean primeiro = true;
		while (iterador9.hasNext()) {
		AtributoTotalI atributo = iterador9.next();
		String campo = classe.getNomeParaTabela() + "." + atributo.getNomeCampoTabela();
		if (primeiro) {
		
    stringBuffer.append(TEXT_125);
    stringBuffer.append( atributo.getNomeConstante() );
    stringBuffer.append(TEXT_126);
     } else { 
    stringBuffer.append(TEXT_127);
    stringBuffer.append( atributo.getNomeConstante() );
    stringBuffer.append(TEXT_128);
    
		}
		primeiro = false;
		}
		
    stringBuffer.append(TEXT_129);
     for (ProcValorWrapper proc : classe.getListaDerivadaDemanda()) { 
    stringBuffer.append(TEXT_130);
    stringBuffer.append( proc.getNomeConstante() );
    stringBuffer.append(TEXT_131);
     } 
    stringBuffer.append(TEXT_132);
    
		Iterator<AtributoTotalI> iterador11 = classe.getListaAtributoTotal().iterator();
		primeiro = true;
		while (iterador11.hasNext()) {
		AtributoTotalI atributo = iterador11.next();
		String campo = classe.getNomeParaTabela() + "_sinc." + atributo.getNomeCampoTabela();
		if (primeiro) {
		
    stringBuffer.append(TEXT_133);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_134);
     } else { 
    stringBuffer.append(TEXT_135);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_136);
    
		}
		primeiro = false;
		}
		
    stringBuffer.append(TEXT_137);
     for (ProcValorWrapper proc : classe.getListaDerivadaDemanda()) { 
    stringBuffer.append(TEXT_138);
    stringBuffer.append( proc.getNomeConstante() );
    stringBuffer.append(TEXT_139);
     } 
    stringBuffer.append(TEXT_140);
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_141);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_142);
    
	Iterator<RelacionamentoWrapper> iteradorRel = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
	while (iteradorRel.hasNext()) {
	RelacionamentoWrapper relac = iteradorRel.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_143);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_144);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_145);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_146);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_147);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_148);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_149);
    
	}
	
    stringBuffer.append(TEXT_150);
    
	Iterator<RelacionamentoWrapper> iteradorRel2 = classe.obtemListaSemChaveEstrangeira().iterator();
	while (iteradorRel2.hasNext()) {
	RelacionamentoWrapper relac = iteradorRel2.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_151);
     if (!relac.ehAuto()) { 
    stringBuffer.append(TEXT_152);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_153);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_154);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_155);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_156);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_157);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_158);
     } // Auto 
    stringBuffer.append(TEXT_159);
    
	}
	
    stringBuffer.append(TEXT_160);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_161);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_162);
    return stringBuffer.toString();
  }
}
