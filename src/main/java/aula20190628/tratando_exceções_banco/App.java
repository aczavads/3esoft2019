package aula20190628.tratando_exceções_banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

public class App {
/*
Utilizando repo: aula20190625.configurando_conexoes.CorRepositoryJDBC
Exception in thread "main" org.postgresql.util.PSQLException: ERROR: duplicate key value violates unique constraint "cor_pkey"
  Detalhe: Key (id)=(1) already exists.
	at org.postgresql.core.v3.QueryExecutorImpl.receiveErrorResponse(QueryExecutorImpl.java:2440)
	at org.postgresql.core.v3.QueryExecutorImpl.processResults(QueryExecutorImpl.java:2183)
	at org.postgresql.core.v3.QueryExecutorImpl.execute(QueryExecutorImpl.java:308)
	at org.postgresql.jdbc.PgStatement.executeInternal(PgStatement.java:441)
	at org.postgresql.jdbc.PgStatement.execute(PgStatement.java:365)
	at org.postgresql.jdbc.PgPreparedStatement.executeWithFlags(PgPreparedStatement.java:143)
	at org.postgresql.jdbc.PgPreparedStatement.execute(PgPreparedStatement.java:132)
	at aula20190625.configurando_conexoes.CorRepositoryJDBC.inserir(CorRepositoryJDBC.java:40)
	at aula20190625.configurando_conexoes.App.main(App.java:19)




Utilizando repo: aula20190625.configurando_conexoes.CorRepositoryJDBC
Exception in thread "main" java.sql.SQLIntegrityConstraintViolationException: Duplicate entry '1' for key 'PRIMARY'
	at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:117)
	at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:97)
	at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:122)
	at com.mysql.cj.jdbc.ClientPreparedStatement.executeInternal(ClientPreparedStatement.java:955)
	at com.mysql.cj.jdbc.ClientPreparedStatement.execute(ClientPreparedStatement.java:372)
	at aula20190625.configurando_conexoes.CorRepositoryJDBC.inserir(CorRepositoryJDBC.java:40)
	at aula20190625.configurando_conexoes.App.main(App.java:19)
 */
	
	
	public static void main(String[] args) throws Exception {
		Cor verde = new Cor(1, "Verde");
		Cor rosa = new Cor(2, "Rosa");
		
		CorRepository repo = criarCorRepository();
		System.out.println("Utilizando repo: " + repo.getClass().getName());
		
		repo.inserir(verde);
		repo.inserir(rosa);
		repo.inserir(new Cor(3, "Azul"));	
		repo.inserir(new Cor(4, "Lilás"));
		
		
		verde = new Cor(1, "Verde Musgo");
		repo.alterar(verde);
		
		repo.excluir(rosa.getId());

		List<Cor> cores = repo.obterTodas();
		
		System.out.println("Listando as cores...");
		for (Cor cor : cores) {
			System.out.println("  " + cor.getNome());
		}
		System.out.println("Fim da listagem.");
		
	}
	
	private static CorRepository criarCorRepository() throws Exception {
		/*
		Connection conn = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/3esoft2019",
				"postgres",
				"unicesumar");
				
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/3esoft2019?serverTimezone=UTC",
				"root",
				"");				
		*/
		Properties propriedades = new Properties();
		propriedades.load(App.class.getResourceAsStream("connection.properties"));
		 
		Connection conn = DriverManager.getConnection(
				propriedades.getProperty("url"),
				propriedades.getProperty("user"),
				propriedades.getProperty("password"));
		return new CorRepositoryJDBC(conn); //usar a conexão para persistir os dados.
	}


}
