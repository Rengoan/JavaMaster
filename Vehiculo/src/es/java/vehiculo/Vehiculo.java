package es.java.vehiculo;

/**
 * Clase padre que representa los vehiculos en general
 * 
 * @author sinensia Juan Luis España
 *
 */
public abstract class Vehiculo {

	protected String matricula; // La matricula del vehiculo declarada final para que no se pueda modificar una
								// vez
								// instanciado el objeto
	protected String color; // Color del vehiculo
	protected String modelo; // Modelo del vehiculo
	protected int potencia; // Potencia del vehiculo
	protected boolean arrancado; // Para saber si esta arrancado
	protected double tiempoInicial; // Tiempo en el que se inicia
	protected double tiempoActual; // Tiempo actual
	protected double espacioRecorrido; // Espacio recorrido

	/**
	 * 
	 * @param matricula del vehiculo
	 * @param color     del vehiculo
	 * @param modelo    del vehiculo
	 * @param potencia  del vehiculo
	 */

	public Vehiculo(String matricula, String color, String modelo, int potencia) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.modelo = modelo;
		this.potencia = potencia;

	}

	/**
	 * 
	 * @param arrancado        boolean para saber si esta arrancado
	 * @param tiempoInicial    Indica el tiempo cuando se arranca el vehiculo
	 * @param tiempoActual     Indica el tiempo actual
	 * @param espacioRecorrido Para calcular el
	 */

	public Vehiculo() {
		arrancado = false;
		tiempoInicial = 0.0;
		tiempoActual = 0.0;
		espacioRecorrido = 0.0;
	}

}
