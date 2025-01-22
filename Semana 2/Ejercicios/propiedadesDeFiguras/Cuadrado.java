package propiedadesDeFiguras;

public class Cuadrado extends Figura{
    private double lado; 

    public Cuadrado(double lado){
        this.lado = lado;

    }
    
    @Override
    double area(){
        return lado * lado;
    }

    @Override
    double perimetro(){
        return 4 * lado;
    }
}
