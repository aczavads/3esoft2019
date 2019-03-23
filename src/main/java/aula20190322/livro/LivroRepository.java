package aula20190322.livro;

import java.util.ArrayList;
import java.util.List;


public class LivroRepository {
	private List<Livro> dados = new ArrayList<>();
	
	public List<Livro> getAll() {
		return this.dados;
	}
	public void add(Livro livroParaAdicionar) {
		this.dados.add(livroParaAdicionar);
	}
	public void remove(Livro livroParaRemover) {
		this.dados.remove(livroParaRemover);
	}

}
