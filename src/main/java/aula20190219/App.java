package aula20190219;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		final int LIMITE = getLimite();		
		System.out.println("Você digitou: " + LIMITE);
		System.out.println("Laço com for...");
		for (int contador = 1; contador<=LIMITE; contador++) {
			System.out.println(contador);
		}		
		System.out.println("Laço com while...");
		int contador = 1;
		while (contador <= LIMITE) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("Laço com do while...");
		contador = 1;
		do {
			System.out.println(contador);
		} while (contador++ < LIMITE);
	}
	public static int getLimite() {
		System.out.print("Digite um inteiro par: ");
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		int valorLido = leitor.nextInt();
		if (valorLido%2 == 0) {
			return valorLido;
		} else {
			throw new RuntimeException("O valor deve ser par!");
			//return getLimite();
		}
	}
}




