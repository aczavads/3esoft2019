package aula20190319.pedido;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestesComPedido {
	private final Produto omo = new Produto("123a", "Omo Progress");
	private final Produto soja = new Produto("227a", "Soja a granel");

	@Test
	public void testarNovosPedidos() {		
		Pedido p1 = new Pedido(1);
		
		p1.adicionarItem(omo, 2, 14.75, 10.00);
		p1.adicionarItem(soja, 12, 1.25, 0.00);
		
		assertEquals(1, p1.getNumero());
		assertEquals(2, p1.getItens().size());
		
		Pedido p2 = new Pedido(2);
		p2.adicionarItem(omo, 4, 14.75, 3.00);
		
		assertEquals(2, p2.getNumero());
		assertEquals(1, p2.getItens().size());		
	}
	@Test
	public void testarValorTotalDoPedido() {
		Pedido p1 = new Pedido(1);		
		p1.adicionarItem(omo, 2, 10, 10.00);
		p1.adicionarItem(soja, 2, 5, 10.00);
		assertEquals(27.00, p1.getValorTotal(),0.01);
		
		Pedido p2 = new Pedido(2);
		p2.adicionarItem(omo, 4, 20, 5.00);
		assertEquals(76.00, p2.getValorTotal(),0.01);
		
	}

}
