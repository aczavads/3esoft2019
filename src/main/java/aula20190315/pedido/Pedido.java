package aula20190315.pedido;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Pedido {
	private int numero;
	private Set<ItemPedido> itens = new HashSet<>();
	
	
	
	
	//+ Pedido(numero : int)
	public Pedido(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public List<ItemPedido> getItens() {		
		return Collections.unmodifiableList(new ArrayList<>(itens));
	}
	//+ adicionarItem(produto : Produto, quantidade : double, preco : double, descontoPercentual : double) : ItemPedido
	public ItemPedido adicionarItem(Produto produto, double quantidade, double preco, double descontoPercentual) {
		ItemPedido item = new ItemPedido(produto, quantidade, preco, descontoPercentual);
		this.itens.add(item);
		return item;
	}
	
}
