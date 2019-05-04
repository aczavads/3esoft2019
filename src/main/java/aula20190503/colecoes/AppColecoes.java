package aula20190503.colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AppColecoes {
	
	public static void main(String[] args) {
		System.out.println("--- lista ---");
		List<String> nomes = new ArrayList<>();
		nomes.add("Ana");
		nomes.add("Ana");
		nomes.add("Ana");
		nomes.add("Joana");
		
		nomes.remove(2);
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("Nome na última posição: " + nomes.get(nomes.size()-1) );

		System.out.println("--- conjunto ---");
		Set<String> conjuntoDeNomes = new HashSet<>();
		conjuntoDeNomes.add("Ana");
		conjuntoDeNomes.add("Ana");
		conjuntoDeNomes.add("Ana");
		conjuntoDeNomes.add("Joana");
		for (String nome : conjuntoDeNomes) {
			System.out.println(nome);
		}
		
		
		System.out.println("--- mapa ---");
		/*
			   CHAVE (KEY)     VALOR (VALUE)
			SIGLA_DO_PAIS      POPULACAO
		 		BR			  202_000_000
			    US            300_000_000
			    CA             32_000_000
		*/ 
		Map<String, Long> mapaDePopulacaoPorPais = new HashMap<>();
		mapaDePopulacaoPorPais.put("BR", 202_000_000L);
		mapaDePopulacaoPorPais.put("US", 300_000_000L);
		mapaDePopulacaoPorPais.put("CA",  32_000_000L);
		mapaDePopulacaoPorPais.put("CA",  35_222_000L);
		
		System.out.println("População do Canadá: " + mapaDePopulacaoPorPais.get("CA"));
		System.out.println("Existe China? " + mapaDePopulacaoPorPais.containsKey("CN"));
		
		for (String sigla : mapaDePopulacaoPorPais.keySet()) {
			System.out.println("O país " + sigla + " tem " + mapaDePopulacaoPorPais.get(sigla) + " habitantes");
		}
		
	}

}
