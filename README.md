# JavaMaster
## Tabla de contenidos
- [Descripción](#descripción)
- [Uso](#uso)
- [Caracteristicas](#caracteristicas)
- [Interfaz](#interfaz)

## Descripción
Este proyecto consta de 3 paquetes, es.java.interfaces,es.java.vehiculo y es.java.vehiculo.principal.
En el paquete es.java.interfaces tenemos una interfaz donde declaramos todos los metodos comunes.
En el paquete es.java.vehiculo tenemos una clase padre llamada Vehiculo del que salen 2 clases mas, Marino y Terrestre que heredan de Vehiculo.
Terrestre y Marino sirven para separar por categoria los vehiculos con sus caracteristicas propias.
Coche,camion... hereda de Terrestre y Barco de marino.
En cada clase implementamos los metodos declarados en la interfaz del paquete es.java.interfaces
En el paquete es.java.vehiculo.principal es donde se encuentra nuestra clase main y se encuentra un pequeño menu para llamar a los diferentes metodos de cada clase.
Su utilidad es muy sencilla, se trata de simular las acciones de un vehiculo, arrancar, parar, avanzar, calcular la velocidad y almacenarla cada vez que que el 
vehiculo avance.

## Uso
Para poder usarlo debemos importar el proyecto en algun IDE de tu eleccion y simplemente ejecutar la aplicación.
Una vez ejecutada saldra un pequeño menu con las acciones del vehiculo, arrancar, parar, avanzar, calcular la velocidad y almacenarla.

## Caracteristicas
- Herencia de clases
- Interfaz
- Poliformismo


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


