package funcionario;

public class Motoboy extends Funcionario{
    
    private String placaDaMoto;

    public Motoboy() {
    }

    public Motoboy(String placaDaMoto, String nome) {
        super(nome);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }
    
    
}
