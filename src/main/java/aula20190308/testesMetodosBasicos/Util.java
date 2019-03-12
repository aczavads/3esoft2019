package aula20190308.testesMetodosBasicos;

public class Util {
	
	public static int somar(int v1, int v2) {
		return v1+v2;
	}
	
	public static double triplo(double valor) {
		return 3 * valor;
	}
	
	public static int contarPares(int[] inteiros) {
		int pares = 0;
		
		//for (int valor : inteiros) {
		for (int contador = 0; contador < inteiros.length; contador++) {
			int valor = inteiros[contador];
			if (valor%2==0) {
				pares++;
			}
		}
		return pares;
	}

	public static void seiLah(Pessoa p) {
		p.setNome(p.getNome().toUpperCase());		
	}


}
