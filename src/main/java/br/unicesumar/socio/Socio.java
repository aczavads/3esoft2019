package br.unicesumar.socio;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.unicesumar.empresa.Empresa.ContratoSocial;

@Entity
public class Socio {
	@Id
	private String id;
	private String nome;
	
	@ManyToMany
	private Set<ContratoSocial> contratosSociais = new HashSet<>();

	public Socio() {
		id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	@JsonIgnore
	public Set<ContratoSocial> getContratosSociais() {
		return contratosSociais;
	}

}
