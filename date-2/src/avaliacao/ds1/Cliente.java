package avaliacao.ds1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente extends Fisica{
    
    private int protocoloAtendimento;

    public Cliente() {
    }

    public Cliente(int protocoloAtendimento, EstadoCivil estadoCivil, LocalDate dataNascimento, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(estadoCivil, dataNascimento, genero, id, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    
    @Override
    public String toString() {
        return "\nProtocolo: " + this.protocoloAtendimento +
                "\nID: " + super.id +
                "\nNome: " + super.nome +
                "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email +
                "\nNasc.: " + super.getDataNascimento() +
                "\nIDade: " +super.getIDade() +
                "\nEstado Civil: " + super.estadoCivil.texto +
                "\nGenero: " + super.genero.texto +
                "\nLogradouro: " + super.endereco.logradouro +
                "\nNumero: " + super.endereco.numero +
                "\nComplemento: " + super.endereco.complemento +
                "\nCEP: " + super.endereco.cep +
                "\nCidade: " + super.endereco.cidade +
                "\nUF: " + super.endereco.uf.nome;
    }
    
    

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    public String getDataNascimento() {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNascimento.format(formatar);
    }
    
}
