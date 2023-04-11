package interfaces_3_impressoras;

public class Hp implements Impressoras{

    @Override
    public void imprimir() {
        System.out.println("Iniciando a Impressão!");
        System.out.println("Impressão completa!");
    }
    
}
