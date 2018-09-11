package jet.android2.sync;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class SyncAdapter
{
  protected static String nl;
  public static synchronized SyncAdapter create(String lineSeparator)
  {
    nl = lineSeparator;
    SyncAdapter result = new SyncAdapter();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".sync;" + NL + "" + NL + "import android.accounts.Account;" + NL + "import android.accounts.AccountManager;" + NL + "import android.content.AbstractThreadedSyncAdapter;" + NL + "import android.content.ContentProviderClient;" + NL + "import android.content.ContentResolver;" + NL + "import android.content.SyncRequest;" + NL + "import android.content.SyncResult;" + NL + "import android.os.Build;" + NL + "import android.os.Bundle;" + NL + "import android.content.Context;" + NL + "import ";
  protected final String TEXT_4 = ".template.*;" + NL + "import ";
  protected final String TEXT_5 = ".remoto.*;" + NL + "" + NL + "public abstract class AplicacaoSyncAdapter extends AbstractThreadedSyncAdapter{" + NL + "\t" + NL + "\tpublic static final int SYNC_INTERVAL = 60 * 180;" + NL + "    public static final int SYNC_FLEXTIME = SYNC_INTERVAL/3;" + NL + "\t//private ContentResolver mContentResolver; // Melhor fazer isso ou usar metodo estatico ?" + NL + "\t" + NL + "\tpublic AplicacaoSyncAdapter(Context context, boolean autoInitialize) {" + NL + "        super(context, autoInitialize);" + NL + "        //mContentResolver = context.getContentResolver();" + NL + "    }" + NL + "\t" + NL + "    " + NL + "     /**" + NL + "     * Helper method to schedule the sync adapter periodic execution" + NL + "     */" + NL + "    public static void configurePeriodicSync(Context context, int syncInterval, int flexTime) {" + NL + "        Account account = getSyncAccount(context);" + NL + "        String authority = context.getString(R.string.content_authority);" + NL + "        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {" + NL + "            // we can enable inexact timers in our periodic sync" + NL + "            SyncRequest request = new SyncRequest.Builder()." + NL + "                    syncPeriodic(syncInterval, flexTime)." + NL + "                    setSyncAdapter(account, authority)." + NL + "                    setExtras(new Bundle()).build();" + NL + "            //mContentResolver.requestSync(request);" + NL + "            ContentResolver.requestSync(request);" + NL + "        } else {" + NL + "            //mContentResolver.addPeriodicSync(account,authority, new Bundle(), syncInterval);" + NL + "            ContentResolver.addPeriodicSync(account,authority, new Bundle(), syncInterval);" + NL + "        }" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * Helper method to have the sync adapter sync immediately" + NL + "     * @param context The context used to access the account service" + NL + "     */" + NL + "    public static void syncImmediately(Context context) {" + NL + "        Bundle bundle = new Bundle();" + NL + "        bundle.putBoolean(ContentResolver.SYNC_EXTRAS_EXPEDITED, true);" + NL + "        bundle.putBoolean(ContentResolver.SYNC_EXTRAS_MANUAL, true);" + NL + "        //mContentResolver.requestSync(getSyncAccount(context),context.getString(R.string.content_authority), bundle);" + NL + "        ContentResolver.requestSync(getSyncAccount(context),context.getString(R.string.content_authority), bundle);" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * Helper method to get the fake account to be used with SyncAdapter, or make a new one" + NL + "     * if the fake account doesn't exist yet.  If we make a new account, we call the" + NL + "     * onAccountCreated method so we can initialize things." + NL + "     *" + NL + "     * @param context The context used to access the account service" + NL + "     * @return a fake account." + NL + "     */" + NL + "    public static Account getSyncAccount(Context context) {" + NL + "        // Get an instance of the Android account manager" + NL + "        AccountManager accountManager = (AccountManager) context.getSystemService(Context.ACCOUNT_SERVICE);" + NL + "" + NL + "        // Create the account type and default account" + NL + "        Account newAccount = new Account(context.getString(R.string.app_name), context.getString(R.string.sync_account_type));" + NL + "" + NL + "        // If the password doesn't exist, the account doesn't exist" + NL + "        if ( null == accountManager.getPassword(newAccount) ) {" + NL + "" + NL + "        /*" + NL + "         * Add the account and account type, no password or user data" + NL + "         * If successful, return the Account object, otherwise report an error." + NL + "         */" + NL + "            if (!accountManager.addAccountExplicitly(newAccount, \"\", null)) {" + NL + "                return null;" + NL + "            }" + NL + "            /*" + NL + "             * If you don't set android:syncable=\"true\" in" + NL + "             * in your <provider> element in the manifest," + NL + "             * then call ContentResolver.setIsSyncable(account, AUTHORITY, 1)" + NL + "             * here." + NL + "             */" + NL + "" + NL + "            onAccountCreated(newAccount, context);" + NL + "        }" + NL + "        return newAccount;" + NL + "    }" + NL + "" + NL + "    private static void onAccountCreated(Account newAccount, Context context) {" + NL + "        /*" + NL + "         * Since we've created an account" + NL + "         */" + NL + "       \tAplicacaoSyncAdapter.configurePeriodicSync(context, SYNC_INTERVAL, SYNC_FLEXTIME);" + NL + "" + NL + "        /*" + NL + "         * Without calling setSyncAutomatically, our periodic sync will not be enabled." + NL + "         */" + NL + "        ContentResolver.setSyncAutomatically(newAccount, context.getString(R.string.content_authority), true);" + NL + "" + NL + "        /*" + NL + "         * Finally, let's do a sync to get things started" + NL + "         */" + NL + "        syncImmediately(context);" + NL + "    }" + NL + "" + NL + "    public static void initializeSyncAdapter(Context context) {" + NL + "        getSyncAccount(context);" + NL + "    }" + NL + "    " + NL + "    ";
  protected final String TEXT_6 = NL + "\tprotected void sincroniza";
  protected final String TEXT_7 = "(Context contexto, boolean forcaAtualizacao, boolean delete) {" + NL + "\t\t";
  protected final String TEXT_8 = "Sincronismo sincSrv = new ";
  protected final String TEXT_9 = "Sincronismo();" + NL + "\t\t";
  protected final String TEXT_10 = NL + "    \tsincSrv.sincroniza(getContext(),true);" + NL + "    \t";
  protected final String TEXT_11 = NL + "    \tsincSrv.sincroniza(getContext(),true, delete, true);" + NL + "    \t";
  protected final String TEXT_12 = NL + "\t}" + NL + "\t";
  protected final String TEXT_13 = NL + NL + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_5);
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper corrente = iterador.next();
	
    stringBuffer.append(TEXT_6);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
     if (corrente.ehDispositivo()) { 
    stringBuffer.append(TEXT_10);
     } else { 
    stringBuffer.append(TEXT_11);
     } 
    stringBuffer.append(TEXT_12);
    
	}
	
    stringBuffer.append(TEXT_13);
    return stringBuffer.toString();
  }
}
