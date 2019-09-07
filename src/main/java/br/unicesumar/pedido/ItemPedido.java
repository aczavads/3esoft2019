package br.unicesumar.pedido;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.unicesumar.produto.Produto;

@Entity
public class ItemPedido {
	@Id
	private String id;
	private double quantidade;
	private double valorUnitario;
	private double descontoPercentual;
	
	@ManyToOne
	private Produto produto;
	
	public ItemPedido() {
		id = UUID.randomUUID().toString();
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public String getId() {
		return id;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public double getDescontoPercentual() {
		return descontoPercentual;
	}
	public Produto getProduto() {
		return produto;
	}

}
