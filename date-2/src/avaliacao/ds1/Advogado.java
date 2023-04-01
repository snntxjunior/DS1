package avaliacao.ds1;

import java.time.LocalDate;

public class Advogado extends Funcionario{
    
    private String oab;

    public Advogado() {
    }

    public Advogado(String oab, String cpf, String rg, String matricula, Setor setor, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, estadoCivil, dataNascimento, genero, id, nome, telefone, email, endereco);
        this.oab = oab;
    }

    
    @Override
    public String toString() {
        return "\nOAB: " + this.oab +
                "\nID: " + super.id +
                "\nNome: " + super.nome +
                "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email +
                "\nNasc.: " + super.getDataNascimento() +
                "\nIDade: " +super.getIDade() +
                "\nEstado Civil: " + super.estadoCivil.texto +
                "\nGenero: " + super.genero.texto +
                "\nCPF: " + super.cpf +
                "\nRG: " + super.rg +
                "\nMatricula: " + super.matricula +
                "\nSetor: " + super.setor +
                "\nSalario: " + super.salario +
                "\nLogradouro: " + super.endereco.logradouro +
                "\nNumero: " + super.endereco.numero +
                "\nComplemento: " + super.endereco.complemento +
                "\nCEP: " + super.endereco.cep +
                "\nCidade: " + super.endereco.cidade +
                "\nUF: " + super.endereco.uf.sigla;
    }
    
    

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }
    
    
    
}
