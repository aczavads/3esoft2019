package br.unicesumar.disciplina;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disciplina {
	@Id
	private String id;
	private String nome;

	public Disciplina() {
		id = UUID.randomUUID().toString();
	}
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
