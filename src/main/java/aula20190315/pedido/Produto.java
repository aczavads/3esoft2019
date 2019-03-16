package aula20190315.pedido;

public class Produto {
	private String descricao;
	private String codigo;
	
	//+ Produto(codigo : String, descricao : String)
	public Produto(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}

}
