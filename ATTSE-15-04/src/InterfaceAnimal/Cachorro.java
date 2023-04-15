package InterfaceAnimal;

public class Cachorro implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("AuuuAuuuAuuuAuuuAuuu");
    }

    @Override
    public void comer() {
        System.out.println("Cachorro Ração");
        System.out.println("O Cachorro está Comendo Ração");
    }
    
}
