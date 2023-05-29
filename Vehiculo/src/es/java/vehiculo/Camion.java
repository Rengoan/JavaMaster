package es.java.vehiculo;

import java.util.ArrayList;



import java.util.List;

import es.java.interfaces.Conducible;

/**
 * Clase hija de Terrestre que representa un vehículo de tipo camión.
 * Implementa la interfaz Conducible.
 *
 * @author sinensia Juan Luis España
 *
 */
public class Camion extends Terrestre implements Conducible {

	private List<Double> tacometro; // Tacometro para almacenar las velocidades del trayecto

	public Camion(String matricula, String color, String modelo, int potencia, int nRuedas, List<Double> tacometro) {
		super(matricula, color, modelo, potencia, nRuedas);
		this.tacometro = tacometro; // Inicializar la lista de velocidades
	}

	public Camion(String matricula, String color, String modelo, int potencia, int nRuedas) {
		super(matricula, color, modelo, potencia, nRuedas);
		this.tacometro = new ArrayList<>(); // Inicializar una lista vacía para almacenar las velocidades

	}

	/**
	 * Metodo de la interfaz Conducible que nos muestra las caracteristicas del
	 * camion
	 * 
	 */
	@Override
	public void conducir() {

		System.out.println(
				"Estoy conduciendo el camion " + modelo + " con matricula " + matricula + " , de color " + color);

	}

	/**
	 * @param metros , Se pasan por teclado cuando quieras avanzar Se le pasan los
	 *               metros que deseemos y si el vehiculo esta arrancado coge el
	 *               tiempo actual del sistema, despues se lo resta al tiempo
	 *               inicial y nos dice uando hemos avanzado desde que arrancamos el
	 *               vehiculo
	 */
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

	/**
	 * Metodo utilizado para detener un vehiculo
	 * 
	 */
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

	/**
	 * Metodo utilizado para comprobar si un vehiculo esta arrancado. Si no lo esta
	 * empieza a correr el tiempo, si lo esta, te avisa que esta arrancado
	 */
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

	/**
	 * Metodo utilizado para calcular la velocidad recorrida en el espacio y tiempo
	 */
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
	
	/**
	 * @param velocidad Parametro que recoge la velocidad y luego se almacena en el arrayList
	 * Metodo al que le pasas un parametro y almacena las velocidades en un arrayList
	 */
	@Override
	public void almacenarVelocidad(double velocidad) {
		this.tacometro.add(velocidad);

	}

	/**
	 * 
	 * @return tacometro
	 */
	public List<Double> getTacometro() {
		return this.tacometro;
	}

}
