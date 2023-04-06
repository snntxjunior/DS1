package interfaces_2;

public class Rpg implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Iniciando o jogo.");
        System.out.println("Carregando Servidor...");
        System.out.println("Preparando Partida...");
        System.out.println("Escolha Seu Personagem.");
    }

    @Override
    public void fechar() {
        System.out.println("Game Over...");
        System.out.println("Fechando partida...");
        System.out.println("Fechando conexão com servidor...");
    }
    
}
