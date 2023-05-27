# INTEGRANTES 


| Nombre | Carnet |
|--------|--------|
| Bryan Recinos  | 7690-19-18053|
| Estuardo Patzan | 7690-20-370|
| Kimberly Salazar  | 7690-20-3305 |

# INVESTIGACION 

## Patrones de diseño Abstract Factory Method

El patrón de diseño Abstract Factory Method (Método de Fábrica Abstracta) es un patrón de creación que proporciona una interfaz para crear familias de objetos relacionados sin especificar las clases concretas. Es una variante del patrón de diseño Factory Method (Método de Fábrica) y se utiliza cuando se necesita crear un conjunto de objetos interrelacionados. Resumen del proceso del patrón Abstract Factory Method: Se define una interfaz abstracta llamada "AbstractFactory" que declara los métodos para crear los objetos de la familia relacionada.
Se implementan las clases concretas que implementan la interfaz "AbstractFactory". Cada clase concreta es responsable de crear una familia específica de objetos.
Se definen las interfaces abstractas para los productos de la familia de objetos. Cada familia de objetos tendrá su propia interfaz abstracta. Se implementan las clases concretas que implementan las interfaces abstractas de los productos. Estas clases son las implementaciones reales de los objetos de la familia.
Se crea una clase cliente que utiliza la interfaz "AbstractFactory" para crear los objetos de la familia relacionada. El cliente solo interactúa con las interfaces abstractas, sin conocer las implementaciones concretas.
En tiempo de ejecución, se crea una instancia de la clase concreta que implementa la interfaz "AbstractFactory". Esto permite que el cliente cree objetos de la familia relacionada sin conocer las clases concretas específicas.
El patrón Abstract Factory Method promueve la flexibilidad y extensibilidad del código, ya que permite agregar nuevas familias de objetos sin modificar el código existente. Además, se adhiere al principio de diseño SOLID de la programación orientada a objetos al separar las responsabilidades y promover la dependencia de las abstracciones en lugar de las implementaciones concretas.
En resumen, el patrón Abstract Factory Method proporciona una forma de crear objetos de familias relacionadas sin acoplar el código a las clases concretas, brindando una mayor flexibilidad y modularidad al sistema.

## Singleton 

El patrón de diseño Singleton es un patrón de creación que garantiza que una clase solo tenga una instancia y proporciona un punto global de acceso a ella.
Resumen del patrón Singleton: La clase Singleton tiene un constructor privado, lo que significa que no se puede crear una instancia de la clase directamente desde fuera de la clase.
La clase Singleton proporciona un método estático llamado "getInstance()" que devuelve la única instancia de la clase.
Al llamar al método "getInstance()", la clase Singleton comprueba si ya se ha creado una instancia. Si la instancia ya existe, se devuelve; de lo contrario, se crea una nueva instancia y se devuelve.
La primera vez que se crea la instancia de la clase Singleton, se realiza una inicialización única y especializada si es necesario.
Todas las llamadas posteriores al método "getInstance()" devuelven la misma instancia previamente creada, evitando la creación de múltiples instancias.
El patrón Singleton se utiliza en situaciones en las que se requiere una única instancia de una clase en todo el sistema, como en casos de acceso a bases de datos, registros, caches o configuraciones. Al tener una única instancia, se asegura que los recursos sean compartidos y que no haya conflictos de concurrencia.
Es importante tener en cuenta que el patrón Singleton también puede presentar desventajas, como la dificultad para probar y la introducción de un acoplamiento fuerte en el código. Además, en entornos multihilo, se deben implementar mecanismos de sincronización para garantizar la consistencia y evitar problemas de concurrencia.
En resumen, el patrón Singleton permite tener una única instancia de una clase y proporciona un punto de acceso global a ella. Esto asegura que no se creen instancias adicionales y facilita el acceso a recursos compartidos en todo el sistema.

# CODIGO FUENTE DEL PROGRAMA

### CLASE MENU
```Java
package FIGURAS_GEOMETRICAS;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class Menu extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Menu.class.getResource("GUI_PROPIEDADES.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 775, 255);
        stage.setTitle("Tarea_Analisis");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
```
### CLASE FABRICA

```Java
package FIGURAS_GEOMETRICAS;
public class Fabrica {
    public static Figura construir(String tipo){
        switch (tipo){
            case "Triangulo":
                return new Triangulo();
            case "Cuadrado":
                return new Cuadrado();
            case "Rombo":
                return new Rombo();
            case "Trapecio":
                return new Trapecio();
            case "Círculo":
                return new Círculo();
            default:
                System.out.println("No existe la figura en la fabrica");
                return null;
        }
    }
}
```
### CLASE FIGURA

```Java
package FIGURAS_GEOMETRICAS;
public interface Figura {
    public int area();
    public int perimetro();
}
```

### CLASE FUNCIONES_GUI

```Java
package FIGURAS_GEOMETRICAS;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Funciones_GUI {
    public Button Perimetro_Triangulo;
    @FXML
    public Label label1;
    public Label label2;
    public Button Area_Triangulo;

    /*
    INSTANCIAS DE CADA FIGURA
     */
    Figura f1 = Fabrica.construir("Triangulo");
    Rectángulo_Singleton f2 = Rectángulo_Singleton.getInstance();
    Rectángulo_Singleton f3 = Rectángulo_Singleton.getInstance();
    Rectángulo_Singleton f4 = Rectángulo_Singleton.getInstance();
    Figura f5 = Fabrica.construir("Cuadrado");
    Figura f6 = Fabrica.construir("Rombo");
    Figura f7 = Fabrica.construir("Trapecio");
    Figura f8 = Fabrica.construir("Círculo");


/*
BOTONES DE CADA FIGURA AREA Y PERIMETRO
 */
    @FXML
    protected void BotonAreaTriangulo() { label1.setText("area del triangulo es : "+f1.area());
    }
    @FXML
    protected void BotonPerimetroTriangulo() {
        label2.setText("Perimetro del triangulo es : "+f1.perimetro());
    }


    @FXML
    protected void BotonAreaRectangulo() {
        label1.setText("area del rectangulo es : "+f3.area());
    }

    @FXML
    protected void BotonPerimetroRectangulo() {
        label2.setText("Perimetro del rectangulo es : "+f4.perimetro());
    }


    @FXML
    protected void BotonAreaCuadrado() {
        label1.setText("area del Cuadrado es : "+f5.area());
    }

    @FXML
    protected void BotonPerimetroCuadrado() {
        label2.setText("Perimetro del Cuadrado es : "+f5.perimetro());
    }

    @FXML
    protected void BotonAreaRombo() {
        label1.setText("area del Rombo es : "+f6.area());
    }

    @FXML
    protected void BotonPerimetroRombo() {
        label2.setText("Perimetro del Rombo es : "+f6.perimetro());
    }

    @FXML
    protected void BotonAreaTrapecio() {
        label1.setText("area del Trapecio es : "+f7.area());
    }

    @FXML
    protected void BotonPerimetroTrapecio() {
        label2.setText("Perimetro del Trapecio es : "+f7.perimetro());
    }
    @FXML
    protected void BotonAreaCirculo() {
        label1.setText("area del Circulo es : "+f8.area());
    }

    @FXML
    protected void BotonPerimetroCirculo() {
        label2.setText("Perimetro del Circulo es : "+f8.perimetro());
    }

    /*

    BOTONES PARA LIMPIAR Y SALIR DE LA GUI JAVAFX
     */
    @FXML
    protected void BotonLimpiar() {
        label1.setText("");
        label2.setText("");
    }
    @FXML
    protected void BotonSalir() {
    System.exit(0);
    }
}
```

### CLASE TRIANGULO 

```Java
package FIGURAS_GEOMETRICAS;
public class Triangulo implements Figura{
    @Override
    public int area() {
        int base =15;
        int altura = 20;
        int area_triangulo = (base*altura)/2;
        return area_triangulo;
    }
    @Override
    public int perimetro() {
        int a =15;
        int b = 20;
        int c = 10;
        int perimetro_triangulo = a+b+c;
        return perimetro_triangulo;
    }
}
```

### CLASE CUADRADO

```Java
package FIGURAS_GEOMETRICAS;
public class Cuadrado implements Figura{
    @Override
    public int area() {
        int lado =15;
        int area_cuadrado = lado*lado;
        return area_cuadrado;
    }
    @Override
    public int perimetro() {
        int lado =15;
        int perimetro_cuadrado = 4*lado;
        return perimetro_cuadrado;
    }
}
```

### CLASE ROMBO

```Java
package FIGURAS_GEOMETRICAS;
public class Rombo implements Figura{
    @Override
    public int area() {
        int diagonal_menor = 15;
        int diagonal_mayor = 10;
        int area_rombo = (diagonal_menor*diagonal_mayor)/2;
        return area_rombo;
    }
    @Override
    public int perimetro() {
        int a = 10;
        int perimetro_rombo = 4*a;
        return perimetro_rombo;
    }
}
```

### CLASE TRAPECIO

```Java
package FIGURAS_GEOMETRICAS;
public class Trapecio implements Figura{
    @Override
    public int area() {
        int base_Menor =10;
        int base_Mayor =20;
        int altura = 45;
        int area_Trapecio = (base_Mayor+base_Menor)/2*altura;
        return area_Trapecio;
    }
    @Override
    public int perimetro() {
        int a = 10;
        int b = 20;
        int c= 30;
        int d= 40;
        int perimetro_Trapecio = a+b+c+d;
        return perimetro_Trapecio;
    }
}
```

### CLASE CIRCULO

```Java
package FIGURAS_GEOMETRICAS;
public class Círculo implements Figura{
    @Override
    public int area() {
        int radio = 15;
        double area_circulo = Math.PI*Math.pow(radio,2);
        return (int) area_circulo;
    }
    @Override
    public int perimetro() {
        int radio = (int) 15;
        int perimetro_circulo = (int) (2*Math.PI*radio);
        return perimetro_circulo;
    }
}
```

### CLASE RECTANGULO

```Java
package FIGURAS_GEOMETRICAS;
public class Rectángulo_Singleton {
    public int area(){
        int base = 20;
        int altura = 50;
        int area_rectangulo = base*altura;
        System.out.println("Area de rectangulo es: "+ area_rectangulo);
        return area_rectangulo;
    }
    public int perimetro(){
        int base = 15;
        int altura = 10;
        int perimetro_rectangulo = 2*(altura+base);
        System.out.println("Perimetro de rectangulo es: "+perimetro_rectangulo);
        return perimetro_rectangulo;
    }
    private static Rectángulo_Singleton instance = new Rectángulo_Singleton();
    private Rectángulo_Singleton(){}
    public static Rectángulo_Singleton getInstance(){
        return instance;
    }
}
```

# FUNCIONAMIENTO DEL PROGRAMA IMAGENES

### INTERFAZ GRAFICA 

![Gui](interfazgrafica.png)

### RESULTADO AREA Y PERIMETRO

![Resultado](resultadoareayperimetro.png)

### LIMPIAR

![Limpiar](limpiar.png)

### SALIR

![Salir](salir.png)


# END