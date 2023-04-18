package SalarioFinal;

import java.time.LocalDate;

public class Gerente extends CargoDeConfiaca{

    public Gerente() {
    }

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissão) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataAdmissão);
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += this.salarioBase * bonificacao.getValor();
        salarioFinal += this.salarioBase;
        
        return salarioFinal;
    }
    
    @Override
    public String toString() {
        return "\n " + super.nome +
               "\n " + super.cpf +
               "\n " + super.rg +
               "\n " + super.genero.texto +
               "\n " + Util.formatBrl(salarioBase) +
               "\n " + Util.formatBrl(getSalarioFinal(salarioBase)) +
               "\n " + Util.formatDate(dataAdmissão) +
               "\n " + super.bonificacao;
    }

    private double getSalarioFinal(double salarioBase) {
        double salarioFinal = 0;
        salarioFinal += this.salarioBase * bonificacao.getValor();
        salarioFinal += this.salarioBase;
        
        return salarioFinal;
    }

    
    
    
    
}
