package calculadora;

public class Soma implements OperacaoMatematica{

    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
    
}
