package es.java.interfaces;

/**
 * Interfaz con los metodos comunes para las clases
 * 
 * @author sinensia Juan Luis España
 *
 */
public interface Conducible {

	public void conducir(); // Metodo para decir que vehiculo esta conduciendo

	public void avanzar(double metros); // Se le pasan los metros que deseemos y si el vehiculo esta arrancado coge el
										// tiempo actual del sistema, despues se lo resta al tiempo inicial y nos dice
										// cuando hemos avanzado desde que arrancamos el vehiculo

	public void arrancar(); // Metodo utilizado para comprobar si un vehiculo esta arrancado. Si no lo esta
							// , empieza a correr el tiempo, si lo esta, te avisa que esta arrancado

	public void parar(); // Metodo utilizado para detener un vehiculo

	public double velocidad(); // Metodo utilizado para calcular la velocidad recorrida en el espacio y tiempo
	
	public void almacenarVelocidad(double velocidad); // Metodo al que le pasas un parametro y almacena las velocidades en un arrayList

}
