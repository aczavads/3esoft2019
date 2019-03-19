package aula20190319.pedido;

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

	public double getValorTotal() {
		double total = 0.00;
//Versão 1: usando o getItens() para trabalhar com uma lista ao invés de um conjunto...		
//		List<ItemPedido> itensAux = getItens();
//		for (int contador = 0; contador < itensAux.size(); contador++) {
//			ItemPedido item = itensAux.get(contador);
//			total += item.getQuantidade() * item.getPreco() * (1-(item.getDescontoPercentual()/100));
//		}

//Versão 2: usando o conjunto itens diretamente em um for each...		
//		for (ItemPedido item : itens) {
//			total += item.getQuantidade() * item.getPreco() * (1-(item.getDescontoPercentual()/100));
//		}

		
//Versão 3: usando os dados como stream e com map/reduce com expressões lambda para calcular o total... 		
		total = itens.stream().parallel()
				.map(item -> item.getQuantidade() * item.getPreco() * (1-(item.getDescontoPercentual()/100)))
				.reduce((parcial, atual) -> parcial+atual).get();
		
		return total;
	}
	
}
