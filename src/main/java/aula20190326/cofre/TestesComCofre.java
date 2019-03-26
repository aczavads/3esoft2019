package aula20190326.cofre;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestesComCofre {

	//+ testarSeNovoCofreNasceAberto() : void
	@Test 
	public void testarSeNovoCofreNasceAberto() {
		Cofre cofrinho = new Cofre();
		assertEquals(true, cofrinho.isAberto());
	}
	
	//+ testarFechamentoAbertura() : void
	@Test 
	public void testarFechamentoAbertura() {
		
	}
	

}
