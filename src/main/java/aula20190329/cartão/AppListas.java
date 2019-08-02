package aula20190329.cartão;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppListas {
	
	public static void main(String[] args) {		
		byte valorByte = 0;
		Byte referenciaByte = 0;
		
		short valorShort = 0;
		Short referenciaShort = 0;
		
		int valorInt = 0;
		Integer referenciaInteger = 0;
		
		long valorLong = 0L;
		Long referenciaLong = 0L;
		
		float valorFloat = 0.0f;
		Float referenciaFloat = 0.0f;
		
		double valorDouble = 0.0d;
		Double referenciaDouble = 0.0d;
		
		boolean valorBoolean = true;
		Boolean referenciaBoolean = true;
		
		char valorChar = 'x';
		Character referenciaCharacter = 'x';
		
		System.out.println((int)valorChar);
		
		byte[] arrayDeBytes = new byte[] {1,2,3,4,5,6};
		Byte[] arrayDeReferenciasDeBytes = new Byte[] {1,2,3,4,5,6};
		
		short[] arrayDeShorts = new short[] {1000,2000,3000,4000};
		Short[] arrayDeReferenciasDeShorts = new Short[] {1000,2000,3000,4000};
		//e assim por diante...
		
		List lista = new ArrayList();
		lista.add(new Date());
		lista.add("Fulano de Tal");
		lista.add(new ArrayList());
		lista.add(valorDouble);
		
		for (Object elemento : lista) {
			System.out.println(elemento + ", classe="+elemento.getClass());			
		}
		
		List<Integer> valoresInteiros = new ArrayList<Integer>();
		String um = "1";
		valoresInteiros.add(Integer.parseInt(um));
		valoresInteiros.add(1);
		System.out.println("-------------");
		for (Object elemento : valoresInteiros) {
			System.out.println(elemento);
		}
		
		
 		
	}

}
