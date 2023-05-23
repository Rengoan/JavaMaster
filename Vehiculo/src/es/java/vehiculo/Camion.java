package es.java.vehiculo;

import java.util.ArrayList;

/**
 * Clase hija de Terrestre > Vehiculo
 * @author sinensia Juan Luis España
 *
 */

import java.util.List;

import es.java.interfaces.Conducible;

public class Camion extends Terrestre implements Conducible {

	private List<Double> tacometro; // Tacometro para almacenar las velocidades del trayecto

	public Camion(String matricula, String color, String modelo, int potencia, int nRuedas, List<Double> tacometro) {
		super(matricula, color, modelo, potencia, nRuedas);
		this.tacometro = tacometro; // Prueba para almacenar la velocidad
	}

	public Camion(String matricula, String color, String modelo, int potencia, int nRuedas) {
		super(matricula, color, modelo, potencia, nRuedas);
		this.tacometro = new ArrayList<>(); // Inicializar la lista

	}

	@Override
	public void conducir() {

		System.out.println(
				"Estoy conduciendo el camion " + modelo + " con matricula " + matricula + " , de color " + color);

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
			System.out.println("El camion no está arrancado. No se puede avanzar.");
		}
	}

	@Override
	public void parar() {

		if (arrancado) {
			double tiempoFinal = System.currentTimeMillis();
			double tiempoTotal = (tiempoFinal - tiempoInicial) / 1000.0; // Convertir a segundos
			System.out.println("El camion ha parado. Tiempo total de viaje: " + tiempoTotal + " segundos.");
			arrancado = false;
		} else {
			System.out.println("El camion ya está parado.");
		}
	}

	@Override
	public void arrancar() {

		if (!arrancado) {
			arrancado = true;
			tiempoInicial = System.currentTimeMillis();
			tiempoActual = tiempoInicial;
			System.out.println("El camion ha arrancado.");
		} else {
			System.out.println("El camion ya está arrancado.");
		}
	}

	@Override
	public double velocidad() {

		if (tiempoActual != tiempoInicial) {
			double tiempoTranscurrido = (tiempoActual - tiempoInicial) / 1000.0; // Convertir a segundos
			return Math.round(espacioRecorrido / tiempoTranscurrido);
		} else {
			System.out.println("El camion no ha avanzado. No se puede calcular la velocidad.");
			return 0.0;
		}
	}

	@Override
	public void almacenarVelocidad(double velocidad) {
		this.tacometro.add(velocidad);

	}

	public List<Double> getTacometro() {
		return this.tacometro;
	}

}
