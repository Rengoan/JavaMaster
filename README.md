# Proyecto Vehiculos
## Tabla de contenidos
- [Descripción](#descripción)
- [Uso](#uso)
- [Caracteristicas](#caracteristicas)
- [Actualizaciones](#actualizaciones)

## Descripción
El código ofrece una forma modular y reutilizable de representar y trabajar con diferentes tipos de vehículos.

- Vehiculo: Esta es la clase base abstracta que representa un vehículo en general. Tiene propiedades como matricula, color, modelo, potencia, etc.
- Terrestre: Esta es una clase intermedia que se utiliza para distinguir entre vehículos marinos y terrestres. Hereda de la clase Vehiculo y agrega una propiedad adicional nRuedas para representar el número de ruedas del vehículo terrestre.
- Conducible: Esta es una interfaz que define métodos comunes para los vehículos que pueden ser conducidos. Incluye métodos como conducir, avanzar, arrancar, parar, velocidad, etc.
- Camion: Esta clase hereda de Terrestre e implementa la interfaz Conducible. Representa un vehículo de tipo camión. Tiene una lista de velocidades (tacometro) que se utiliza para almacenar las velocidades registradas durante el trayecto.
- Principal: Esta clase contiene el método main y proporciona un menú interactivo para probar las funcionalidades de los diferentes tipos de vehículos.



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

El código implementa una estructura de clases para representar vehículos y permite interactuar con ellos a través de métodos como arrancar, parar, avanzar, calcular velocidad, etc. También proporciona la funcionalidad para almacenar y mostrar las velocidades registradas durante el trayecto de los vehículos.

## Actualizaciones

- 29-05-2023: 
	- Se modifica el menu, se crea un menu principal desde el que podemos elegir el vehiculo a usar y nos manda a otro menu desde el que realizamos las acciones 		del vehiculo. 
	- Se documenta y genera el javadoc
	- Se modifican las clases moto,coche y barco para poder utilizarlas correctamente en el menu







