package aula20190628.mapas;

public class Pessoa {
	private final String nome;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}
	
	
}
