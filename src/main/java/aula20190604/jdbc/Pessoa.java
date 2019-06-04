package aula20190604.jdbc;

import java.util.Date;

public class Pessoa {
	private Integer id;
	private String nome;
	private Date nascimento;

	public Pessoa(Integer id, String nome, Date nascimento) {
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;		
	}
	
	public Integer getId() {
		return id;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public String getNome() {
		return nome;
	}

}
