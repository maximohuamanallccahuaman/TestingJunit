# Buenas prácticas y estrátegias en JUnit

1. Creamos una clase `Usuario.java` el cual tendrá un campo de tipo string.

  ![Screenshot_1](https://user-images.githubusercontent.com/72884594/191290526-2dbd4635-7481-4c48-9aba-3b8bc722d51d.png)

2. Luego creamos otra clase llamada `Usuarios` en cual contendrá los métodos a usar en la demo como los son :
  . ArrayList
  . crear
  . borrar
  . obtener
 
 ![Screenshot_2](https://user-images.githubusercontent.com/72884594/191291475-3dc6e354-f610-48e5-9ee2-8a331673a52a.png)
 
## Testing 📖

3. Para inicar creamos una clase llamada `UsuariosTest` en la carpeta de test, ejemplo :

  ![Screenshot_3](https://user-images.githubusercontent.com/72884594/191293527-703401ad-f950-4b53-9340-ed8afb743e87.png)

  Explico que en la carpeta test hay 3 clases y es por que es uno es la secuencia de otro, `UsuariosTest` -> `UsuariosTest2` -> `UsuariosTest3`.
  
4. En la clase `UsuariosTest` testiamos los metodos crear, borrar y listar.

  ![Screenshot_4](https://user-images.githubusercontent.com/72884594/191300477-92382134-55a1-4a3c-a951-90956176931f.png)

  ![Screenshot_5](https://user-images.githubusercontent.com/72884594/191300675-1068a99c-792e-4206-a66f-26b6b1dbf643.png)

