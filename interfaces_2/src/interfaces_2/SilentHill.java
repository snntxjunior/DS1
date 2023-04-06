package interfaces_2;

public class SilentHill implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Iniciando o jogo.");
        System.out.println("Carregando Mapa...");
        System.out.println("Comece sua aventura.");
    }

    @Override
    public void fechar() {
        System.out.println("Game Over...");
        System.out.println("Fechando partida...");
        System.out.println("Fechando conexão com servidor...");
    }
    
}
