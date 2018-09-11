package jet.android2.framework.sincronismo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DCSincronizador
{
  protected static String nl;
  public static synchronized DCSincronizador create(String lineSeparator)
  {
    nl = lineSeparator;
    DCSincronizador result = new DCSincronizador();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".framework.fcm;" + NL + "" + NL + "" + NL + "/*" + NL + "Sincronizacao Inicial" + NL + "" + NL + "1- DCFirebaseInstanceIDService.onTokenRefresh <- Recebendo do FCM" + NL + "2- sincronizador.sincronizaUsuarioDispositivoFcmId -> Servidor para criar usuario/dispositivo" + NL + "3- Mobile atualiza dispositivo com o token" + NL + "4- sincroniza??o de dispositivo para enviar o token." + NL + "5- Execu??o sincroniza??o geral diario." + NL + "" + NL + "*/" + NL + "" + NL + "import android.content.Context;" + NL + "import ";
  protected final String TEXT_3 = ".framework.tela.DCAplicacao;" + NL + "import ";
  protected final String TEXT_4 = ".remoto.DispositivoUsuarioSincronismo;" + NL + "import ";
  protected final String TEXT_5 = ".remoto.UsuarioSincronismo;" + NL + "import ";
  protected final String TEXT_6 = ".data.contract.AplicacaoContract;" + NL + "" + NL + "public abstract class DCSincronizador {" + NL + "" + NL + "" + NL + "\tprotected DCAplicacao aplicacao; // para ser usado como contexto quando necessario." + NL + "" + NL + "    public DCSincronizador(DCAplicacao app) {" + NL + "        aplicacao = app;" + NL + "    }" + NL + "" + NL + "    public final void executaServerToMobile(Context ctx) {" + NL + "    \texecutaDiario(ctx,AplicacaoContract.getCodigoAplicacaoSinc());" + NL + "    \tsincronizaDispositivo(ctx);" + NL + "    \tsincronizaUsuario(ctx); // Precisa quando ocorre alteracao de banco de dados" + NL + "    }" + NL + "    " + NL + "    " + NL + "    " + NL + "    public final void executaDiario(Context ctx, String codigoAplicacao) {" + NL + "        sincronizacaoDiaria(ctx,codigoAplicacao);" + NL + "        carregaImagens(ctx,codigoAplicacao); // Diferencial. Permite uso offline." + NL + "    }" + NL + "    protected abstract void sincronizacaoDiaria(Context ctx, String codigoAplicacao);" + NL + "    public abstract void sincronizacaoUpgradeBd();" + NL + "    protected abstract void carregaImagens(Context ctx, String codigoAplicacao);" + NL + "" + NL + "    " + NL + "    private void sincronizaDispositivo(Context ctx) {" + NL + "    \tDispositivoUsuarioSincronismo dispositivoUsuarioSincronismo = new DispositivoUsuarioSincronismo();" + NL + "        dispositivoUsuarioSincronismo.sincroniza(ctx,true);" + NL + "    }" + NL + "    private void sincronizaUsuario(Context ctx) {" + NL + "        UsuarioSincronismo usuarioSincronismo = new UsuarioSincronismo();" + NL + "        usuarioSincronismo.sincroniza(ctx,true, false, true);" + NL + "    }" + NL + "    //public void sincronizaUsuarioDispositivo(Context ctx) {" + NL + "        // Primeiro atualizar dispositivo para criar automaticamente o usuario." + NL + "    //    DispositivoUsuarioSincronismo dispositivoUsuario = new DispositivoUsuarioSincronismo();" + NL + "    //    dispositivoUsuario.sincroniza(ctx,true, Sincronizador.getCodigoAplicacao());" + NL + "    //    UsuarioSincronismo usuarioSincronismo = new UsuarioSincronismo();" + NL + "    //    usuarioSincronismo.sincroniza(ctx,true, false, Sincronizador.getCodigoAplicacao());" + NL + "    //}" + NL + "    " + NL + "    public void sincronizaDispositivoFcmId(Context ctx) {" + NL + "        DispositivoUsuarioSincronismo dispositivoUsuarioSincronismo = new DispositivoUsuarioSincronismo();" + NL + "        dispositivoUsuarioSincronismo.sincroniza(ctx, true);" + NL + "    }" + NL + "\tpublic void sincronizaUsuarioDispositivoFcmId(Context ctx) {" + NL + "        // Primeiro atualizar dispositivo para criar automaticamente o usuario." + NL + "        DispositivoUsuarioSincronismo dispositivoUsuario = new DispositivoUsuarioSincronismo();" + NL + "        dispositivoUsuario.sincroniza(ctx,true);" + NL + "        UsuarioSincronismo usuarioSincronismo = new UsuarioSincronismo();" + NL + "        usuarioSincronismo.sincroniza(ctx,true, false, true);" + NL + "    }" + NL + "}";
  protected final String TEXT_7 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
