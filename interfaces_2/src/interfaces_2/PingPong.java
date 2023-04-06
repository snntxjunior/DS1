package interfaces_2;

public class PingPong implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Iniciando o jogo de Ping-Pong");
        System.out.println("Jogue uma bolinha...");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o jogo de Ping-Pong...");
    }
    
}
