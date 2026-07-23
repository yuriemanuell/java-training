import java.time.LocalDate;
import java.time.LocalTime;

/*
Enunciado:
Crie um programa que mostre a data e a hora atuais,
junto com o nome da cidade.
*/

public class HoraDataLocal {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();
        String local = "Manaus";

        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Local: " + local);
    }
}

/*
Exemplo de saída:
Data: 2026-07-23
Hora: 16:30:12.345678900
Local: Manaus
*/    
