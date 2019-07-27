package aula20190726b.prova.produto;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import aula20190726b.prova.cor.Cor;
import aula20190726b.prova.value_objects.Nome;

public class Produto {
	private Nome nome;
	private Set<Cor> coresDisponíveis = new HashSet<>();
	private Cor corPadrão;
	
	public Produto(Nome nome, Cor[] cores, Cor corPadrão) {
		this.nome = nome;
		for (Cor cor : cores) {
			this.coresDisponíveis.add(cor);
		}
		definirCorPadrão(corPadrão);
	}
	
	public Nome getNome() {
		return nome;
	}
	public void setNome(Nome nome) {
		this.nome = nome;
	}
	public void definirCorPadrão(Cor corPadrão) {
		if (corPadrão == null || !this.coresDisponíveis.contains(corPadrão)) {
			throw new CorPadrãoInválidaException();
		}
		this.corPadrão = corPadrão;
	}

}
