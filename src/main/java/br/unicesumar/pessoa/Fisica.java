package br.unicesumar.pessoa;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Fisica extends Pessoa {
	private Date nascidaEm;
	
	
	public Date getNascidaEm() {
		return nascidaEm;
	}
	
	

}
