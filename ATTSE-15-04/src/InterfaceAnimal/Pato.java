package InterfaceAnimal;

public class Pato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Quaq Quaq Quaq Quaq Quaq Quaq Quaq Quaq");
        System.out.println("Quaqqqqq");
    }

    @Override
    public void comer() {
        System.out.println("Galo está comendo pãoo");
        System.out.println("Mas ele prefere insetos");
    }
    
}
