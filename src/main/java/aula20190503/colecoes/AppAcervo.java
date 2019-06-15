package aula20190503.colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import aula20190322.livro.Livro;

public class AppAcervo {
	
	public static void main(String[] args) {
		List<Livro> acervo = new ArrayList<>();
		acervo.add(new Livro("Conceitos de Computação com Java","Horstmann"));
		acervo.add(new Livro("Big Java","Horstmann"));
		acervo.add(new Livro("Objects First","Horstmann"));
		acervo.add(new Livro("Applying UML and patterns","Larmann"));
		acervo.add(new Livro("UML Complete Reference","Larmann"));
		acervo.add(new Livro("Object Analysis and Design","Booch"));
		
		Set<String> autoresDistintos = recuperarAutoresDistintos(acervo);
		//listar os nomes dos autores.
		
		Map<String, Integer> contagemDeLivrosPorAutor = recuperarContagemDeLivrosPorAutor(acervo);
		//listar o nome dos autores com a contagem de seus livros.
	}

	private static Map<String, Integer> recuperarContagemDeLivrosPorAutor(List<Livro> acervo) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Set<String> recuperarAutoresDistintos(List<Livro> acervo) {
		// TODO Auto-generated method stub
		return null;
	}

}
