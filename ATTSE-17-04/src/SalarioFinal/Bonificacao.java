package SalarioFinal;

public enum Bonificacao {
    MOTOBOY(0.1),
    GERENTE(0.2),
    DIRETOR(0.4);

    protected double valor;

    private Bonificacao() {
    }

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    
}
