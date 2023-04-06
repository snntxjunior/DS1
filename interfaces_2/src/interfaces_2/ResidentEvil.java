package interfaces_2;

public class ResidentEvil implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Iniciando o jogo.");
        System.out.println("Carregando Mapa...");
        System.out.println("Preparando a vila espanhola...");
        System.out.println("Comece sua jornada.");
    }

    @Override
    public void fechar() {
        System.out.println("Game Over...");
        System.out.println("Você morreu!");
        System.out.println("Salvando mapa...");
        System.out.println("Jogo Fechado...");
    }
    
}
