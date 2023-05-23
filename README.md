# JavaMaster
## Tabla de contenidos
- [Descripción](#descripción)
- [Uso](#uso)
- [Caracteristicas](#caracteristicas)

## Descripción<a id="descripción"></a>
Este proyecto consta de 3 paquetes, es.java.interfaces,es.java.vehiculo y es.java.vehiculo.principal.
En el paquete es.java.interfaces tenemos una interfaz donde declaramos todos los metodos comunes.
En el paquete es.java.vehiculo tenemos una clase padre llamada Vehiculo del que salen 2 clases mas, Marino y Terrestre que heredan de Vehiculo.
Terrestre y Marino sirven para separar por categoria los vehiculos con sus caracteristicas propias.
Coche,camion... hereda de Terrestre y Barco de marino.
En cada clase implementamos los metodos declarados en la interfaz del paquete es.java.interfaces
En el paquete es.java.vehiculo.principal es donde se encuentra nuestra clase main y se encuentra un pequeño menu para llamar a los diferentes metodos de cada clase.
Su utilidad es muy sencilla, se trata de simular las acciones de un vehiculo, arrancar, parar, avanzar, calcular la velocidad y almacenarla cada vez que que el 
vehiculo avance.

## Uso<a id="uso"></a>
Para poder usarlo debemos importar el proyecto en algun IDE de tu eleccion y simplemente ejecutar la aplicación.
Una vez ejecutada saldra un pequeño menu con las acciones del vehiculo, arrancar, parar, avanzar, calcular la velocidad y almacenarla.

## Caracteristicas<a id="caracteristicas"></a>
- Herencia de clases
- Interfaz
- Poliformismo

