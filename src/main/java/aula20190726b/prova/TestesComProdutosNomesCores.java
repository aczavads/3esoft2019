package aula20190726b.prova;

import org.junit.Test;

import aula20190726b.prova.cor.Cor;
import aula20190726b.prova.produto.CorPadrãoInválidaException;
import aula20190726b.prova.produto.Produto;
import aula20190726b.prova.value_objects.Nome;
import aula20190726b.prova.value_objects.NomeInválidoException;

public class TestesComProdutosNomesCores {

	@Test(expected=NomeInválidoException.class)
	public void testarNomeVazio() {
		new Nome("");
	}
	@Test(expected=NomeInválidoException.class)
	public void testarNomeCurto() {
		new Nome("Z�");
	}
	@Test
	public void testarNomesCorretos() {
		new Nome("Jos�");
		new Nome("Maria Almeida de Albuquerque");
	}

	@Test
	public void testarProdutoCorreto() {
		Cor azul = new Cor(new Nome("Azul"));
		Cor rosa = new Cor(new Nome("Rosa"));
		Cor lilás = new Cor(new Nome("Lilás"));
		
		Produto pincelBic = new Produto(
				new Nome("Pincel Bic Marcador Plus"), 
				new Cor[] {azul, rosa, lilás}, 
				lilás);
	}
	
	@Test(expected=CorPadrãoInválidaException.class)
	public void testarProdutoComCorPadrãoInválida() {
		Cor azul = new Cor(new Nome("Azul"));
		Cor rosa = new Cor(new Nome("Rosa"));
		Cor lilás = new Cor(new Nome("Lilás"));
		
		Produto pincelBic = new Produto(
				new Nome("Pincel Bic Marcador Plus"), 
				new Cor[] {azul, rosa}, 
				lilás);
	}
	

}
