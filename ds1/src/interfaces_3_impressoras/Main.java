package interfaces_3_impressoras;

public class Main {
    public static void main(String[] args) {
        ImpressoraLocal impressoraLocal = new ImpressoraLocal();
        
        impressoraLocal.ligar();
        impressoraLocal.imprimir(new Epson());
        impressoraLocal.desligar();
    }
    
}
