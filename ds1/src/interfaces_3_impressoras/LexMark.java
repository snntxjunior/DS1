package interfaces_3_impressoras;

public class LexMark implements Impressoras{

    @Override
    public void imprimir() {
        System.out.println("Impressora LexMark");
        System.out.println("Iniciando a Impressão!");
        System.out.println("Impressão completa!");
    }
    
}
