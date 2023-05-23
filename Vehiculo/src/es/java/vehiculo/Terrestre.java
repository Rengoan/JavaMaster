package es.java.vehiculo;

/**
 * Clase intermedia para distinguir entre marinos y terrestres, es este caso es
 * la rama de terrestres.
 * 
 * @author sinensia Juan Luis España
 *
 */

public class Terrestre extends Vehiculo {

	private int nRuedas;

	public Terrestre(String matricula, String color, String modelo, int potencia, int nRuedas) {
		super(matricula, color, modelo, potencia);
		this.nRuedas = nRuedas;
	}

	public int getnRuedas() {
		return nRuedas;
	}

	public void setnRuedas(int nRuedas) {
		this.nRuedas = nRuedas;
	}

}
