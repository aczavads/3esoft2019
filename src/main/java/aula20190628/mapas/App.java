package aula20190628.mapas;

public class App {
	
	public static void main(String[] args) {
		
		ImovelRepository repo = new ImovelRepositoryMemory();
		Pessoa wilsonMatos = new Pessoa("Wilson Silva Matos");
		repo.salvar(new Imovel("Av. Guedner", "777", wilsonMatos));
		repo.salvar(new Imovel("Av. São Domingos", "123", wilsonMatos));
		repo.salvar(new Imovel("Av. São Domingos", "558", wilsonMatos));
		
		Pessoa marcello = new Pessoa("Marcello Erick Bonfin");
		repo.salvar(new Imovel("Rua Andorinhas", "123", marcello));
		repo.salvar(new Imovel("Rua Jaboti", "558", marcello));
		
		for (Imovel i : repo.recuperarTodos()) {
			System.out.println(i);
		}
		
		System.out.println("Relatório de imóveis por proprietário");
		for (Pessoa proprietario : repo.recuperarImoveisPorProprietario().keySet()) {
			System.out.println(proprietario);
			for (Imovel i : repo.recuperarImoveisPorProprietario().get(proprietario)) {
				System.out.println("   " + i);
			}
		}
		
	}

}
