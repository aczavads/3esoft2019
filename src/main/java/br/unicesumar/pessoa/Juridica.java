package br.unicesumar.pessoa;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Juridica extends Pessoa {
	private String razaoSocial;
	private Date fundadaEm;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public Date getFundadaEm() {
		return fundadaEm;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setFundadaEm(Date fundadaEm) {
		this.fundadaEm = fundadaEm;
	}
}
