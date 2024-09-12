# Sistema de Biblioteca en Java - Práctica de POO

Este proyecto es un sistema sencillo de biblioteca diseñado para practicar los conceptos fundamentales de la Programación Orientada a Objetos (POO) en Java. El sistema permite gestionar una colección de libros físicos y digitales utilizando las principales características de la POO, como herencia, polimorfismo, interfaces y clases abstractas.

## Estructura del Proyecto

El proyecto está compuesto por varias clases que representan libros físicos, libros digitales y una biblioteca que gestiona ambos tipos de libros.

### Clases

1. **Book (abstract class)**: 
   - Representa un libro genérico con atributos comunes a todos los libros: título, autor y precio. 
   - Contiene un método abstracto `showInfo()` para mostrar la información de un libro, que es implementado por las clases hijas.
   
2. **PhysicalBook (extends Book)**: 
   - Representa un libro físico que además de los atributos de `Book` tiene un atributo adicional `weight` (peso en kilogramos). 
   - Implementa el método `showInfo()` para mostrar la información específica de un libro físico.
   
3. **DigitalBook (extends Book)**: 
   - Representa un libro digital con un atributo adicional `fileSize` (tamaño del archivo en megabytes). 
   - Implementa el método `showInfo()` para mostrar la información de un libro digital.

4. **Inventoriable (interface)**: 
   - Define los métodos esenciales para gestionar un inventario de libros: `add()`, `remove()` y `showAll()`.

5. **Library (implements Inventoriable)**: 
   - Clase que gestiona una colección de libros, permitiendo añadir, eliminar y mostrar todos los libros en su inventario.

### Ejecución

El archivo `Main.java` contiene el punto de entrada al programa. Se crean instancias de libros físicos y digitales y se añaden a una biblioteca. Finalmente, se muestra la información de todos los libros presentes en la biblioteca.

### Código de ejemplo en `Main.java`:

```java
public class Main {
    public static void main(String[]args){

        Library library = new Library();
        Book book1 = new PhysicalBook("The Hobbit", "J.R.R. Tolkien", 12.99, 0.5);
        Book book2 = new DigitalBook("The Lord of the Rings", "J.R.R. Tolkien", 29.99, 0.5);
        Book book3 = new PhysicalBook("Harry Potter", "J.K. Rowling", 29.99, 0.5);

        library.add(book1);
        library.add(book2);
        library.add(book3);

        library.showAll();
    }
}
```
### Conceptos de POO aplicados

- Herencia: Las clases PhysicalBook y DigitalBook heredan de la clase abstracta Book, compartiendo los atributos comunes a todos los libros.
- Polimorfismo: Se utiliza el polimorfismo cuando se añaden libros a la biblioteca, ya que tanto los libros físicos como los digitales son tratados como instancias de Book.
- Clases abstractas: La clase Book es abstracta y define el contrato para los libros sin necesidad de ser instanciada directamente.
- Interfaces: La interfaz Inventoriable asegura que cualquier clase que gestione inventarios de libros implemente los métodos necesarios para esa función.

<hr>

### Cómo ejecutar el proyecto

Asegúrate de tener instalado Java y un entorno de desarrollo como Visual Studio Code o IntelliJ IDEA.
Clona o descarga el código fuente.
Compila y ejecuta el archivo Main.java para ver el sistema en acción.

<hr>

### Contribución


Este proyecto es una práctica educativa de POO en Java. Cualquier sugerencia o mejora es bienvenida.

