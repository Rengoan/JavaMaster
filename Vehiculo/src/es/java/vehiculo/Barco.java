package es.java.vehiculo;

import java.util.ArrayList;
import java.util.List;

/**
  * Clase hija de Maritimo que representa un vehículo de tipo barco.
 * Implementa la interfaz Conducible.
 * @author sinensia Juan Luis España
 *
 */

import es.java.interfaces.Conducible;

public class Barco extends Marino implements Conducible {

	private List<Double> tacometro; // Tacometro para almacenar las velocidades del trayecto

	public Barco(String matricula, String color, String modelo, int potencia, List<Double> tacometro) {
		super(matricula, color, modelo, potencia);
		this.tacometro = tacometro; // Inicializar la lista de velocidades
	}

	public Barco(String matricula, String color, String modelo, int potencia) {
		super(matricula, color, modelo, potencia);
		this.tacometro = new ArrayList<>(); // Inicializar una lista vacía para almacenar las velocidades

	}

	@Override
	public void conducir() {
		System.out.println(
				"Estoy navegando con el barco " + modelo + " con matricula " + matricula + " , de color " + color);

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
			System.out.println("El barco no está arrancado. No se puede avanzar.");
		}
	}

	@Override
	public void parar() {

		if (arrancado) {
			double tiempoFinal = System.currentTimeMillis();
			double tiempoTotal = (tiempoFinal - tiempoInicial) / 1000.0; // Convertir a segundos
			System.out.println("El barco ha parado. Tiempo total de viaje: " + tiempoTotal + " segundos.");
			arrancado = false;
		} else {
			System.out.println("El barco ya está parado.");
		}
	}

	@Override
	public void arrancar() {

		if (!arrancado) {
			arrancado = true;
			tiempoInicial = System.currentTimeMillis();
			tiempoActual = tiempoInicial;
			System.out.println("El barco ha arrancado.");
		} else {
			System.out.println("El barco ya está arrancado.");
		}
	}

	@Override
	public double velocidad() {
		if (tiempoActual != tiempoInicial) {
			double tiempoTranscurrido = (tiempoActual - tiempoInicial) / 1000.0; // Convertir a segundos
			double velocidadMetrosPorSegundo = espacioRecorrido / tiempoTranscurrido;
			double velocidadNudos = velocidadMetrosPorSegundo * 1.94384; // Conversión de metros por segundo a nudos
			return Math.round(velocidadNudos);
		} else {
			System.out.println("El barco no ha avanzado. No se puede calcular la velocidad.");
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
