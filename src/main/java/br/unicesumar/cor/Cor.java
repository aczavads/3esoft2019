package br.unicesumar.cor;

import javax.persistence.Entity;

import br.unicesumar.base.BaseEntity;

@Entity
public class Cor extends BaseEntity {
	private String nome;
	
	public Cor() {
		super();
	}
	
	public String getNome() {
		return nome;
	}

}
