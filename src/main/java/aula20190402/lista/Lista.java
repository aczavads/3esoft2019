package aula20190402.lista;

public class Lista {
	private Object[] dados = new Object[0];

	public int obterTamanho() {
		return dados.length;
	}

	public void adicionar(Object elemento) {
		int tamanho = dados.length;
		
		Object[] novoArray = new Object[tamanho+1];
		
		for (int contador = 0; contador < tamanho; contador++) {
			novoArray[contador] = dados[contador];
		}
		novoArray[tamanho] = elemento;
		dados = novoArray;		
	}

	public Object pegar(int posição) {
		return dados[posição];
	}

	public void remover(int posição) {
		int tamanho = dados.length;
		
		Object[] novoArray = new Object[tamanho-1];
		int contadorNovo = 0;
		for (int contador = 0; contador < tamanho; contador++) {
			if (contador != posição) {
				novoArray[contadorNovo] = dados[contador];	
				contadorNovo++;
			} 
		}
		dados = novoArray;		
	}
	
	

}
