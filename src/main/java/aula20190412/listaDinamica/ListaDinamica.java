package aula20190412.listaDinamica;

public class ListaDinamica<TIPO_DO_ELEMENTO> {
	private Elemento primeiro;
	
	
	private int obterTamanho(Elemento atual, int tamanho) {
		if (atual == null) {
			return tamanho;
		} else {
			return obterTamanho(atual.proximo, tamanho+1);
		}
	}
	
	public int obterTamanho() {
		return obterTamanho(this.primeiro, 0);
//		if (primeiro == null) {
//			return 0;
//		}
//		int tamanho = 1;
//		Elemento atual = primeiro;
//		while (atual.proximo != null) {
//			atual = atual.proximo;
//			tamanho++;
//		}
//		return tamanho;
	}
	
	private void adicionar(Elemento atual, Elemento novo) {
		if (atual.proximo == null) {
			atual.proximo = novo;
		} else {
			adicionar(atual.proximo, novo);
		}
	}
	
	public void adicionar(TIPO_DO_ELEMENTO valor) {
		Elemento novo = new Elemento(valor);
		
		if (this.primeiro == null) {
			this.primeiro = novo;
		} else {
			adicionar(this.primeiro, novo);
		}
		
		/*
		if (this.primeiro == null) {
			this.primeiro = novo;
		} else {
			Elemento atual = primeiro;
			while (atual.proximo != null) {
				atual = atual.proximo;
			}
			atual.proximo = novo;
		}
		*/
	}
	
	
	private class Elemento {
		private TIPO_DO_ELEMENTO valor;
		private Elemento proximo;
		
		public Elemento(TIPO_DO_ELEMENTO valor) {
			this.valor = valor;
			this.proximo = null;
		}
	}


	public TIPO_DO_ELEMENTO pegar(int posicao) {
		if (posicao > obterTamanho()-1 || posicao < 0) {
			throw new RuntimeException("Posição fora do intervalo: " + posicao);
		}
		int contador = 0;
		Elemento atual = primeiro;
		while (atual != null) {
			if (contador == posicao) {
				return atual.valor;
			}
			atual = atual.proximo;
			contador++;
		}
		return null;
	}








}
