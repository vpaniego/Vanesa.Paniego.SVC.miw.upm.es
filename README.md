# Vanesa.Paniego.SVC.miw.upm.es
> Este proyecto pretende desarrollar un ejemplo de práctica para control de versiones.


### Crear un proyecto Maven llamado: nombre.apellido.SVC.miw.upm.es, versión 1.0.0
El nivel de log será debug
Subirlo a un repositorio remoto de Git
Conectarlo con Travis-CI con lanzamiento de test de forma automática

Se pretende desarrollar un proyecto software, y se han definido un conjunto de características.

Todos los métodos, devuelve un tipo String con el nombre del propio método.
Se debe realizar un commit al finalizar la programación de la clase (por creación o modificación), indicando en el mensaje del commit el nombre de la clase creada.

Para fusionar con la clase develop, se debe superar todos los test

### issue#01
* Crear la clase C11 (con los métodos m1() y m2())
* Crear la clase C12 (con el método mA())
* Crear la clase C11Test
* Crear la clase C12Test

### issue#02
* Crear la clase C21 (con los métodos m1() y m2())
* Crear la clase C22 (con el método mA())
* Crear la clase C21Test
* Crear la clase C22Test

### issue#03
* Crear la clase C31 (con los métodos m1() y m2())
* Crear la clase C32 (con el método mA())
* Crear la clase C31Test
* Crear la clase C32Test

### release-1.0
* Añadir los métodos m3() a C21 y mB() a C31
* Generar el jar y crear un Tag

### issue#04
* Cambiar en el pom, a la versión 1.1.0

### issue#05
* Crear la clase C51 (con los métodos m1() y m2())
* Crear la clase C52 (con el método mA())
* Crear la clase C51Test
* Crear la clase C52Test

La secuencia en el tiempo de las clases creadas o modificadas con sus commits es:
* C11
* C21
* C21Test
* C22
* C22Test
* C11Test
* C31
* C12
* C31Test
* C12Test
* C32
* C32Test
* C21(m3())
* Cambiar pom: 1.1.0
* C51
* C51Test
* C31(mB())
* terminar Release.1.0
* C52
* C11(error en m1()) en la release liberada)
* C52Test


> ##### [Máster en Ingeniería Web por la Universidad Politécnica de Madrid (miw-upm)](http://miw.etsisi.upm.es)
> ##### Asignatura: *Ingeniería Web: Visión General*

### Estado del código

[![Build Status](https://travis-ci.org/miw-upm/IWVG-forge.svg?branch=develop)](https://travis-ci.org/miw-upm/IWVG-forge)

![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=es.upm.miw%3AIWVG-forge&metric=alert_status)


### Tecnologías necesarias
* Java
* Maven
* GitHub
* Travis-ci
* Sonarcloud
