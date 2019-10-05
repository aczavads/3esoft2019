package br.unicesumar;

public class Utilidades {

	public static int somar(int v1, int v2) {
		return v1+v2;
	}
	
	public static int somar(int[] valores) {
		int soma = 0;
		
		for (int v : valores) {
			soma += v;
		}
		
		return soma;
	}
	
	public static int maior(int[] valores) {
		if (valores == null || valores.length == 0) {
			throw new RuntimeException("Array vazio!");
		}
		int maior = valores[0];
		for (int valor : valores) {
			if (valor > maior) {
				maior = valor;
			}
		}
		return maior;
	}

}
