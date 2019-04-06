package aula20190405.generics;

public class Lista<TIPO> {
	private Object[] dados = new Object[0];

	public int obterTamanho() {
		return dados.length;
	}

	public void adicionar(TIPO elemento) {
		int tamanho = dados.length;
		
		Object[] novoArray = new Object[tamanho+1];
		
		for (int contador = 0; contador < tamanho; contador++) {
			novoArray[contador] = dados[contador];
		}
		novoArray[tamanho] = elemento;
		dados = novoArray;		
	}

	public TIPO pegar(int posição) {
		return (TIPO)dados[posição];
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
