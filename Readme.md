📚 ReadPoint – Sistema de Biblioteca

1. Descripción del proyecto

ReadPoint es un sistema de gestión de biblioteca desarrollado en Java con Spring Boot. Permite administrar libros, registrar lectores y controlar los préstamos y devoluciones mediante una base de datos.

2. Tecnologías utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* GitHub

3. Estructura del proyecto

El proyecto está organizado en los siguientes paquetes:

* Model: contiene Libro.java, Lector.java y Prestamo.java.
* Repository: permite realizar operaciones con la base de datos.
* Service: contiene la lógica del sistema.
* Controller: recibe las solicitudes del Frontend.

4. Entidades JPA

El sistema cuenta con tres entidades:

* Libro: almacena título, autor, género y cantidad.
* Lector: almacena nombre, apellido, documento y correo.
* Prestamo: registra fechas, estado, lector y libro.

Se utilizan anotaciones como @Entity, @Table, @Id, @GeneratedValue, @Column, @ManyToOne y @JoinColumn para conectar las clases con las tablas de la base de datos.

5. Configuración de la base de datos

Crear una base de datos llamada readpoint en MySQL y configurar el archivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/readpoint
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASEÑA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080

Reemplazar los datos de usuario y contraseña por las credenciales propias.

6. Integración con el Frontend

El Frontend podrá conectarse al Backend mediante una API REST.

Los controladores permitirán realizar las siguientes operaciones:

* LibroController: registrar y consultar libros.
* LectorController: registrar y consultar lectores.
* PrestamoController: registrar préstamos y devoluciones.

El Frontend podrá desarrollarse con HTML, CSS y JavaScript o React.

7. Integración conceptual y análisis de datos

ReadPoint conecta el Frontend, el Backend y la base de datos.

El Frontend permite al usuario interactuar con el sistema, el Backend procesa las solicitudes y la base de datos almacena la información.

El análisis de datos permite responder preguntas como:

* ¿Cuántos libros hay registrados?
* ¿Cuáles son los libros más solicitados?
* ¿Cuántos préstamos se han realizado?
* ¿Cuántos libros están pendientes de devolución?

Esta información ayuda a mejorar la organización y administración de la biblioteca.

8. Repositorio GitHub

El proyecto se almacenará en GitHub para mantener un control de versiones y compartir el código.

Enlace del repositorio: Pegar aquí el enlace de GitHub.

9. Conclusión

ReadPoint busca facilitar la administración de una biblioteca mediante herramientas tecnológicas. Permite organizar libros, lectores y préstamos, mejorando el almacenamiento de información y facilitando su consulta.

ReadPoint: un espacio donde cada libro encuentra un lector.