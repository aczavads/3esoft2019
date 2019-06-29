package aula20190628.mapas;

public class Imovel {
	private String logradouro;
	private String numero;
	private Pessoa proprietario;
	
	public Imovel(String logradouro, String numero, Pessoa proprietario) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.proprietario = proprietario;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public Pessoa getProprietario() {
		return proprietario;
	}
	@Override
	public String toString() {
		return "Imovel [logradouro=" + logradouro + ", numero=" + numero + ", proprietario=" + proprietario + "]";
	}
}
