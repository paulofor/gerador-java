package gerapp.dao.basica;

import br.com.digicom.lib.dao.MySqlDataSource;

public class DataSourceAplicacao extends MySqlDataSource{
	public DataSourceAplicacao() {
		super("jdbc:mysql://127.0.0.1/Gerenciador", "GerApp","aspnet");
	}
	
}
