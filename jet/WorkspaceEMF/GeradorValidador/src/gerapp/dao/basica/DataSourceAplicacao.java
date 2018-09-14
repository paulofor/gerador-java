package gerapp.dao.basica;

import br.com.digicom.lib.dao.MySqlDataSource;

public class DataSourceAplicacao extends MySqlDataSource{
	public DataSourceAplicacao() {
		super("jdbc:mysql://DESENV-PC/Gerenciador", "GerApp","aspnet");
	}
	
}
