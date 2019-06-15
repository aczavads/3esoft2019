package aula20190614.subclasses_de_exceções.deposito;

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {

		boolean usuarioQuerContinuar = true;
		while (usuarioQuerContinuar) {
			try {
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));			
				Depósito d1 = new Depósito("1033-4", valor);
				System.out.println("Foi.");
			} catch (Exception exceçãoCapturada) {
				System.out.println("Erro: " + exceçãoCapturada.getMessage());
				usuarioQuerContinuar = JOptionPane.showConfirmDialog(null, "Valor inválido, deseja continuar?","Confirme", JOptionPane.YES_NO_OPTION) == 0;
			}
		}
		System.out.println("Fim.");
		
		
	}

}
