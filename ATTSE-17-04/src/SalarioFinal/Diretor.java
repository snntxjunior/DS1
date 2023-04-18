package SalarioFinal;

import java.time.LocalDate;

public class Diretor extends CargoDeConfiaca{
    
    private final double PARTICIPACAO_LUCRO = 0.1;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissão) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataAdmissão);
    }
    
    @Override
    public double getSalarioFinal() {
        double salarioFInal = 0;
        salarioFInal += this.salarioBase * PARTICIPACAO_LUCRO;
        salarioFInal += this.salarioBase * bonificacao.getValor();
        salarioFInal += this.salarioBase;
        return this.salarioBase;
    }
    
    
    
    @Override
    public String toString() {
        return "\n " + super.nome +
               "\n " + super.cpf +
               "\n " + super.rg +
               "\n " + super.genero.texto +
               "\n " + this.PARTICIPACAO_LUCRO +
               "\n " + Util.formatBrl(salarioBase) +
               "\n " + Util.formatBrl(getSalarioFinal(salarioBase)) +
               "\n " + Util.formatDate(dataAdmissão) +
               "\n " + super.bonificacao;
    }

    private double getSalarioFinal(double salarioBase) {
        double salarioFInal = 0;
        salarioFInal += this.salarioBase * PARTICIPACAO_LUCRO;
        salarioFInal += this.salarioBase * bonificacao.getValor();
        salarioFInal += this.salarioBase;
        return salarioFInal;
    }
}
