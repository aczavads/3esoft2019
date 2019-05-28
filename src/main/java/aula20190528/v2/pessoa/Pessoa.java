package aula20190528.v2.pessoa;

import java.util.UUID;

public abstract class Pessoa {
	private UUID id;
	private String nome;

	public Pessoa(String nome) {
		this.id = UUID.randomUUID();
		this.nome = nome;
	}

	public Pessoa(UUID id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public UUID getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
