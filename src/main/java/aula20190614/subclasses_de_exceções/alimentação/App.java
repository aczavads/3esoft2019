package aula20190614.subclasses_de_exceções.alimentação;

public class App {
	
	public static void main(String[] args) {
		
		Robô r2d2 = new Robô();
		
		Boi boi = new Boi();
		Frango frango = new Frango();
		Suíno suíno = new Suíno();
		
		r2d2.alimentar(boi);
		r2d2.alimentar(frango);
		r2d2.alimentar(suíno);

		
		r2d2.alimentar(frango);
		System.out.println("Ok.");

	}

}
