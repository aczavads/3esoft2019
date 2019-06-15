package aula20190614.subclasses_de_exceções;

public class App {
	
	public static void main(String[] args) {
		
		gerarExceção();
		
	}
	
	public static void gerarExceção() {
		//RuntimeException umaExceção = new RuntimeException("Ulha!");
		RuntimeException umaExceção = new UlhaException();
		
		throw umaExceção;		
	}

}
