package funcionario;

public class Main {
    public static void main(String[] args) {
        
        Motoboy motoboy = new Motoboy("0A0A0A24", "Jubiscleido da Silva");
        Gerente gerente = new Gerente(0.1, "Hudson");
        Secretaria secretaria = new Secretaria(0.1, "Caio");
        Diretor diretor = new Diretor(0.1, "Zudson");
        
        // Acesso ao Sistema.
        
        if (gerente instanceof IAutenticavel) {
            System.out.println("Acesso Autorizado!");
        } else {
            System.out.println("Acesso Negado!");
        }
        
        if (motoboy instanceof IAutenticavel) {
            System.out.println("Acesso Autorizado!");
        } else {
            System.out.println("Acesso Negado!");
        }
        
        if (secretaria instanceof IAutenticavel) {
            System.out.println("Acesso Autorizado!");
        } else {
            System.out.println("Acesso Negado!");
        }
        
        if (diretor instanceof IAutenticavel) {
            System.out.println("Acesso Autorizado!");
        } else {
            System.out.println("Acesso Negado!");
        }
    }
}
