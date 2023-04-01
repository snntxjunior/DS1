package avaliacao.ds1;

public class Fornecedor extends Juridica{
    
    private String produto;

    public Fornecedor() {
    }

    public Fornecedor(String produto, String cnpj, String incricaoEstudal, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, incricaoEstudal, id, nome, telefone, email, endereco);
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nProduto: " + this.produto +
                "\nCNPJ: " + super.cnpj +
                "\nInscrição Estadual: " + super.incricaoEstudal +
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
    
    

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    
    
}
