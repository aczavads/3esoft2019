package aula20190614.subclasses_de_exceções.deposito;

public class Depósito {

	private final String conta;
	private final double valor;

	public Depósito(String conta, double valor) {
		if (valor <= 0.00) {
			throw new ValorDeDepósitoInválidoException("Valor depositado: " + valor);
		}
		this.conta = conta;
		this.valor = valor;
	}
	
	public String getConta() {
		return conta;
	}
	public double getValor() {
		return valor;
	}

}
