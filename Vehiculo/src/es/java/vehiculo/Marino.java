package es.java.vehiculo;

/**
 * Clase intermedia para distinguir entre marinos y terrestres, en este caso es
 * la rama de vehículos marinos.
 * 
 * @author sinensia Juan Luis España
 *
 */
public class Marino extends Vehiculo {

	// No se me han ocurrido ninguna propiedad exclusiva de vehiculos marinos,
	// pero en un futuro se podria implementar para añadir mas vehiculos similares
	// al barco
	public Marino(String matricula, String color, String modelo, int potencia) {
		super(matricula, color, modelo, potencia);

	}

}
