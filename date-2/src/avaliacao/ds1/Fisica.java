package avaliacao.ds1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Fisica extends Pessoa{
    
    protected EstadoCivil estadoCivil;
    protected LocalDate dataNascimento;
    protected Genero genero;

    public Fisica() {
    }

    public Fisica(EstadoCivil estadoCivil, LocalDate dataNascimento, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public int getIDade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }
    
    public String getDataNascimento() {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNascimento.format(formatar);
    }
    
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
        
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
    
}
