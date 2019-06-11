package aula20190611.repository_final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class App {
	
	
	
	public static void main(String[] args) throws Exception {
		Cor verde = new Cor(1, "Verde");
		Cor rosa = new Cor(2, "Rosa");
		
		/*
		Connection conn = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/3esoft2019",
				"postgres",
				"unicesumar");

		CorRepository repo = new CorRepositoryJDBC(conn); //usar a conexão para persistir os dados.
		CorRepository repo = new CorRepositoryMemória(); //manter  os dados em uma coleção.
		CorRepository repo = null;
		*/
		CorRepository repo = criarCorRepositoryAleatoriamente();
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

}
