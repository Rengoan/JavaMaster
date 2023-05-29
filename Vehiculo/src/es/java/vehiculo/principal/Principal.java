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

/**
 * Clase principal para ejecutar el programa.
 * 
 * @author sinensia Juan Luis España
 */

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("=== MENÚ PRINCIPAL ===");
			System.out.println("1. Camión");
			System.out.println("2. Moto");
			System.out.println("3. Coche");
			System.out.println("4. Barco");
			System.out.println("5. Salir");
			System.out.print("Elige una opción: ");
			if (scanner.hasNextInt()) {
				opcion = scanner.nextInt();
				scanner.nextLine(); // Limpiar el búfer después de leer el entero

//Al pasar el objeto scanner como argumento, se permite que cada método tenga acceso al mismo objeto scanner y pueda leer la entrada del usuario de manera consistente.
				switch (opcion) {
				case 1:
					menuCamion(scanner);
					break;
				case 2:
					menuMoto(scanner);
					break;
				case 3:
					menuCoche(scanner);
					break;
				case 4:
					menuBarco(scanner);
					break;
				case 5:
					// Termina el programa
					System.out.println("Saliendo del programa...");
					System.exit(0);
					break;
				default:
					System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
					break;
				}
			} else {
				System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
				scanner.nextLine(); // Limpiar el búfer en caso de entrada no válida
			}

		} while (opcion != 5);

		scanner.close();

	}

	public static void menuCamion(Scanner scanner) {
		Camion c1 = new Camion("4532LKO", "Verde", "Pegasus", 500, 7);
		c1.conducir();
		System.out.println("=========================================================");
		// Configurar un menú interactivo para el camión
		int opcion = 0;

		do {
			// Mostrar el menú
			System.out.println("=== MENÚ ===");
			System.out.println("1. Arrancar camion");
			System.out.println("2. Avanzar camion");
			System.out.println("3. Velocidad camion");
			System.out.println("4. Parar camion");
			System.out.println("5. Velocidades del camion");
			System.out.println("6. Salir");
			System.out.print("Elige una opción: ");
			if (scanner.hasNextInt()) {
				opcion = scanner.nextInt();
				scanner.nextLine(); // Limpiar el búfer después de leer el entero

				switch (opcion) {
				case 1:
					// Arranca el camión
					System.out.println();
					c1.arrancar();
					System.out.println();
					break;
				case 2:
					// Avanzar el camión introduciendo los metros recorridos
					double metros = 0.0;
					System.out.println();
					System.out.println("Introduce los metros recorridos");

					metros = scanner.nextDouble();
					System.out.println();
					c1.avanzar(metros);
					break;
				case 3:
					// Obtener y mostrar la velocidad del camión
					double velocidad = c1.velocidad();
					System.out.println();
					System.out.println("La velocidad del camion es de " + velocidad + " km/h");
					System.out.println();
					c1.almacenarVelocidad(velocidad);
					break;
				case 4:
					// Para el camión
					System.out.println();
					c1.parar();
					System.out.println();
					break;
				case 5:
					// Obtener y mostrar las velocidades registradas del camión
					System.out.println();
					List<Double> velocidades = c1.getTacometro();
					System.out.println("Velocidades registradas: ");
					for (double velocidadC : velocidades) {
						System.out.println(velocidadC + " km/h");
					}
					break;
				case 6:
					// Opción para salir del programa
					System.out.println();
					System.out.println("Saliendo del programa...");
					System.out.println();
					break;
				default:
					// Opción default para el caso en que introduzcas mas la opción
					System.out.println();
					System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
					System.out.println();
					break;
				}
			} else {
				System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
				scanner.nextLine(); // Limpiar el búfer en caso de entrada no válida
			}
		} while (opcion != 6);

	}

	public static void menuMoto(Scanner scanner) {
		Moto m1 = new Moto("5434POI", "Azul", "Honda", 120, 2);
		m1.conducir();
		System.out.println("=========================================================");
		// Configurar un menú interactivo para la moto
		int opcion = 0;

		do {
			// Mostrar el menú
			System.out.println("=== MENÚ ===");
			System.out.println("1. Arrancar moto");
			System.out.println("2. Avanzar moto");
			System.out.println("3. Velocidad moto");
			System.out.println("4. Parar moto");
			System.out.println("5. Velocidades de la moto");
			System.out.println("6. Salir");
			System.out.print("Elige una opción: ");
			if (scanner.hasNextInt()) {
				opcion = scanner.nextInt();
				scanner.nextLine(); // Limpiar el búfer después de leer el entero

				switch (opcion) {
				case 1:
					// Arranca la moto
					System.out.println();
					m1.arrancar();
					System.out.println();
					break;
				case 2:
					// Avanzar la moto introduciendo los metros recorridos
					double metros = 0.0;
					System.out.println();
					System.out.println("Introduce los metros recorridos");
					metros = scanner.nextDouble();
					System.out.println();
					m1.avanzar(metros);
					break;
				case 3:
					// Obtener y mostrar la velocidad de la moto
					double velocidad = m1.velocidad();
					System.out.println();
					System.out.println("La velocidad de la moto es de " + velocidad + " km/h");
					System.out.println();
					m1.almacenarVelocidad(velocidad);
					break;
				case 4:
					// Para la moto
					System.out.println();
					m1.parar();
					System.out.println();
					break;
				case 5:
					// Obtener y mostrar las velocidades registradas de la moto
					System.out.println();
					List<Double> velocidades = m1.getTacometro();
					System.out.println("Velocidades registradas: ");
					for (double velocidadM : velocidades) {
						System.out.println(velocidadM + " km/h");
					}
					break;
				case 6:
					// Opción para salir del programa
					System.out.println();
					System.out.println("Saliendo del programa...");
					System.out.println();
					break;
				default:
					// Opción default para el caso en que introduzcas mas la opción
					System.out.println();
					System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
					System.out.println();
					break;
				}
			} else {
				System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
				scanner.nextLine(); // Limpiar el búfer en caso de entrada no válida
			}
		} while (opcion != 6);

	}

	public static void menuCoche(Scanner scanner) {
		Coche co = new Coche("3522FZK", "Amarillo", "Seat Leon", 170);
		co.conducir();
		System.out.println("=========================================================");
		// Configurar un menú interactivo para el coche
		int opcion = 0;

		do {
			// Mostrar el menú
			System.out.println("=== MENÚ ===");
			System.out.println("1. Arrancar coche");
			System.out.println("2. Avanzar coche");
			System.out.println("3. Velocidad coche");
			System.out.println("4. Parar coche");
			System.out.println("5. Velocidades del coche");
			System.out.println("6. Salir");
			System.out.print("Elige una opción: ");
			if (scanner.hasNextInt()) {
				opcion = scanner.nextInt();
				scanner.nextLine(); // Limpiar el búfer después de leer el entero

				switch (opcion) {
				case 1:
					// Arranca el coche
					System.out.println();
					co.arrancar();
					System.out.println();
					break;
				case 2:
					// Avanzar el coche introduciendo los metros recorridos
					double metros = 0.0;
					System.out.println();
					System.out.println("Introduce los metros recorridos");
					metros = scanner.nextDouble();
					System.out.println();
					co.avanzar(metros);
					break;
				case 3:
					// Obtener y mostrar la velocidad del coche
					double velocidad = co.velocidad();
					System.out.println();
					System.out.println("La velocidad del coche es de " + velocidad + " km/h");
					System.out.println();
					co.almacenarVelocidad(velocidad);
					break;
				case 4:
					// Para el coche
					System.out.println();
					co.parar();
					System.out.println();
					break;
				case 5:
					// Obtener y mostrar las velocidades registradas del coche
					System.out.println();
					List<Double> velocidades = co.getTacometro();
					System.out.println("Velocidades registradas: ");
					for (double velocidadCo : velocidades) {
						System.out.println(velocidadCo + " km/h");
					}
					break;
				case 6:
					// Opción para salir del programa
					System.out.println();
					System.out.println("Saliendo del programa...");
					System.out.println();
					break;
				default:
					// Opción default para el caso en que introduzcas mas la opción
					System.out.println();
					System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
					System.out.println();
					break;
				}
			} else {
				System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
				scanner.nextLine(); // Limpiar el búfer en caso de entrada no válida
			}
		} while (opcion != 6);

	}

	public static void menuBarco(Scanner scanner) {
		Barco b1 = new Barco("2334534POI", "Blanco", "Suzuki", 200);
		b1.conducir();
		System.out.println("=========================================================");
		// Configurar un menú interactivo para el barco

		int opcion = 0;

		do {
			// Mostrar el menú
			System.out.println("=== MENÚ ===");
			System.out.println("1. Arrancar barco");
			System.out.println("2. Avanzar barco");
			System.out.println("3. Velocidad barco");
			System.out.println("4. Parar barco");
			System.out.println("5. Velocidades del barco");
			System.out.println("6. Salir");
			System.out.print("Elige una opción: ");
			if (scanner.hasNextInt()) {
				opcion = scanner.nextInt();
				scanner.nextLine(); // Limpiar el búfer después de leer el entero

				switch (opcion) {
				case 1:
					// Arranca el barco
					System.out.println();
					b1.arrancar();
					System.out.println();
					break;
				case 2:
					// Avanzar el barco introduciendo los metros recorridos
					double metros = 0.0;
					System.out.println();
					System.out.println("Introduce los metros recorridos");
					metros = scanner.nextDouble();
					System.out.println();
					b1.avanzar(metros);
					break;
				case 3:
					// Obtener y mostrar la velocidad del barco
					double velocidad = b1.velocidad();
					System.out.println();
					System.out.println("La velocidad del barco es de " + velocidad + " nudos/h");
					System.out.println();
					b1.almacenarVelocidad(velocidad);
					break;
				case 4:
					// Para el barco
					System.out.println();
					b1.parar();
					System.out.println();
					break;
				case 5:
					// Obtener y mostrar las velocidades registradas del barco
					System.out.println();
					List<Double> velocidades = b1.getTacometro();
					System.out.println("Velocidades registradas: ");
					for (double velocidadCo : velocidades) {
						System.out.println(velocidadCo + " nudos/h");
					}
					break;
				case 6:
					// Opción para salir del programa
					System.out.println();
					System.out.println("Saliendo del programa...");
					System.out.println();
					break;
				default:
					// Opción default para el caso en que introduzcas mas la opción
					System.out.println();
					System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
					System.out.println();
					break;
				}
			} else {
				System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
				scanner.nextLine(); // Limpiar el búfer en caso de entrada no válida
			}
		} while (opcion != 6);

	}
}
