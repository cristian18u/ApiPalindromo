# ApiPalindromo
Api rest usando el framework Spring boot implementando seguridad con JWT y database MySQL

https://apirest-service.herokuapp.com/

## Ejecutar aplicacion

correr en la terminal

mvn spring-boot:run

(Estando parado en la carpeta principal del proyecto).

## Ejecutar con Docker

ejecutar en la terminal

docker build -t palindromo .

luego

docker run -it -p 8080:8080 palindromo

## Documentacion Swagger

https://apirest-service.herokuapp.com/swagger-ui/index.html

para probrar la api primero hay que registrarse y luego iniciar sesion para generar el token.

o pueden iniciar sesion con el usuario
{
    "usernameOrEmail": "raul185",
    "password": "raul25"
}


