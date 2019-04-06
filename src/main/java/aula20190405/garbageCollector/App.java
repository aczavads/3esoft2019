package aula20190405.garbageCollector;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		for (int i = 0; i < 5_000_000; i++) {
			pessoas.add(new Pessoa("Nome " + i, i));
		}
		JOptionPane.showMessageDialog(null, "Primeira parada...");
		pessoas.clear();
		for (int i = 0; i < 100; i++) {
			System.gc();
		}
		for (int i = 0; i < 1_000_000; i++) {
			pessoas.add(new Pessoa("Nome " + i, i));
		}
		JOptionPane.showMessageDialog(null, "Segunda parada...");
		
	}

}
