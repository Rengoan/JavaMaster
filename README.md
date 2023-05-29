# Proyecto Vehiculos
## Tabla de contenidos
- [Descripción](#descripción)
- [Uso](#uso)
- [Caracteristicas](#caracteristicas)
- [Actualizaciones](#actualizaciones)

### Descripción
El código ofrece una forma **modular** y **reutilizable** de representar y trabajar con diferentes tipos de vehículos.

- Vehiculo: Esta es la clase base abstracta que representa un vehículo en general. Tiene propiedades como matricula, color, modelo, potencia, etc.
- Terrestre: Esta es una clase intermedia que se utiliza para distinguir entre vehículos marinos y terrestres. Hereda de la clase Vehiculo y agrega una propiedad adicional nRuedas para representar el número de ruedas del vehículo terrestre.
- Conducible: Esta es una interfaz que define métodos comunes para los vehículos que pueden ser conducidos. Incluye métodos como conducir, avanzar, arrancar, parar, velocidad, etc.
- Camion: Esta clase hereda de Terrestre e implementa la interfaz Conducible. Representa un vehículo de tipo camión. Tiene una lista de velocidades (tacometro) que se utiliza para almacenar las velocidades registradas durante el trayecto.
- Principal: Esta clase contiene el método main y proporciona un menú interactivo para probar las funcionalidades de los diferentes tipos de vehículos.



### Uso
Para poder usarlo debemos importar el proyecto en algun IDE de tu eleccion y simplemente ejecutar la aplicación.
Una vez ejecutada saldra un pequeño menu con los vehiculos disponible. Una vez seleccionado el vehículo podremos realizar las diferentes acciones posibles como arrancar, parar, avanzar, calcular la velocidad y almacenarla.

### Caracteristicas
1. Clase **Vehiculo** (abstracta):
	- Es la clase padre que representa los vehículos en general.
	- Tiene atributos como matricula, color, modelo, potencia, entre otros.
	- Proporciona métodos comunes como constructor, arrancar, parar, avanzar y velocidad.

2. Clase **Terrestre** (hereda de Vehiculo):
	- Es una clase intermedia que representa vehículos terrestres.
	- Hereda los atributos y métodos de la clase Vehiculo.
	- Introduce el atributo nRuedas para indicar la cantidad de ruedas del vehículo terrestre.

3. Interfaz **Conducible**:
	- Define métodos comunes para los vehículos que se pueden conducir.
	- Incluye métodos como conducir, avanzar, arrancar, parar, velocidad y almacenarVelocidad.

4. Clase **Camion** (hereda de Terrestre e implementa Conducible):
	- Representa un vehículo de tipo camión.
	- Hereda los atributos y métodos de la clase Terrestre.
	- Implementa los métodos de la interfaz Conducible.
	- Introduce el atributo tacometro, una lista para almacenar las velocidades registradas durante el trayecto del camión.

5. Clase **Principal**:
	- Contiene el método main donde se ejecuta el programa principal.
	- Proporciona un menú interactivo para seleccionar diferentes tipos de vehículos y realizar acciones específicas para cada uno.
	- Utiliza las clases Camion, Moto, Coche y Barco para crear instancias de los vehículos y llamar a sus métodos correspondientes.

El código implementa una estructura de clases para representar vehículos y permite interactuar con ellos a través de métodos como arrancar, parar, avanzar, calcular velocidad, etc. También proporciona la funcionalidad para almacenar y mostrar las velocidades registradas durante el trayecto de los vehículos.

### Actualizaciones

+ 29-05-2023: 
	- Se documenta y genera el javadoc
	- Se modifican las clases moto,coche y barco para poder utilizarlas correctamente en el menu
	- Se modifica el menu, se crea un menu principal desde el que podemos elegir el vehiculo a usar y nos manda a otro menu desde el que realizamos las acciones 		del vehiculo y se modifican los case 2 de los submenus para evitar introducir letras:
````Java
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
````
 
	
````Java
case 2:
					// Avanzar el coche introduciendo los metros recorridos
					double metros = 0.0;
					System.out.println();
					System.out.println("Introduce los metros recorridos");
					if (scanner.hasNextDouble()) {
						metros = scanner.nextDouble();
						scanner.nextLine(); // Limpiar el búfer después de leer el número
						System.out.println();
						co.avanzar(metros);
					} else {
						System.out.println("Entrada inválida. Debes ingresar un número válido.");
						scanner.nextLine(); // Limpiar el búfer en caso de entrada no válida
					}
					break;
````







