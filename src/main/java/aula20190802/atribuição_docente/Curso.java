package aula20190802.atribuição_docente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Curso {
	private String nome;
	private List<Coordenador> coordenadores = new ArrayList<>();

	public Curso(String nome) {
		this.nome = nome;
	}
	
	public void definirCoordenador(Date início, Date fim, Professor professor) {
		this.coordenadores.add(new Coordenador(início, fim, professor));
	}
	
	public Coordenador consultarCoordenadorEm(Date data) {
		Coordenador c = null;
		for (Coordenador coordenador : coordenadores) {
			if (data.after(coordenador.getInício()) && data.before(coordenador.getFim())) {
				return coordenador;
			}
		}
		return c;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Curso other = (Curso) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
