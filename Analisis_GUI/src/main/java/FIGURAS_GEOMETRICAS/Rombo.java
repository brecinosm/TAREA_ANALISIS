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
