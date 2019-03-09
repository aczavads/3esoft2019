package aula20190308.testesMetodosBasicos;

public class Pessoa {
	private final String nome;
	private final int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public Pessoa setNome(String nome) {		
		return new Pessoa(nome, this.idade);
	}
	

}
