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

