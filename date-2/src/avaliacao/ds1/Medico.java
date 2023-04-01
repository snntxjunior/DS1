package avaliacao.ds1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Medico extends Funcionario{ 
    
    private String crm;

    public Medico() {
    }

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, estadoCivil, dataNascimento, genero, id, nome, telefone, email, endereco);
        this.crm = crm;
    }

       
        @Override
    public String toString() {
        return "\nCRM: " + this.crm +
                "\nID: " + super.id +
                "\nNome: " + super.nome +
                "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email +
                "\nNasc.: " + super.getDataNascimento() +
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

    public String getCrm() {
        return crm;
    }

    public void setOab(String crm) {
        this.crm = crm;
    }
    
    public String getDataNascimento() {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNascimento.format(formatar);
    }
    
}
