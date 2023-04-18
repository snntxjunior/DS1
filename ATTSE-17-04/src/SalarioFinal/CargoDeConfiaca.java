package SalarioFinal;

import java.time.LocalDate;

public abstract class CargoDeConfiaca extends Funcionario{
    
    protected Bonificacao bonificacao;

    public CargoDeConfiaca() {
    }

    public CargoDeConfiaca(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissão) {
        super(nome, cpf, rg, genero, salarioBase, dataAdmissão);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    
    
}
