package aula20190405.recursão;

public class App {
	
	public static void main(String[] args) {
		int[] valores = {1,2,3,4,5,6,7,10,20,30,40,50,60,70,80};
		listarRecursivo(valores, 0);
	}

	private static void listarRecursivo(int[] valores, int posicao) {
		if (posicao == valores.length) {
			return;
		}
		listarRecursivo(valores, posicao+1);
		System.out.println(valores[posicao]);
			
	}

}
