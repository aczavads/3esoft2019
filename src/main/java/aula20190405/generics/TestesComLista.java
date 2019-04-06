package aula20190405.generics;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class TestesComLista {

	@Test
	public void testarSeNovaListaEst·Vazia() {
		Lista<Integer> nova = new Lista<Integer>();		
		nova.adicionar(10);
		assertEquals(0, nova.obterTamanho());
	}
	@Test
	public void testarSeTamanhoEst·CorretoComInteiros() {
		Lista nova = new Lista();		
		assertEquals(0, nova.obterTamanho());
		
		
		nova.adicionar(10);
		assertEquals(1, nova.obterTamanho());
		
		nova.adicionar(20);
		assertEquals(2, nova.obterTamanho());
	}
	@Test
	public void testarSeTamanhoEst·Correto() {
		Lista nova = new Lista();		
		assertEquals(0, nova.obterTamanho());
		
		nova.adicionar("Brasil");
		assertEquals(1, nova.obterTamanho());
		
		nova.adicionar("Canad·");
		assertEquals(2, nova.obterTamanho());
	}
	@Test
	public void testarPegarNaPosicao() {
		Lista nova = new Lista();		
		nova.adicionar("Brasil");
		nova.adicionar("Canad·");
		
		assertEquals("Brasil", nova.pegar(0));
		assertEquals("Canad·", nova.pegar(1));
	}
	@Test
	public void testarRemover() {
		Lista nova = new Lista();		
		nova.adicionar("Brasil");
		nova.adicionar("Canad·");
		nova.adicionar("Espanha");
		nova.adicionar("SuÈcia");
		
		assertEquals(4, nova.obterTamanho());
		assertEquals("Brasil", nova.pegar(0));
		
		nova.remover(0);		
		assertEquals(3, nova.obterTamanho());
		assertEquals("Canad·", nova.pegar(0));
	}

}
