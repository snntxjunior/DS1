package funcionario;

public class Gerente extends Funcionario implements IAutenticavel{
    private double comissao;

    public Gerente() {
    }

    public Gerente(double comissao, String nome) {
        super(nome);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
}
