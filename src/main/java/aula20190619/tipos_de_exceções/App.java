package aula20190619.tipos_de_exceções;

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		Prensa p1 = new Prensa();		
		try {
			p1.conectarRedeElétrica();
			System.out.println("Conectado à rede elétrica! :D");			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao conectar à rede elétrica: " + e.getMessage());
			System.out.println("Aborted.");
			//e.printStackTrace();
			//throw new RuntimeException(e);
		} finally {
			p1.desligar();
		}
		System.out.println("Fim.");
		
	}

}
