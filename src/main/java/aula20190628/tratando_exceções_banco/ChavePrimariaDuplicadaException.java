package aula20190628.tratando_exceções_banco;

public class ChavePrimariaDuplicadaException extends RuntimeException {
	
	public ChavePrimariaDuplicadaException(Exception cause) {
		super("Chave duplicada!", cause);
	}

}
