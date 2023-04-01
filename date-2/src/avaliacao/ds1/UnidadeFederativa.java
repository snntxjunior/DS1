package avaliacao.ds1;

public enum UnidadeFederativa {
    
    ACRE("AC", "Acre"),
    ALAGOAS("AL", "Alagoas"),
    AMAPA("AP", "Amapá"),
    AMAZONAS("AM", "Amazonas"),
    BAHIA("BA", "BAHIA"),
    CEARA("CE", "Ceará"),
    DISTRITO_FEDERAL("DF", "Distrito Federal"),
    ESPÍRITO_SANTO("ES", "Espirito Santo"),
    GOIAS("GO", "Goiás"),
    MARANHAO("MA", "Maranhão"),
    MATO_GROSSO("MT", "Mato Grosso"),
    MATO_GROSSO_DO_SUL("MT", "Mato Grosso do Sul"),
    MINAS_GERAIS("MG", "Minas Gerais"),
    PARA("PA", "Para"),
    PARAIBA("PB", "Paraíba"),
    PARANA("PR", "Paraná"),
    PERNAMBUCO("PE", "Pernambuco"),
    PIAUI("PI", "Piauí"),
    RIO_GRANDE_DO_NORTE("RN", "Rio Grande do Norte"),
    RIO_GRANDE_DO_SUL("RS", "Rio Grande do Sul"),
    RONDONIA("RO", "Rondônia"),
    RORAIMA("RR", "Roraima"),
    SANTA_CATARINA("SC", "Santa Catarina"),
    SERGIPE("SE", "Sergipe"),
    TOCANTINS("TO", "Tocantins");
    
    protected String nome;
    protected String sigla;

    private UnidadeFederativa() {
    }

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    

}
