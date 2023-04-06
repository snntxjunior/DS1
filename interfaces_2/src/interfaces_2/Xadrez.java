package interfaces_2;

public class Xadrez implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Iniciando o jogo de Xadrez");
        System.out.println("Mova uma peça");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o jogo de Xadrez");
    }
    
}
