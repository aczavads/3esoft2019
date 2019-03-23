package aula20190322.livro;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class TestesComLivro {

	@Test
	public void testarNovoRepo() {
		LivroRepository repo = new LivroRepository();
		List<Livro> livros = repo.getAll();
		
		assertEquals("Não deveria ter livros no repository novo!", 0, livros.size());
	}
	@Test
	public void testarRepoAdicionandoObjetos() {
		LivroRepository repo = new LivroRepository();
		Livro bigJava = new Livro();
		Livro umlApplied = new Livro();
		Livro biblia = new Livro();

		repo.add(bigJava);
		repo.add(umlApplied);
		repo.add(biblia);

		List<Livro> livros = repo.getAll();

		assertEquals("Não deveria ter livros no repository novo!", 3, livros.size());
	}
	@Test
	public void testarRepoRemovendoObjetos() {
		LivroRepository repo = new LivroRepository();
		Livro bigJava = new Livro();
		Livro umlApplied = new Livro();

		repo.add(bigJava);
		repo.add(umlApplied);

		assertEquals("Deveria ter dois livros!", 2, repo.getAll().size());
		
		repo.remove(bigJava);
		assertEquals("Deveria ter somente um livro!", 1, repo.getAll().size());
		
		repo.remove(umlApplied);
		assertEquals("Deveria estar vazio!", 1, repo.getAll().size());
		
	}

}
