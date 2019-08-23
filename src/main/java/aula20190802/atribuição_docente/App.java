package aula20190802.atribuição_docente;

import java.util.Date;

public class App {
	
	public static void main(String[] args) {
		Professor marcello = new Professor("Marcello Erick Bonfim");
		Professor yorah = new Professor("Yorah Bosse");
		Professor nelson = new Professor("Nelson Ten�ro");
		Professor márcia = new Professor("M�rcia Pascutti");
		
		Curso ads = new Curso("An�lise e Desenvolvimento de Sistemas");
		Curso esoft = new Curso("Engenharia de Software");
		
		//ads.definirCoordenador(new Coordenador(início, fim, professor));
		
		ads.definirCoordenador(new Date(2005-1900,0,1), new Date(2009-1900,11,31), márcia);
		ads.definirCoordenador(new Date(2010-1900,0,1), null, yorah);
		
		System.out.println(ads.recuperarCoordenadorEm(new Date(2006-1900,6,6)).getProfessor().getNome());
	}

}
