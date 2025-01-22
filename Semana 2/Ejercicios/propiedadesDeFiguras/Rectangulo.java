package propiedadesDeFiguras;

public class Rectangulo extends Figura{
    private double base; 
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    double area(){
        return base * altura;
    }

    @Override
    double perimetro(){
        return 2 * (base + altura);
    }
}
