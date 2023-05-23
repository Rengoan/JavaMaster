package es.java.vehiculo;

/**
 * Clase hija de Terrestre > Vehiculo
 * @author sinensia Juan Luis España
 *
 */
import es.java.interfaces.Conducible;

public class Moto extends Terrestre implements Conducible {

	public Moto(String matricula, String color, String modelo, int potencia, int nRuedas) {
		super(matricula, color, modelo, potencia, nRuedas);

	}

	@Override
	public void conducir() {
		System.out.println(
				"Estoy conduciendo la moto " + modelo + " con matricula " + matricula + " , de color " + color);

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
