package br.unicesumar;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestesBásicos {

	@Test
	public void testar_soma() {
		int v1 = 10;
		int v2 = 30;
		int soma = v1 + v2;

		assertEquals(40, soma);
	}

	@Test
	public void testar_método_somar() {
		int soma01 = Utilidades.somar(10, 30);
		int soma02 = Utilidades.somar(99, 1);

		assertEquals(40, soma01);
		assertEquals(100, soma02);
	}

	@Test
	public void testar_somar_valores() {
		int soma01 = Utilidades.somar(new int[] { 10, 20, 30, 40, 50 });
		int soma02 = Utilidades.somar(new int[] { 1, 2, 3, 4, 5 });

		assertEquals(150, soma01);
		assertEquals(15, soma02);
	}

	@Test
	public void testar_encontrar_maior_valor() {
		int maior01 = Utilidades.maior(new int[] { 10, 201, 30, 40, 50 });
		int maior02 = Utilidades.maior(new int[] { 1, 2, 3, 400, 5 });

		assertEquals(201, maior01);
		assertEquals(400, maior02);
	}

}
