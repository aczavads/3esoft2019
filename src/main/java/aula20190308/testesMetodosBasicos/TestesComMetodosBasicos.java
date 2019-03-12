package aula20190308.testesMetodosBasicos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestesComMetodosBasicos {

	@Test
	public void testarMetodoSomar() {		
		assertEquals(-30, Util.somar(-10, -20));
		assertEquals(30, Util.somar(10, 20));
		assertEquals(30, Util.somar(10, 20));
		assertEquals(-40, Util.somar(-20, -20));
	}
	
	@Test
	public void testarMetodoTriplo() {		
		assertEquals(120, Util.triplo(40), 0.01);
		assertEquals(33.60, Util.triplo(11.20), 0.01);
	}
	
	@Test
	public void testarContagemDeValoresPares() {
		int[] valores1 = {1,2,3,4,5,6,7,8,9,10,11,12,12,12,13};
		
		int contagemDePares = Util.contarPares(valores1);
				
		assertEquals(8, contagemDePares);
		
		int[] valores2 = {1,2,3,4,5,6,7,8,9,10,11,12,12,12,13,14,15,16};
		
		contagemDePares = Util.contarPares(valores2);
				
		assertEquals(10, contagemDePares);		
		
		//nomeDoArray.length
	}	
	@Test
	public void testarNomeDaPessoa() {
		Pessoa fulana = new Pessoa("Fulana",55);
		
		Util.seiLah(fulana);
		
		assertEquals("Fulana", fulana.getNome());
	}
	
	
	
	
}
