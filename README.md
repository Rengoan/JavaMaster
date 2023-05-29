# Proyecto Vehiculos
## Tabla de contenidos
- [Descripción de las clases](#descripción)
- [Uso](#uso)
- [Caracteristicas](#caracteristicas)
- [Interfaz](#interfaz)

## Descripción de las clases
- Vehiculo: Esta es la clase base abstracta que representa un vehículo en general. Tiene propiedades como matricula, color, modelo, potencia, etc.
- Terrestre: Esta es una clase intermedia que se utiliza para distinguir entre vehículos marinos y terrestres. Hereda de la clase Vehiculo y agrega una propiedad adicional nRuedas para representar el número de ruedas del vehículo terrestre.
- Conducible: Esta es una interfaz que define métodos comunes para los vehículos que pueden ser conducidos. Incluye métodos como conducir, avanzar, arrancar, parar, velocidad, etc.
- Camion: Esta clase hereda de Terrestre e implementa la interfaz Conducible. Representa un vehículo de tipo camión. Tiene una lista de velocidades (tacometro) que se utiliza para almacenar las velocidades registradas durante el trayecto.
- Principal: Esta clase contiene el método main y proporciona un menú interactivo para probar las funcionalidades de los diferentes tipos de vehículos.

El código ofrece una forma modular y reutilizable de representar y trabajar con diferentes tipos de vehículos.

## Uso
Para poder usarlo debemos importar el proyecto en algun IDE de tu eleccion y simplemente ejecutar la aplicación.
Una vez ejecutada saldra un pequeño menu con los vehiculos disponible. Una vez seleccionado el vehículo podremos realizar las diferentes acciones posibles como arrancar, parar, avanzar, calcular la velocidad y almacenarla.

## Caracteristicas
1. Clase Vehiculo (abstracta):
	- Es la clase padre que representa los vehículos en general.
	- Tiene atributos como matricula, color, modelo, potencia, entre otros.
	- Proporciona métodos comunes como constructor, arrancar, parar, avanzar y velocidad.

2. Clase Terrestre (hereda de Vehiculo):
	- Es una clase intermedia que representa vehículos terrestres.
	- Hereda los atributos y métodos de la clase Vehiculo.
	- Introduce el atributo nRuedas para indicar la cantidad de ruedas del vehículo terrestre.

3. Interfaz Conducible:
	- Define métodos comunes para los vehículos que se pueden conducir.
	- Incluye métodos como conducir, avanzar, arrancar, parar, velocidad y almacenarVelocidad.

4. Clase Camion (hereda de Terrestre e implementa Conducible):
	- Representa un vehículo de tipo camión.
	- Hereda los atributos y métodos de la clase Terrestre.
	- Implementa los métodos de la interfaz Conducible.
	- Introduce el atributo tacometro, una lista para almacenar las velocidades registradas durante el trayecto del camión.

5. Clase Principal:
	- Contiene el método main donde se ejecuta el programa principal.
	- Proporciona un menú interactivo para seleccionar diferentes tipos de vehículos y realizar acciones específicas para cada uno.
	- Utiliza las clases Camion, Moto, Coche y Barco para crear instancias de los vehículos y llamar a sus métodos correspondientes.

En resumen, el código implementa una estructura de clases para representar vehículos y permite interactuar con ellos a través de métodos como arrancar, parar, avanzar, calcular velocidad, etc. También proporciona la funcionalidad para almacenar y mostrar las velocidades registradas durante el trayecto de los vehículos.



## Interfaz
En la interfaz tenemos la declaración de los siguientes metodos con los que vamos a trabajar con las clases hijas de Vehiculo

```java
	public void conducir(); // Metodo para decir que vehiculo esta conduciendo

	public void avanzar(double metros); // Se le pasan los metros que deseemos y si el vehiculo esta arrancado coge el
										// tiempo actual del sistema, despues se lo resta al tiempo inicial y nos dice
										// cuando hemos avanzado desde que arrancamos el vehiculo

	public void arrancar(); // Metodo utilizado para comprobar si un vehiculo esta arrancado. Si no lo esta
							// , empieza a correr el tiempo, si lo esta, te avisa que esta arrancado

	public void parar(); // Metodo utilizado para detener un vehiculo

	public double velocidad(); // Metodo utilizado para calcular la velocidad recorrida en el espacio y tiempo
	
	public void almacenarVelocidad(double velocidad); // Metodo al que le pasas un parametro y almacena las velocidades en un arrayList
  ```


