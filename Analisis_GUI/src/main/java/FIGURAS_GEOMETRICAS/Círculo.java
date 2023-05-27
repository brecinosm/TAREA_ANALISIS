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
