package aula20190312.testesComObjetos;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class TestesComObjetos {

	@Test
	public void testarInstanciasVersusReferencias() {
		Livro umlApplied = new Livro();
		Livro bibliaSagrada = new Livro();
		
		assertTrue("Deveriam ser iguais!", umlApplied.equals(bibliaSagrada));
		//assertEquals("Deveriam ser iguais!", umlApplied, bibliaSagrada);
		
		Livro bigJava = new Livro();
		assertTrue("Deveriam ser iguais!", bigJava.equals(bibliaSagrada));
		assertTrue("Deveriam ser iguais!", bigJava.equals(umlApplied));
		
		assertNotEquals("Nulo deve ser diferente!", bigJava, null);
		
		Livro designPatterns = new Livro("Design Patterns", 555);
		assertFalse("Não deveriam ser iguais!", designPatterns.equals(bibliaSagrada));
		assertFalse("Não deveriam ser iguais!", designPatterns.equals(umlApplied));
		assertNotEquals("Nulo deve ser diferente!", designPatterns, null);		

		Livro designPatterns2 = new Livro("Design Patterns", 555);
		
		assertEquals("Deveriam ser iguais!", designPatterns, designPatterns2);
	}

}



