package aula20190726b.prova.value_objects;

public class Nome {
	private final String valor;
	
	public Nome(String valor) {
		if (valor == null || valor.trim().length() < 3) {
			throw new NomeInválidoException();
		}
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nome other = (Nome) obj;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
	
	
	

}
