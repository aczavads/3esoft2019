package aula20190412.listaDinamica;

public class App {
	
	public static void main(String[] args) {
		ListaDinamica nomes = new ListaDinamica();
		nomes.adicionar("Ela");
		nomes.adicionar(new Elefante());
		nomes.adicionar("Ele");
		nomes.adicionar("E");
		nomes.adicionar("x");
		for (int i = 0; i < 1000; i++) {
			nomes.adicionar("x");
		}
		nomes.adicionar("xis");
		
		System.out.println("Foi. Tamanho: " + nomes.obterTamanho());
		
		System.out.println(nomes.pegar(1005));
		
	}

}
