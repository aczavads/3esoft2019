package aula20190531.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;

public class App {
	
	public static void main(String[] args) {
		
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/3esoft2019",
					"postgres",
					"unicesumar");
			
			criarTabelaPessoa(conn);
			
			excluirTodas(conn);
			
			inserirPessoa(conn, 1, "Fulano de Tal", new Date());
			
			Calendar calendar = Calendar.getInstance();
			calendar.set(calendar.DAY_OF_MONTH, 1);
			calendar.set(calendar.MONTH, 0);
			calendar.set(calendar.YEAR, 1975);
								
			inserirPessoa(conn, 2, "Nelson Tenorio Junior", calendar.getTime());
			
			//alterar nascimento do Nelson para 11/11/1975 (mudar calendar)
			calendar.set(calendar.DAY_OF_MONTH, 11);
			calendar.set(calendar.MONTH, 10);
			calendar.set(calendar.YEAR, 1975);
			atualizarPessoa(conn, 2, "Nelson Tenorio Junior", calendar.getTime());
		

			
			System.out.println("Conectado!");
			conn.close();
			System.out.println("Fechado.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fim.");
	}
	public static void atualizarPessoa(Connection conexão, Integer id, String nome, Date nascimento) throws Exception {
		String sql = "update pessoa set nome = ?,  nascimento = ? where id = ?";
		
		PreparedStatement statement = conexão.prepareStatement(sql);
		statement.setInt(3, id);
		statement.setString(1, nome);
		statement.setDate(2, new java.sql.Date(nascimento.getTime()));
		
		statement.execute();
		statement.close();
	}
	
	public static void inserirPessoa(Connection conexão, Integer id, String nome, Date nascimento) throws Exception {
		String sql = "insert into pessoa (id, nome, nascimento) values (?,?,?)";
		
		PreparedStatement statement = conexão.prepareStatement(sql);
		statement.setInt(1, id);
		statement.setString(2, nome);
		statement.setDate(3, new java.sql.Date(nascimento.getTime()));
		
		statement.execute();
		statement.close();
	}
	
	public static void excluirTodas(Connection conexão) throws Exception {
		String sql = "delete from pessoa";
		Statement statement = conexão.createStatement();
		statement.execute(sql);
		statement.close();		
	}
	
	public static void criarTabelaPessoa(Connection conexão) throws Exception {
		String sql = "create table if not exists pessoa ("
				+ "id integer not null primary key,"
				+ "nome varchar(255) not null unique,"
				+ "nascimento date not null"
				+ ")";
		
		Statement statement = conexão.createStatement();
		statement.execute(sql);
		statement.close();		
	}

}




