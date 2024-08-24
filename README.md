# Caso de prueba para desarrollador

El siguiente proyecto implementa un API REST para consultar información de compras realizadas por los usuarios (Inmobiliarias) filtradas por fecha de realización.
Para ello se diseñó el siguiente modelo de base de datos:

![Screenshot 2024-08-23 at 10 07 46 PM](https://github.com/user-attachments/assets/f2d1b683-0d19-4741-8e24-b7fde7c2af57)

La capa API Rest esta construido usando el framework de Spring Boot. Por facilidad, se usó H2 Database ya que permite construir una base de datos temporal capaz de usar 
operaciones CRUD.

El archivo *LoadDatabase* permite insertar datos de prueba automáticamente al iniciar la aplicación. Esto permite verificar fácilmente que todo esté funcionando.

Finalmente las rutas: 
```
http://localhost:8080/api/purchases
http://localhost:8080/filter
http://localhost:8080/api/users
http://localhost:8080/api/categories
```
Traen la información correspondientes a los gastos de las compras y usuarios creados en el proyecto.
