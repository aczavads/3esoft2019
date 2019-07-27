package aula20190726b.prova.value_objects;

public class NomeInválidoException extends RuntimeException {
	
	public NomeInválidoException() {
		super("O nome não pode ser nulo e deve ter mais que 3 caracteres!");
	}

}
