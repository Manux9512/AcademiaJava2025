package propiedadesDeFiguras;

public class TestPropiedadesDeFiguras {
    public static void main(String[] args) {
        Figura rectanguloPrueba = new Rectangulo(12, 10);
        System.out.println("Area del rectangulo: " + rectanguloPrueba.area() + " Perimetro del rectangulo: " + rectanguloPrueba.perimetro());
    
        Figura cuadradoPrueba = new Cuadrado(5);
        System.out.println("Area del cuadrado: " + cuadradoPrueba.area() + " Perimetro del cuadrado: " + cuadradoPrueba.perimetro());

        Figura circuloPrueba = new Circulo(3);
        System.out.println("Area del circulo: " + circuloPrueba.area() + " Perimetro del circulo: " + circuloPrueba.perimetro());
    }
}
