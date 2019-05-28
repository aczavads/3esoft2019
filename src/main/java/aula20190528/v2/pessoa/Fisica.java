package aula20190528.v2.pessoa;

import java.util.UUID;

public class Fisica extends Pessoa {
	private String rg;
	private String cpf;
	
	public Fisica(String nome, String rg, String cpf) {
		//this.nome = nome;
		super(nome);
		this.rg = rg;
		this.cpf = cpf;
	}
	public Fisica(UUID id, String nome, String rg, String cpf) {
		//this.id = id;
		//this.nome = nome;
		super(id, nome);
		this.rg = rg;
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}

}
