package es.java.vehiculo;

/**
 * Clase hija de Terrestre > Vehiculo
 * @author sinensia Juan Luis España
 *
 */

import es.java.interfaces.Conducible;

public class Coche extends Terrestre implements Conducible {

	public Coche(String matricula, String color, String modelo, int potencia) {
		super(matricula, color, modelo, potencia, 4);

	}

	@Override
	public void conducir() {
		System.out.println(
				"Estoy conduciendo el coche " + modelo + " con matricula " + matricula + " , de color " + color);

	}

	@Override
	public void avanzar(double metros) {

		if (arrancado) {
			double tiempoAnterior = tiempoActual;
			tiempoActual = System.currentTimeMillis(); // Recoge la hora del sistema y la guarda cuando se ejecuta el
			// metodo
			double tiempoTranscurrido = (tiempoActual - tiempoAnterior) / 1000.0; // Convertir a segundos
			espacioRecorrido += metros;
			System.out.println(
					"Has avanzado " + metros + " metros. Tiempo transcurrido: " + tiempoTranscurrido + " segundos.");
		} else {
			System.out.println("El coche no está arrancado. No se puede avanzar.");
		}
	}

	@Override
	public void parar() {

		if (arrancado) {
			double tiempoFinal = System.currentTimeMillis();
			double tiempoTotal = (tiempoFinal - tiempoInicial) / 1000.0; // Convertir a segundos
			System.out.println("El coche ha parado. Tiempo total de viaje: " + tiempoTotal + " segundos.");
			arrancado = false;
		} else {
			System.out.println("El coche ya está parado.");
		}

	}

	@Override
	public void arrancar() {

		if (!arrancado) {
			arrancado = true;
			tiempoInicial = System.currentTimeMillis();
			tiempoActual = tiempoInicial;
			System.out.println("El coche ha arrancado.");
		} else {
			System.out.println("El coche ya está arrancado.");
		}
	}

	@Override
	public double velocidad() {
		if (tiempoActual != tiempoInicial) {
			double tiempoTranscurrido = (tiempoActual - tiempoInicial) / 1000.0; // Convertir a segundos
			return espacioRecorrido / tiempoTranscurrido;
		} else {
			System.out.println("El coche no ha avanzado. No se puede calcular la velocidad.");
			return 0.0;
		}
	}

	@Override
	public void almacenarVelocidad(double velocidad) {
		// TODO Auto-generated method stub
		
	}

}
