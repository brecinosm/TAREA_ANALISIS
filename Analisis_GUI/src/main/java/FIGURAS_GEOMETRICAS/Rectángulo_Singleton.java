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
