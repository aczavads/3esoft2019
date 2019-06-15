package aula20190329.cart„o;

import java.util.ArrayList;
import java.util.List;

public class Cart„o {
	private double limite;
	private double saldoDevedor;
	private List<Double> extrato = new ArrayList<Double>();

	public Cart„o(double limite) {
		this.limite = limite;
	}
	public List<Double> obterExtrato() {
		//return new ArrayList<Double>();
		return this.extrato;
	}
	public void debitar(double valor) {
		if ((saldoDevedor + valor) > limite) {
			throw new RuntimeException("D√©bito n√£o autorizado! Limite excedido!");
		}
		this.extrato.add(-valor);
		this.saldoDevedor += valor;
	}
	public void creditar(double valor) {
		this.extrato.add(+valor);
		this.saldoDevedor-=valor;
	}

}
