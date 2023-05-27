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
