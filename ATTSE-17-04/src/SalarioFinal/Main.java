package SalarioFinal;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
        Motoboy motoboy1 = new Motoboy("OKZ-4658", "Elisan", "000.000.000-00", "00.000.000-00", Genero.MASCULINO, 700, LocalDate.of(2021, Month.JULY, 25));
        
        System.out.println(motoboy1.toString());
        System.out.println("\n");
        
        
        Gerente gerente1 = new Gerente(Bonificacao.GERENTE, "Carlos", "000.000.000-00", "00.000.000-00", Genero.MASCULINO, 2500, LocalDate.of(2016, Month.JUNE, 16));
        
        System.out.println(gerente1.toString());
        System.out.println("\n");
        
        Diretor diretor1 = new Diretor(Bonificacao.DIRETOR, "Rafaela", "000.000.000-00", "00.000.000-00", Genero.FEMININO, 5000, LocalDate.of(2014, Month.MARCH, 25));
        
        System.out.println(diretor1.toString());
        
    }
    
}
