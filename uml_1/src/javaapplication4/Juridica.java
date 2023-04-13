package javaapplication4;

import java.time.LocalDate;

public class Juridica extends Pessoa{
    
    private String cnpj;
    private String inscricaoEstadual;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double valorContratado;

    public Juridica() {
    }

    public Juridica(String cnpj, String inscricaoEstadual, LocalDate dataInicio, LocalDate dataTermino, double valorContratado, int id, String nome, Genero genero, Endereco endereco) {
        super(id, nome, genero, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorContratado = valorContratado;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getCalorContratado() {
        return valorContratado;
    }

    public void setCalorContratado(double calorContratado) {
        this.valorContratado = calorContratado;
    }
    
    
    
}
