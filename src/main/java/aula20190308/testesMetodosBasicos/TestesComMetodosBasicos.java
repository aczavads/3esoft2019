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
		assertEquals(120, Util.triplo(40));
		assertEquals(33.60, Util.triplo(11.20));
	}
	
	
}
