package aula20190329.cartão;

import java.util.ArrayList;
import java.util.List;

public class Cartão {
	private double limite;
	private double saldoDevedor;
	private List<Double> extrato = new ArrayList<Double>();

	public Cartão(double limite) {
		this.limite = limite;
	}
	public List<Double> obterExtrato() {
		//return new ArrayList<Double>();
		return this.extrato;
	}
	public void debitar(double valor) {
		if ((saldoDevedor + valor) > limite) {
			throw new RuntimeException("Débito não autorizado! Limite excedido!");
		}
		this.extrato.add(-valor);
		this.saldoDevedor += valor;
	}
	public void creditar(double valor) {
		this.extrato.add(+valor);
		this.saldoDevedor-=valor;
	}

}
