package avaliacao.ds1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Engenheiro extends Funcionario{
    
    private String crea;

    public Engenheiro() {
    }

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, estadoCivil, dataNascimento, genero, id, nome, telefone, email, endereco);
        this.crea = crea;
    }

    
    
        @Override
    public String toString() {
        return "\nCREA: " + this.crea +
                "\nID: " + super.id +
                "\nNome: " + super.nome +
                "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email +
                "\nNasc.: " + super.getDataNascimento() +
                "\nIDade: " +super.getIDade() +
                "\nEstado Civil: " + super.estadoCivil +
                "\nGenero: " + super.genero +
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

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    
    public String getDataNascimento() {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNascimento.format(formatar);
    }
    
}
