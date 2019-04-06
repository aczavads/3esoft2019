package aula20190405.innerClass;

public class Cofre {
	private Segredo superSegredo = new Segredo();
	
	
	

	//Nested class ou inner class
	private class Segredo {
		private String chave;
		
		//...
	}

}
