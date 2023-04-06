package interfaces_2;

public class Main {
    public static void main(String[] args) {
        VideoGame console = new VideoGame();
        
        console.ligar();
        console.jogar(new Rpg());
        
        console.fechar();
        
    }
}
