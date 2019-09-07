package br.unicesumar.pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	@Id
	private String id;
	private Long numero;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="pedido_id")
	private List<ItemPedido> itens = new ArrayList<>();
	
	public Pedido() {
		id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	public Long getNumero() {
		return numero;
	}
	public List<ItemPedido> getItens() {
		return itens;
	}
}

