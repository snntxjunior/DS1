package avaliacao.ds1;

import java.time.LocalDate;

public class PrestacaoServico extends Juridica{
    
    private LocalDate contratoInicio;
    private LocalDate contratoFim;

    public PrestacaoServico() {
    }

    public PrestacaoServico(LocalDate contratoInicio, LocalDate contratoFim, String cnpj, String incricaoEstudal, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, incricaoEstudal, id, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    @Override
    public String toString() {
        return "\nInicio do Contrato: " + this.contratoInicio +
                "\nFim do Contrato: " + this.contratoFim +
                "\nCNPJ: " + super.cnpj +
                "\nIncrisção Estadual: " + super.incricaoEstudal +
                "\nID: " + super.id +
                "\nNome: " + super.nome +
                "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email +
                "\nLogradouro: " + super.endereco.logradouro +
                "\nNumero: " + super.endereco.numero +
                "\nComplemento: " + super.endereco.complemento +
                "\nCEP: " + super.endereco.cep +
                "\nCidade: " + super.endereco.cidade +
                "\nUF: " + super.endereco.uf.sigla;
    }

    
    
    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }
    
    
    
}
