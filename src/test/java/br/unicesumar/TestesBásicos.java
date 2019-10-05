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
		
	@Test(expected=RuntimeException.class)
	public void testar_encontrar_maior_valor_em_array_vazio01() {
		Utilidades.maior(new int[] {});
	}
	
	@Test
	public void testar_encontrar_maior_valor_em_array_vazio02() {
		try {
			Utilidades.maior(new int[] {});
			fail("Deveria ter gerado uma exceção!");
		} catch (RuntimeException e) {	
		} catch (Exception e) {
			fail("Deveria ser uma RuntimeException.");
		}
	}
	
	@Test
	public void testar_total_do_pedido() {
		Pedido p1 = new Pedido(125); //Pedido(numero)
		p1.adicionarItem("Omo",10.00, 20.00, 0.00); // (produto, quantidade, valorUnitario, descontoPercentual)
		p1.adicionarItem("Soja",20.00, 25.00, 10.00); // (produto, quantidade, valorUnitario, descontoPercentual)
		
		assertEquals(650.00, p1.getValorTotal(), 0.00);
		assertEquals(2, p1.contarItens());
		assertEquals(10.00, p1.getItem("Omo").getQuantidade(), 0.00);
		assertEquals(20.00, p1.getItem("Soja").getQuantidade(), 0.00);

		Pedido p2 = new Pedido(126); //Pedido(numero)
		p2.adicionarItem("Cuscuz",1.00, 2.50, 0.00); // (produto, quantidade, valorUnitario, descontoPercentual)
		p2.adicionarItem("Jambu",2.00, 10.00, 20.00); // (produto, quantidade, valorUnitario, descontoPercentual)
		p2.adicionarItem("Omo",1.00, 1.00, 0.00); // (produto, quantidade, valorUnitario, descontoPercentual)
		
		assertEquals(19.50, p2.getValorTotal(), 0.00);
		assertEquals(3, p2.contarItens());
		assertEquals(1.00, p2.getItem("Cuscuz").getQuantidade(), 0.00);
		assertEquals(2.00, p2.getItem("Jambu").getQuantidade(), 0.00);
		assertEquals(1.00, p2.getItem("Omo").getQuantidade(), 0.00);
		
	}

}







