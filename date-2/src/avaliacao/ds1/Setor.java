package avaliacao.ds1;

public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico");
    
    protected String nome;

    private Setor() {
    }

    private Setor(String nome) {
        this.nome = nome;
    }

    public static Setor getENGENHARIA() {
        return ENGENHARIA;
    }

    public String getNome() {
        return nome;
    }
    
    
}
