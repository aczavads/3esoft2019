package aula20190614.subclasses_de_exceções.deposito;

public class ValorDeDepósitoInválidoException extends RuntimeException {
	
	public ValorDeDepósitoInválidoException(String mensagem) {
		super(mensagem);
	}

}
