package InterfaceAnimal;

public class Main {
    public static void main(String[] args) {
        
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal galo = new Galo();
        Animal pato = new Pato();
        
        cachorro.comer();
        cachorro.emitirSom();
        
        gato.comer();
        gato.emitirSom();
        
        galo.comer();
        galo.emitirSom();
        
        pato.emitirSom();
        pato.emitirSom();
        
    }
}
