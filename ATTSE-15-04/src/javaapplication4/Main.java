package javaapplication4;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("000.000.000-00", "00.000.000-00", LocalDate.of(2005, Month.NOVEMBER, 24), 5248, 2500, "Carlinho do Grau", Genero.MASCULINO, 
                                   new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", "Bahia"));
        
        Juridica juridica1 = new Juridica("000.000.000/0001-00", "00000000", LocalDate.of(2025, Month.MARCH, 25), LocalDate.of(2022, Month.MARCH, 14), 25000000, 2500, "Carlinho do Grau", Genero.MASCULINO, 
                             new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", "Bahia"));
        
        System.out.println(juridica1.toString());
        
        System.out.println(funcionario1.toString());
        
    }
}
