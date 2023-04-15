package InterfaceAnimal;

public class Gato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miauuuuuuuuuuuuu");
        System.out.println("Miuaaa Karalho");
    }

    @Override
    public void comer() {
        System.out.println("Gato come Ração");
        System.out.println("O Gato está comendo a ração");
    }
    
}
