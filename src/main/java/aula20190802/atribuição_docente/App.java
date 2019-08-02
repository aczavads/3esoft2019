package aula20190802.atribuição_docente;

import java.util.Date;

public class App {
	
	public static void main(String[] args) {
		Professor marcello = new Professor("Marcello Erick Bonfim");
		Professor yorah = new Professor("Yorah Bosse");
		Professor nelson = new Professor("Nelson Tenório");
		Professor márcia = new Professor("Márcia Pascutti");
		
		Curso ads = new Curso("Análise e Desenvolvimento de Sistemas");
		Curso esoft = new Curso("Engenharia de Software");
		
		ads.definirCoordenador(new Date(2005,0,1), new Date(2009,11,31), márcia);
		
		System.out.println(ads.consultarCoordenadorEm(new Date(2006,6,6)).getProfessor().getNome());
	}

}
