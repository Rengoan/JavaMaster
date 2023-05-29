package es.java.interfaces;

/**
 * Interfaz con los metodos comunes para las clases
 * 
 * @author sinensia Juan Luis España
 *
 */
public interface Conducible {

	public void conducir();

	public void avanzar(double metros); 

	public void arrancar(); // 

	public void parar(); 

	public double velocidad(); 
	
	public void almacenarVelocidad(double velocidad); 

}
