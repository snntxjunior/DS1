package avaliacao.ds1;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
        //Juridica juridica1 = new Juridica("000.000.000/0001-00", "0000000", 5478, "Junior", "00 00000-0000", "teste@gmail.com", 
        //                     new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
                
        //System.out.println(juridica1.toString());
        
        //Cliente cliente1 = new Cliente(000000000000, 25, Genero.FEMININO, 458741, "Gisele", "00 00000-0000", "teste@gmail.com", 
        //                  new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
        
        //System.out.println(cliente1.toString());
        
        //Advogado advogado1 = new Advogado("0000000", "000.000.000-00", "00.000.000-00", "000000", Setor.JURIDICO, 2700, 25, Genero.FEMININO, 481646, "Jessica", "00 00000-0000 ", "teste@gmail.com", 
        //                     new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
     
        
        //System.out.println(advogado1.toString());
        
        //Medico medico1 = new Medico("0000000", "000.000.000-00", "00.000.000-00", "000000", Setor.SAUDE, 2700, 25, Genero.FEMININO, 481646, "Jessica", "00 00000-0000 ", "teste@gmail.com", 
        //                     new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
        
        //System.out.println(medico1.toString());
        
        //Engenheiro engenheiro1 = new Engenheiro("0000000", "000.000.000-00", "00.000.000-00", "000000", Setor.ENGENHARIA, 2700, 25, Genero.FEMININO, 481646, "Jessica", "00 00000-0000 ", "teste@gmail.com", 
        //                     new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
        
        
        //System.out.println(engenheiro1.toString());
        
        Advogado advogado2 = new Advogado("0000000", "000.000.000-00", "00.000.000-00", "000000", Setor.JURIDICO, 2700, EstadoCivil.CASADO, LocalDate.of(1974, Month.MARCH, 6), Genero.FEMININO, 481646, "Jessica", "00 00000-0000 ", "teste@gmail.com", 
                             new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
        
        Medico medico1 = new Medico("0000000", "000.000.000-00", "00.000.000-00", "000000", Setor.SAUDE, 2700, EstadoCivil.SEPARADO, LocalDate.of(1974, Month.MARCH, 6), Genero.FEMININO, 481646, "Jessica", "00 00000-0000 ", "teste@gmail.com", 
                         new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
        
        Engenheiro engenheiro1 = new Engenheiro("0000000", "000.000.000-00", "00.000.000-00", "000000", Setor.ENGENHARIA, 2700, EstadoCivil.SOLTEIRO, LocalDate.of(1974, Month.MARCH, 6), Genero.FEMININO, 481646, "Jessica", "00 00000-0000 ", "teste@gmail.com", 
                                 new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
                
        Cliente cliente1 = new Cliente(181646, EstadoCivil.VIUVO, LocalDate.of(1974, Month.MARCH, 6), Genero.FEMININO, 458741, "Gisele", "00 00000-0000", "teste@gmail.com", 
                           new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
        
        
        System.out.println(advogado2.toString());
        
        System.out.println(medico1.toString());
        
        System.out.println(engenheiro1.toString());
        
        System.out.println(cliente1.toString());
        
        
              
        PrestacaoServico prestacaoServico1 = new PrestacaoServico(LocalDate.of(2015, Month.DECEMBER, 1), LocalDate.of(2026, Month.DECEMBER, 1), "000.000.000/0001-00", "0000000", 5478, "Junior", "00 00000-0000", "teste@gmail.com", 
                                             new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
        
        Fornecedor fornecedor1 = new Fornecedor("Escova Modeladora", "000.000.000/0001-00", "0000000", 5478, "Junior", "00 00000-0000", "teste@gmail.com", 
                                 new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(prestacaoServico1.toString());
        
        System.out.println(fornecedor1.toString());
    }
}
