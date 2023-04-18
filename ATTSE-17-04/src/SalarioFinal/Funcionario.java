package SalarioFinal;

import java.time.LocalDate;

public abstract class Funcionario {
    
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Genero genero;
    protected double salarioBase;
    protected LocalDate dataAdmissão;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissão) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.salarioBase = salarioBase;
        this.dataAdmissão = dataAdmissão;
    }
    
    public abstract double getSalarioFinal();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getDataAdmissão() {
        return dataAdmissão;
    }

    public void setDataAdmissão(LocalDate dataAdmissão) {
        this.dataAdmissão = dataAdmissão;
    }
    
    
}

