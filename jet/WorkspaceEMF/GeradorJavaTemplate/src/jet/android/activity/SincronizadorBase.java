package jet.android.activity;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class SincronizadorBase
{
  protected static String nl;
  public static synchronized SincronizadorBase create(String lineSeparator)
  {
    nl = lineSeparator;
    SincronizadorBase result = new SincronizadorBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".app.base;" + NL + "" + NL + "import br.com.digicom.servico.ServicoLocal;" + NL + "import br.com.digicom.servico.ServicoRemoto;" + NL + "import br.com.digicom.network.WifiTest;" + NL + "import br.com.digicom.dao.DataSource;" + NL + "import br.com.digicom.log.DCLog;" + NL + "import br.com.digicom.dao.DaoSincronismo;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.*;" + NL + "import ";
  protected final String TEXT_5 = ".servico.*;" + NL + "import java.util.List;" + NL + "import android.content.Context;" + NL + "import android.util.Log;" + NL + "" + NL + "// extends AsyncTask<URL, Integer, Long> " + NL + "public abstract class SincronizadorBase  extends Thread{" + NL + "\t" + NL + "\tContext ctx = null;" + NL + "\tprivate String TAG = \"Sincronizacao\";" + NL + "\t" + NL + "\tpublic void setContexto(Context contexto) {" + NL + "\t\tctx = contexto;" + NL + "\t}" + NL + "\tpublic void run()  {" + NL + "\t\tif (WifiTest.existe(ctx)) {" + NL + "\t\t\tLog.d(TAG , \"Inicio Sincronizacao\");" + NL + "\t\t\tsincronizaDispositivoUsuario(ctx);" + NL + "\t\t\tsincronizaUsuario(ctx); // parece que vai precisar sempre. nao faz sentido Usuario_Usuario" + NL + "\t\t\tprincipal(ctx);" + NL + "\t\t\tatualizaDispositivo();" + NL + "\t\t\tLog.d(TAG , \"Final Sincronizacao\");" + NL + "\t\t} else {" + NL + "\t\t\tLog.d(TAG , \"Sem Sincronizacao - Wifi Indisponivel\");" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "\tpublic static void atualizaDispositivo() {" + NL + "\t\tDispositivoUsuarioServico dispositivoSrv = FabricaServico.getInstancia().getDispositivoUsuarioServico(FabricaServico.TIPO_SQLITE);" + NL + "\t\tDispositivoUsuario dispositivo = dispositivoSrv.getCorrente();" + NL + "\t\tif (dispositivo!=null && dispositivo.getMelhorPath()!=null) {" + NL + "\t\t\tif (dispositivo.getMelhorPath().compareTo(DataSource.getValorPath())!=0) {" + NL + "\t\t\t\tdispositivo.setMelhorPath(DataSource.getValorPath());" + NL + "\t\t\t\tdispositivoSrv.alteraParaSincronizacao(dispositivo);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "\tprotected abstract void principal(Context contexto);" + NL;
  protected final String TEXT_6 = NL + "\t" + NL + "\t@Deprecated" + NL + "\t";
  protected final String TEXT_7 = " void sincroniza";
  protected final String TEXT_8 = "(Context contexto) {" + NL + "\t\tServicoRemoto<";
  protected final String TEXT_9 = "> servicoRemoto = (ServicoRemoto<";
  protected final String TEXT_10 = ">)FabricaServico.getInstancia().get";
  protected final String TEXT_11 = "Servico(FabricaServico.TIPO_WSJSON);" + NL + "\t\tServicoLocal<";
  protected final String TEXT_12 = "> servicoLocal = (ServicoLocal<";
  protected final String TEXT_13 = ">) FabricaServico.getInstancia().get";
  protected final String TEXT_14 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "\t\ttry {" + NL + "\t\t\t// Upload das mudancas" + NL + "\t\t\tList<";
  protected final String TEXT_15 = "> listaSinc = servicoLocal.listaSincronizadaAlteracao(contexto);" + NL + "\t\t\tDCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR,this,\"";
  protected final String TEXT_16 = ": \" + listaSinc.size() + \" >> \");" + NL + "\t\t\tif (listaSinc!=null && !listaSinc.isEmpty()) {" + NL + "\t\t\t\tservicoRemoto.listaSincronizadaAlteracao(listaSinc,contexto);" + NL + "\t\t\t\tservicoLocal.limpaSinc(listaSinc); // coloquei por causa do dispositivo" + NL + "\t\t\t\tlistaSinc = null;" + NL + "\t\t\t}" + NL + "\t\t\t// Download da lista" + NL + "\t\t\tList<";
  protected final String TEXT_17 = "> lista = servicoRemoto.listaSincronizada(contexto);" + NL + "\t\t\tDCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR,this,\"";
  protected final String TEXT_18 = ": \" + lista.size() + \" << \");" + NL + "\t\t\tservicoLocal.dropCreate(contexto);" + NL + "\t\t\tservicoLocal.insertAll(lista, contexto);" + NL + "\t\t\tlista = null;" + NL + "\t\t\t" + NL + "\t\t/*" + NL + "\t\t";
  protected final String TEXT_19 = NL + "\t\t\t// Dependente" + NL + "\t\t\tServicoRemoto<";
  protected final String TEXT_20 = "> ";
  protected final String TEXT_21 = "RemotoDep = (ServicoRemoto<";
  protected final String TEXT_22 = ">)FabricaServico.getInstancia().get";
  protected final String TEXT_23 = "Servico(FabricaServico.TIPO_WSJSON);" + NL + "\t\t\tServicoLocal<";
  protected final String TEXT_24 = "> ";
  protected final String TEXT_25 = "LocalDep = (ServicoLocal<";
  protected final String TEXT_26 = ">) FabricaServico.getInstancia().get";
  protected final String TEXT_27 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "\t\t\t// Evitar que as alteracoes em itens dependentes fiquem esquecidass no mobile" + NL + "\t\t\tList<";
  protected final String TEXT_28 = "> lista";
  protected final String TEXT_29 = "DepSincAlteracao = ";
  protected final String TEXT_30 = "LocalDep.listaSincronizadaDependenteSoAlteracao(contexto);" + NL + "\t\t\tDCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR,this,\"";
  protected final String TEXT_31 = ": servicoLocal.listaSincronizadaAlteracao : \" + lista";
  protected final String TEXT_32 = "DepSincAlteracao.size());" + NL + "\t\t\tif (lista";
  protected final String TEXT_33 = "DepSincAlteracao!=null && !lista";
  protected final String TEXT_34 = "DepSincAlteracao.isEmpty()) {" + NL + "\t\t\t\t";
  protected final String TEXT_35 = "RemotoDep.listaSincronizadaAlteracao(lista";
  protected final String TEXT_36 = "DepSincAlteracao, contexto);" + NL + "\t\t\t}" + NL + "\t\t\t// Recuperacao do remote para o mobile" + NL + "\t\t\tList<";
  protected final String TEXT_37 = "> lista";
  protected final String TEXT_38 = "Dep = ";
  protected final String TEXT_39 = "RemotoDep.listaSincronizada(contexto);" + NL + "\t\t\tDCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR,this,\"";
  protected final String TEXT_40 = ": servicoRemoto.listaSincronizada : \" + lista";
  protected final String TEXT_41 = "Dep.size());" + NL + "\t\t\t";
  protected final String TEXT_42 = "LocalDep.dropCreate(contexto);" + NL + "\t\t\t";
  protected final String TEXT_43 = "LocalDep.insertAll(lista";
  protected final String TEXT_44 = "Dep, contexto);" + NL + "\t\t\t";
  protected final String TEXT_45 = NL + "\t\t" + NL + "\t\t\t";
  protected final String TEXT_46 = NL + "\t\t\t// Dependente Nivel 2" + NL + "\t\t\tServicoRemoto<";
  protected final String TEXT_47 = "> servicoRemotoDep2 = (ServicoRemoto<";
  protected final String TEXT_48 = ">)FabricaServico.getInstancia().get";
  protected final String TEXT_49 = "Servico(FabricaServico.TIPO_WSJSON);" + NL + "\t\t\tServicoLocal<";
  protected final String TEXT_50 = "> servicoLocalDep2 = (ServicoLocal<";
  protected final String TEXT_51 = ">) FabricaServico.getInstancia().get";
  protected final String TEXT_52 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "\t\t\t// Evitar que as alteracoes em itens dependentes fiquem esquecidass no mobile" + NL + "\t\t\tList<";
  protected final String TEXT_53 = "> listaDep2SincAlteracao = servicoLocalDep2.listaSincronizadaDependenteSoAlteracao(contexto);" + NL + "\t\t\tDCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR,this,\"";
  protected final String TEXT_54 = ": servicoLocal.listaSincronizadaAlteracao : \" + listaDep2SincAlteracao.size());" + NL + "\t\t\tif (listaDep2SincAlteracao!=null && !listaDep2SincAlteracao.isEmpty()) {" + NL + "\t\t\t\tservicoRemotoDep2.listaSincronizadaAlteracao(listaDep2SincAlteracao, contexto);" + NL + "\t\t\t}" + NL + "\t\t\t// Recuperacao do remote para o mobile" + NL + "\t\t\tList<";
  protected final String TEXT_55 = "> lista";
  protected final String TEXT_56 = "Dep2 = servicoRemotoDep2.listaSincronizada(contexto);" + NL + "\t\t\tDCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR,this,\"";
  protected final String TEXT_57 = ": servicoRemoto.listaSincronizada : \" + lista";
  protected final String TEXT_58 = "Dep2.size());" + NL + "\t\t\tservicoLocalDep2.dropCreate(contexto);" + NL + "\t\t\tservicoLocalDep2.insertAll(lista";
  protected final String TEXT_59 = "Dep2, contexto);" + NL + "\t\t\t";
  protected final String TEXT_60 = NL + "\t\t*/" + NL + "\t\t} catch (Exception e) {" + NL + "\t\t\tDCLog.e(DCLog.SINCRONIZACAO_SINCRONIZADOR, this, e);" + NL + "\t\t}" + NL + "\t}" + NL + "\t";
  protected final String TEXT_61 = NL + "\t@Deprecated" + NL + "\tprotected void sincroniza";
  protected final String TEXT_62 = "_Usuario(Context contexto) {" + NL + "\t\tServicoRemoto<";
  protected final String TEXT_63 = "> servicoRemoto = (ServicoRemoto<";
  protected final String TEXT_64 = ">)FabricaServico.getInstancia().get";
  protected final String TEXT_65 = "Servico(FabricaServico.TIPO_WSJSON);" + NL + "\t\tServicoLocal<";
  protected final String TEXT_66 = "> servicoLocal = (ServicoLocal<";
  protected final String TEXT_67 = ">) FabricaServico.getInstancia().get";
  protected final String TEXT_68 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "\t\t// Upload das mudancas" + NL + "\t\ttry {" + NL + "\t\t\tList<";
  protected final String TEXT_69 = "> listaSinc = servicoLocal.listaSincronizadaAlteracao(contexto);" + NL + "\t\t\tDCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR,this,\"";
  protected final String TEXT_70 = ": \" + listaSinc.size() + \" >> \");" + NL + "\t\t\tif (listaSinc!=null && !listaSinc.isEmpty()) {" + NL + "\t\t\t\tservicoRemoto.listaSincronizadaAlteracao(listaSinc,contexto);" + NL + "\t\t\t\tservicoLocal.limpaSinc(listaSinc);" + NL + "\t\t\t\tlistaSinc = null;" + NL + "\t\t\t}" + NL + "\t\t\t// Download da lista" + NL + "\t\t\tList<";
  protected final String TEXT_71 = "> lista = servicoRemoto.listaSincronizadaUsuario(contexto);" + NL + "\t\t\tDCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR,this,\"";
  protected final String TEXT_72 = ": \" + lista.size() + \" << \");" + NL + "\t\t\tservicoLocal.dropCreate(contexto);" + NL + "\t\t\tservicoLocal.insertAll(lista, contexto);" + NL + "\t\t\tlista = null;" + NL + "\t\t";
  protected final String TEXT_73 = NL + "\t\t\t// Dependente" + NL + "\t\t\tServicoRemoto<";
  protected final String TEXT_74 = "> ";
  protected final String TEXT_75 = "RemotoDep = (ServicoRemoto<";
  protected final String TEXT_76 = ">)FabricaServico.getInstancia().get";
  protected final String TEXT_77 = "Servico(FabricaServico.TIPO_WSJSON);" + NL + "\t\t\tServicoLocal<";
  protected final String TEXT_78 = "> ";
  protected final String TEXT_79 = "LocalDep = (ServicoLocal<";
  protected final String TEXT_80 = ">) FabricaServico.getInstancia().get";
  protected final String TEXT_81 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "\t\t\tif (listaSinc.isEmpty()) {" + NL + "\t\t\t\tList<";
  protected final String TEXT_82 = "> listaLocal";
  protected final String TEXT_83 = " = ";
  protected final String TEXT_84 = "LocalDep.listaSincronizadaAlteracao(contexto);" + NL + "\t\t\t\tDCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR,this,\"";
  protected final String TEXT_85 = ">: servicoLocal : \" + listaLocal";
  protected final String TEXT_86 = ".size());" + NL + "\t\t\t\tif (listaLocal";
  protected final String TEXT_87 = "!=null && !listaLocal";
  protected final String TEXT_88 = ".isEmpty()) {" + NL + "\t\t\t\t\t";
  protected final String TEXT_89 = "RemotoDep.listaSincronizadaAlteracao(listaLocal";
  protected final String TEXT_90 = ",contexto);" + NL + "\t\t\t\t\t";
  protected final String TEXT_91 = "LocalDep.limpaSinc(listaLocal";
  protected final String TEXT_92 = ");" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\tList<";
  protected final String TEXT_93 = "> lista";
  protected final String TEXT_94 = "Dep = ";
  protected final String TEXT_95 = "RemotoDep.listaSincronizadaUsuario(contexto);" + NL + "\t\t\tDCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR,this,\"";
  protected final String TEXT_96 = ": servicoRemoto : \" + lista";
  protected final String TEXT_97 = "Dep.size());" + NL + "\t\t\t";
  protected final String TEXT_98 = "LocalDep.dropCreate(contexto);" + NL + "\t\t\t";
  protected final String TEXT_99 = "LocalDep.insertAll(lista";
  protected final String TEXT_100 = "Dep, contexto);" + NL + "\t\t\t";
  protected final String TEXT_101 = NL + "\t\t\t";
  protected final String TEXT_102 = NL + "\t\t\t// Dependente Nivel 2" + NL + "\t\t\tServicoRemoto<";
  protected final String TEXT_103 = "> ";
  protected final String TEXT_104 = "RemotoDep2 = (ServicoRemoto<";
  protected final String TEXT_105 = ">)FabricaServico.getInstancia().get";
  protected final String TEXT_106 = "Servico(FabricaServico.TIPO_WSJSON);" + NL + "\t\t\tServicoLocal<";
  protected final String TEXT_107 = "> ";
  protected final String TEXT_108 = "LocalDep2 = (ServicoLocal<";
  protected final String TEXT_109 = ">) FabricaServico.getInstancia().get";
  protected final String TEXT_110 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "\t\t\tList<";
  protected final String TEXT_111 = "> lista";
  protected final String TEXT_112 = "Dep2 = ";
  protected final String TEXT_113 = "RemotoDep2.listaSincronizadaUsuario(contexto);" + NL + "\t\t\tDCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR,this,\"";
  protected final String TEXT_114 = ": servicoRemoto : \" + lista";
  protected final String TEXT_115 = "Dep2.size());" + NL + "\t\t\t";
  protected final String TEXT_116 = "LocalDep2.dropCreate(contexto);" + NL + "\t\t\t";
  protected final String TEXT_117 = "LocalDep2.insertAll(lista";
  protected final String TEXT_118 = "Dep2, contexto);" + NL + "\t\t\t";
  protected final String TEXT_119 = NL + "\t\t} catch (Exception e) {" + NL + "\t\t\tDCLog.e(DCLog.SINCRONIZACAO_SINCRONIZADOR, this, e);" + NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_120 = NL;
  protected final String TEXT_121 = NL + NL + "\t// ------------- Sincronismo Vers?o 2 ---------------------" + NL + "\t" + NL + "\t";
  protected final String TEXT_122 = NL + "\tprotected void sincroniza";
  protected final String TEXT_123 = "(Context contexto, boolean forcaAtualizacao) {" + NL + "\t\tServicoRemoto<";
  protected final String TEXT_124 = "> servicoRemoto = (ServicoRemoto<";
  protected final String TEXT_125 = ">)FabricaServico.getInstancia().get";
  protected final String TEXT_126 = "Servico(FabricaServico.TIPO_WSJSON);" + NL + "\t\tServicoLocal<";
  protected final String TEXT_127 = "> servicoLocal = (ServicoLocal<";
  protected final String TEXT_128 = ">) FabricaServico.getInstancia().get";
  protected final String TEXT_129 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "\t\tboolean teveMudanca = false;" + NL + "\t\t// Upload das mudancas" + NL + "\t\ttry {" + NL + "\t\t\tList<";
  protected final String TEXT_130 = "> listaSinc = servicoLocal.listaSincronizadaAlteracao(contexto);" + NL + "\t\t\tDCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR,this,\"";
  protected final String TEXT_131 = ": \" + listaSinc.size() + \" >> \");" + NL + "\t\t\tif (listaSinc!=null && !listaSinc.isEmpty()) {" + NL + "\t\t\t\tservicoRemoto.listaSincronizadaAlteracao(listaSinc,contexto);" + NL + "\t\t\t\tservicoLocal.limpaSinc(listaSinc);" + NL + "\t\t\t\tteveMudanca = true;" + NL + "\t\t\t}" + NL + "\t\t\t// Download da lista" + NL + "\t\t\tif (forcaAtualizacao || teveMudanca) { " + NL + "\t\t\t\tDaoSincronismo daoSinc = servicoLocal.getDaoSincronismo();" + NL + "\t\t\t\tint tamLista = servicoRemoto.listaSincronizadaDao(daoSinc, contexto);" + NL + "\t\t\t\tDCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR,this,\"";
  protected final String TEXT_132 = ": \" + tamLista +  \" << \");" + NL + "\t\t\t}" + NL + "\t\t} catch (Exception e) {" + NL + "\t\t\tDCLog.e(DCLog.SINCRONIZACAO_SINCRONIZADOR, this, e);" + NL + "\t\t}" + NL + "\t\tSystem.gc();" + NL + "\t}" + NL + "\t";
  protected final String TEXT_133 = NL + "\t// ------------------------------------------------------------" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper corrente = iterador.next();
		String tipoPermissao = (corrente.ehUsuario() || corrente.ehDispositivo() ?"private":"protected");

    stringBuffer.append(TEXT_6);
    stringBuffer.append( tipoPermissao );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    
		// Existe um problema aqui, caso a entidade tenha duas entidades Dependentes !!!!
		List<RelacionamentoWrapper> listaDep = corrente.obtemListaDependente();
		for (RelacionamentoWrapper relac : listaDep) {
			if (relac!=null) {
			
    stringBuffer.append(TEXT_19);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_44);
    
			}
			
    stringBuffer.append(TEXT_45);
    
			if (relac!=null) {
				RelacionamentoWrapper relac2 = relac.getClasseOposta().getUnicoDependenteLista();
				if (relac2!=null) {
			
    stringBuffer.append(TEXT_46);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_53);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_57);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_59);
    
				}
			}
		} // Final do for
			
    stringBuffer.append(TEXT_60);
     if (!corrente.ehUsuario() && !corrente.ehDispositivo()) { 
    stringBuffer.append(TEXT_61);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_62);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_69);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_70);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_71);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_72);
    
		List<RelacionamentoWrapper> listaDep2  = corrente.obtemListaDependente();
		for (RelacionamentoWrapper relac : listaDep2) {
			if (relac!=null) {
			
    stringBuffer.append(TEXT_73);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_74);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_75);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_76);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_77);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_78);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_82);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_85);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_86);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_87);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_89);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_90);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_91);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_92);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_93);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_94);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_96);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_97);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_99);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_100);
    
			}
			
    stringBuffer.append(TEXT_101);
    
			if (relac!=null) {
				RelacionamentoWrapper relac2 = relac.getClasseOposta().getUnicoDependenteLista();
				if (relac2!=null) {
			
    stringBuffer.append(TEXT_102);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_103);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_104);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_106);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_107);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_108);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_109);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_110);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_111);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_112);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_113);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_114);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_115);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_116);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_117);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_118);
    
				}
			}
		} // Final do for
		
    stringBuffer.append(TEXT_119);
     } 
    stringBuffer.append(TEXT_120);
    
	}

    stringBuffer.append(TEXT_121);
    
	Iterator<ClasseWrapper> itera = classes.iterator();
	while (itera.hasNext()) {
		ClasseWrapper corrente = itera.next();
		String tipoPermissao = (corrente.ehUsuario() || corrente.ehDispositivo() ?"private":"protected");
	
    stringBuffer.append(TEXT_122);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_123);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_124);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_125);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_126);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_127);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_128);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_130);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_131);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_132);
    
	}
	
    stringBuffer.append(TEXT_133);
    return stringBuffer.toString();
  }
}
