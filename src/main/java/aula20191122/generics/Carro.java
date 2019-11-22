package aula20191122.generics;

public class Carro<TIPO_DO_MOTOR extends Motor> {
	private TIPO_DO_MOTOR motor;
	
	
	public Carro() {
	}
	
	public void setMotor(TIPO_DO_MOTOR m) {
		this.motor = m;
	}
	
	
	public double getPotencia() {
		return motor.getPotencia();
	}

}
