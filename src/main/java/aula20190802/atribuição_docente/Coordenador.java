package aula20190802.atribuição_docente;

import java.util.Date;

public class Coordenador {
	private Date início;
	private Date fim;
	private Professor professor;

	public Coordenador(Date início, Date fim, Professor professor) {
		this.início = início;
		this.fim = fim;
		this.professor = professor;
	}

	public Date getInício() {
		return início;
	}

	public void setInício(Date início) {
		this.início = início;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fim == null) ? 0 : fim.hashCode());
		result = prime * result + ((início == null) ? 0 : início.hashCode());
		result = prime * result + ((professor == null) ? 0 : professor.hashCode());
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
		Coordenador other = (Coordenador) obj;
		if (fim == null) {
			if (other.fim != null)
				return false;
		} else if (!fim.equals(other.fim))
			return false;
		if (início == null) {
			if (other.início != null)
				return false;
		} else if (!início.equals(other.início))
			return false;
		if (professor == null) {
			if (other.professor != null)
				return false;
		} else if (!professor.equals(other.professor))
			return false;
		return true;
	}
}
