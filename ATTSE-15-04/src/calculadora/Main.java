package calculadora;

public class Main {
    public static void main(String[] args) {
        
    OperacaoMatematica soma = new Soma();
    OperacaoMatematica subtracao = new Subtracao();
    OperacaoMatematica multiplcacao = new Multiplicacao();
    OperacaoMatematica divisao = new Divisao();
    
    double a = 14;
    double b = 7;
    
        System.out.println(soma.calcular(a, b));
        System.out.println(subtracao.calcular(a, b));
        System.out.println(multiplcacao.calcular(a, b));
        System.out.println(divisao.calcular(a, b));
        
    }       
    
}
