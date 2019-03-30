package aula20190329.cartão;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class TestesComCartão {

	@Test
	public void testarExtratoNovoCartão() {
		Cartão visa3356 = new Cartão(5000.00D);
		List<Double> extrato = visa3356.obterExtrato();
		assertEquals(0, extrato.size());		
	}
	@Test
	public void testarExtratoComMovimentações() {
		Cartão visa3356 = new Cartão(5000.00D);
		visa3356.debitar(100.00);
		visa3356.debitar(15000.00);
		visa3356.creditar(30.00);
		visa3356.debitar(2.50);
		List<Double> extrato = visa3356.obterExtrato();
		assertEquals(4, extrato.size());
		double somarDosValores = extrato.stream().reduce((total, atual) -> total+atual).get();
		assertEquals(-222.50, somarDosValores,0.00);
		
	}

}
