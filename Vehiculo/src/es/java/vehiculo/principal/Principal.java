package es.java.vehiculo.principal;

import java.util.List;

/**
 * Clase principal para ejecutar el programa
 * @author sinensia Juan Luis España
 *
 */

import java.util.Scanner;

import es.java.vehiculo.Barco;
import es.java.vehiculo.Camion;
import es.java.vehiculo.Coche;
import es.java.vehiculo.Moto;

public class Principal {

	public static void main(String[] args) {

		Camion c1 = new Camion("4532LKO", "Verde", "Pegasus", 500, 7);
		Moto m1 = new Moto("5434POI", "Azul", "Honda", 120, 2);
		Coche co = new Coche("3522FZK", "Amarillo", "Seat Leon", 170);
		Barco b1 = new Barco("2334534POI", "Blanco", "Suzuki", 200);

		c1.conducir();
		System.out.println("=========================================================");
		m1.conducir();
		System.out.println("=========================================================");
		co.conducir();
		System.out.println("=========================================================");
		b1.conducir();
		System.out.println("=========================================================");

		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("=== MENÚ ===");
			System.out.println("1. Arrancar camion");
			System.out.println("2. Avanzar camion");
			System.out.println("3. Velocidad camion");
			System.out.println("4. Parar camion");
			System.out.println("5. Velocidades del camion");
			System.out.println("6. Salir");
			System.out.print("Elige una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				System.out.println();
				c1.arrancar();
				System.out.println();
				break;
			case 2:
				double metros = 0.0;
				System.out.println();
				System.out.println("Introduce los metros recorridos");
				metros = scanner.nextDouble();
				System.out.println();
				c1.avanzar(metros);
				break;
			case 3:
				double velocidad = c1.velocidad();
				System.out.println();
				System.out.println("La velocidad del camion es de " + velocidad + " km/h");
				System.out.println();
				c1.almacenarVelocidad(velocidad);
				break;
			case 4:
				System.out.println();
				c1.parar();
				System.out.println();
				break;
			case 5:
				System.out.println();
				List<Double> velocidades = c1.getTacometro();
				System.out.println("Velocidades registradas: ");
				for (double velocidadC : velocidades) {
					System.out.println(velocidadC + " km/h");
				}
				break;
			case 6:
				System.out.println();
				System.out.println("Saliendo del programa...");
				System.out.println();
				break;
			default:
				System.out.println();
				System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
				System.out.println();
				break;
			}
		} while (opcion != 6);

		scanner.close();
	}

}
