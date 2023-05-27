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
