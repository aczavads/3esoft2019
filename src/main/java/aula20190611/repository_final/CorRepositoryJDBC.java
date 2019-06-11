package aula20190611.repository_final;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CorRepositoryJDBC implements CorRepository {
	private Connection connection;

	public CorRepositoryJDBC(Connection connection) throws Exception {
		if (connection == null) {
			throw new RuntimeException("Não é possível instanciar um CorRepositoryJDBC com conexão nula!");
		}
		this.connection = connection;
		
		criarTabela();
	}

	private void criarTabela() throws SQLException {
		//Não façam isso em casa!!! :D
		this.connection.createStatement().execute("drop table cor");
		this.connection.createStatement().execute("create table if not exists cor ("
				+ "id integer not null primary key,"
				+ "nome varchar(255) not null unique"
				+ ")");
	}

	@Override
	public void inserir(Cor c) throws Exception {
		String sql = "insert into cor (id, nome) values (?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setInt(1, c.getId());
		statement.setString(2, c.getNome());
		
		statement.execute();
		statement.close();
	}

	@Override
	public List<Cor> obterTodas() throws Exception {
		String sql = "select id, nome from cor";
		Statement statement = connection.createStatement();
		
		List<Cor> todas = new ArrayList<>();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			String nome = resultSet.getString("nome");
			int id = resultSet.getInt("id");
			
			todas.add(new Cor(id, nome));
		}		
		resultSet.close();
		statement.close();
		return todas;
	}

	@Override
	public void alterar(Cor c) throws Exception {
		String sql = "update cor set nome = ? where id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, c.getNome());
		statement.setInt(2, c.getId());
		
		statement.execute();
		statement.close();
	}

	@Override
	public void excluir(int id) throws Exception {
		String sql = "delete from cor where id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setInt(1, id);
		
		statement.execute();
		statement.close();
	}

}
