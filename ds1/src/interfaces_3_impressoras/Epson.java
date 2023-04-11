package interfaces_3_impressoras;

public class Epson implements Impressoras{

    @Override
    public void imprimir() {
        System.out.println("Impressora Epson");
        System.out.println("Iniciando a Impressão!");
        System.out.println("Impressão completa!");
    }
    
}
