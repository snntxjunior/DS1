package sobrecarga;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sobrecarga {
    public String saveFile(String name) {
        return name + ".doc";
    }
    
    public String saveFile(String name, LocalDate date) {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("-dd-MM-yyyy");
        
        return name + date.format(formatar) + ".doc";
    }
}
