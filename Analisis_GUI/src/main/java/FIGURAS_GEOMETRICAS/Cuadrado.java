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
