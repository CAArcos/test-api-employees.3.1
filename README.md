Solución punto 3 prueba api restful employees

1. Instalar Docker
2. Instalar Docker compose
3. Abrir terminal desde la ruta: ..test-api-employees.3.1/Docker/mysql ---Donde se encuentra el archivo docker-compose.yml
4. Ejecutar el comando docker-compose up
5. Conectarse a la base de datos test_db desde mysql -- las credenciales de la conexión se encuentra el archivo docker-compose.yml
6. ejecutar el script que se encuentra en la ruta: ..test-api-employees.3.1/script/employee.sql
7. Ejecutar el employee-api.jar ubicado en la ruta: ../test-api-employees.3.1/target
8. Ejecutar desde un navegador api rest lanzar peticiones a las siguientes urls:
 - http://localhost:8080/api/empleados/guardar
  tipo post ejemplo:
  {
        "fullname": "Juan Perez",
        "id_boss": null
  }
  {
    "fullname": "Andres Hernandez",
    "id_boss": 1
  }
 -http://localhost:8080/api/empleados/modificar
  tipo put ejemplo:
  {
    "id": 2,
    "fullname": "Andres Hernandez Gonzales",
    "id_boss": 1
  }
 -http://localhost:8080/api/empleados/eliminar/2
  tipo delete