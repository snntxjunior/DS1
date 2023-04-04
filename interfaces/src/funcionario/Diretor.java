package funcionario;

public class Diretor extends Funcionario{
    
    private double comissao;

    public Diretor() {
    }

    public Diretor(double comissao, String nome) {
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
