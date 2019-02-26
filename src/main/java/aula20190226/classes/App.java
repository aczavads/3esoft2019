package aula20190226.classes;

public class App {
	
	public static void main(String[] args) {
		//String[] nomes = {"Ana","Beatriz","Jonas","Bianca"};
		//int[] idades = {10,20,30,40};
		
		//Pessoa[] pessoas = {null, null, null, null};
		/*
		Pessoa[] pessoas = new Pessoa[4];
		pessoas[0] = new Pessoa();
		pessoas[0].nome = "Ana";
		pessoas[0].idade = 10;

		pessoas[1] = new Pessoa();
		pessoas[1].nome = "Beatriz";
		pessoas[1].idade = 20;

		pessoas[2] = new Pessoa();
		pessoas[2].nome = "Jonas";
		pessoas[2].idade = 30;

		pessoas[3] = new Pessoa();
		pessoas[3].nome = "Bianca";
		pessoas[3].idade = 40;
		*/
		
		Pessoa[] pessoas = { 
				new Pessoa("Ana",10), 
				new Pessoa("Beatriz",20), 
				new Pessoa("Jonas",30), 
				new Pessoa("Bianca",40)};
		pessoas[1].idade = 2000;
		/*
		for (Pessoa pessoinha : pessoas) {
			System.out.println(pessoinha.nome + " " + pessoinha.idade);
		}
		*/
		for (int i = 0; i < pessoas.length; i++) {
			Pessoa pessoinha = pessoas[i];
			System.out.println(pessoinha.nome + " " + pessoinha.idade);
		}
}

}
