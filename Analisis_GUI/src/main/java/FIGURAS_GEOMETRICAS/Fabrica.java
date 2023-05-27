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
