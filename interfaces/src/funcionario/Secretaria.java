package funcionario;

public class Secretaria extends Funcionario implements IAutenticavel{
    
    private double comissao;

    public Secretaria() {
    }

    public Secretaria(double comissao, String nome) {
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
