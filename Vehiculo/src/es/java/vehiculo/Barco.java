package es.java.vehiculo;

/**
 * Clase hija de Marino > Vehiculo
 * @author sinensia Juan Luis España
 *
 */

import es.java.interfaces.Conducible;

public class Barco extends Marino implements Conducible {

	public Barco(String matricula, String color, String modelo, int potencia) {
		super(matricula, color, modelo, potencia);

	}

	@Override
	public void conducir() {
		System.out.println(
				"Estoy navegando con el barco " + modelo + " con matricula " + matricula + " , de color " + color);

	}

	@Override
	public void avanzar(double metros) {

	}

	@Override
	public void parar() {

	}

	@Override
	public void arrancar() {

	}

	@Override
	public double velocidad() {

		return 0;
	}

	@Override
	public void almacenarVelocidad(double velocidad) {
		// TODO Auto-generated method stub
		
	}

}
