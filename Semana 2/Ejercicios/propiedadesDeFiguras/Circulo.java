package propiedadesDeFiguras;

public class Circulo extends Figura{
    private double radio; 

    public Circulo(double radio){
        this.radio = radio;

    }
    
    @Override
    double area(){
        return Math.PI * radio * radio;
    }

    @Override
    double perimetro(){
        return 2 * Math.PI * radio;
    }

}
