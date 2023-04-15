package InterfaceAnimal;

public class Galo implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Coricooooooooooooo");
        System.out.println("Acordemmmm");
    }

    @Override
    public void comer() {
        System.out.println("Galo está Milho");
        System.out.println("Whickas e melhor");
    }
    
}
