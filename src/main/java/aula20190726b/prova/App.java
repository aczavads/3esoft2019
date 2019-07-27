package aula20190726b.prova;

import aula20190726b.prova.cor.Cor;
import aula20190726b.prova.produto.Produto;
import aula20190726b.prova.value_objects.Nome;

public class App {
	
	public static void main(String[] args) {
		Cor azul = new Cor(new Nome("Azul"));
		Cor rosa = new Cor(new Nome("Rosa"));
		Cor lilás = new Cor(new Nome("Lilás"));
		
		Produto pincelBic = new Produto(
				new Nome("Pincel Bic Marcador Plus"), 
				new Cor[] {azul, rosa, lilás}, 
				lilás);
	}

}
