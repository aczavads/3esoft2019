package aula20191122.generics;

import java.util.List;
import java.util.ArrayList;

public class App {
	
	public static void main(String[] args) {
		Carro<MotorVW> polo = new Carro<MotorVW>();
		Carro<MotorFord> fiesta = new Carro<MotorFord>();
		polo.setMotor(new Motor200TSI());
		fiesta.setMotor(new Ecoboost1());
		
		System.out.println(polo.getPotencia());
		System.out.println(fiesta.getPotencia());

		/*
		List<Carro> lista = new ArrayList<Carro>();
		lista.add("adsfasd");
		lista.add(1);
		lista.add(polo);
		lista.add(fiesta);
		lista.add(new App());
		*/
		
		Polo outroPolo = new Polo();
		outroPolo.setMotor(new Motor200TSI());
		
	}
	
	
}
