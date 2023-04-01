package avaliacao.ds1;

public abstract class Juridica extends Pessoa{    

    protected String cnpj;
    protected String incricaoEstudal;

    public Juridica() {
    }

    public Juridica(String cnpj, String incricaoEstudal, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.incricaoEstudal = incricaoEstudal;
    }

    @Override
    public String toString() {
        return "CNPJ: " + this.cnpj +
                "Inscrição Estadual: " + this.incricaoEstudal +
                "\nID: " + super.id +
                "\nNome: " + super.nome +
                "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email +
                "\n\nEndereço\nLogradouro: " + super.endereco.logradouro +
                "\nNumero: " + super.endereco.numero +
                "\nComplemento: " + super.endereco.complemento +
                "\nCEP: " + super.endereco.cep +
                "\nCidade: " + super.endereco.cidade +
                "\nUF: " + super.endereco.uf.nome;
    }
    
    

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIncricaoEstudal() {
        return incricaoEstudal;
    }

    public void setIncricaoEstudal(String incricaoEstudal) {
        this.incricaoEstudal = incricaoEstudal;
    }
    
    

}
