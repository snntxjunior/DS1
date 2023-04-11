package interfaces_3_impressoras;

public class ImpressoraLocal {
    private Impressoras impressoras;
    
    public void ligar(){
        System.out.println("Inicializando Impressora");
        System.out.println("Carregando...");
        System.out.println("");
    }
    
    public void instalar(Impressoras impressoras){
        this.impressoras = impressoras;
        System.out.println("Instalando impressora " + impressoras.getClass().getSimpleName());
        System.out.println("");
    }
        
    public void imprimir(Impressoras impressoras){
        impressoras.imprimir();
    }
    
    public void desligar(){
        System.out.println("Encerrendo...");
        System.out.println("Impressora Desligada com sucesso!");
    }
    
}
