package br.unicesumar.disciplina;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import br.unicesumar.professor.Professor;

@Entity
public class Disciplina {
	@Id
	private String id;
	private String nome;
	
	@ManyToMany
	@JoinTable(name="ministrantes",
			joinColumns = { @JoinColumn(name = "disciplina_id") },
			inverseJoinColumns = { @JoinColumn(name = "ministrantes_id") })
	private Set<Professor> ministrantes = new HashSet<>();

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
	
	public Set<Professor> getMinistrantes() {
		return ministrantes;
	}
	
	public void setMinistrantes(Set<Professor> ministrantes) {
		this.ministrantes = ministrantes;
	}
}
