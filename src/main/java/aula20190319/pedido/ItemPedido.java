package aula20190319.pedido;

public class ItemPedido {
	private double quantidade;
	private double preco;
	private double descontoPercentual;
	private Produto produto;

	// + ItemPedido(produto : Produto, quantidade : double, preco : double, descontoPercentual : double)
	public ItemPedido(Produto produto, double quantidade, double preco, double descontoPercentual ) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
		this.descontoPercentual = descontoPercentual;
	}
	public double getDescontoPercentual() {
		return descontoPercentual;
	}
	public double getPreco() {
		return preco;
	}
	public Produto getProduto() {
		return produto;
	}
	public double getQuantidade() {
		return quantidade;
	}
}
