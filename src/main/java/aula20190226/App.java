package aula20190226;

public class App {
	
	public static void main(String[] args) {
		String[] nomes = {"Ana","Beatriz","Jonas","Bianca"};
		int[] idades = {10,20,30,40};
		System.out.println(somarIdades(idades));
		System.out.println(obterMaiorIdade(idades));
	}
	//Criar outro método que retorne a soma das idades
	public static int somarIdades(int[] idades) {
		int soma = 0;
		for (int contador = 0; contador < idades.length; contador++) {
			soma += idades[contador];
		}
		return soma;
	}
	
	public static int obterMaiorIdade(int[] idades) {
		if (idades.length == 0) {
			throw new RuntimeException("O array de idades está vazio!");
		}
		int maior = idades[0];
		for (int contador=0; contador < idades.length; contador++) {
			if (idades[contador] > maior) {
				maior = idades[contador];
			}
		}
		return maior; 
	}

}
