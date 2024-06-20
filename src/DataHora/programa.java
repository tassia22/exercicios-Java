package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class programa {
	
	public static void main(String[] args){
		
		//instanciando uma data de agora
		LocalDate d01 = LocalDate.now();
		System.out.println("d01 = "+d01.toString());
		
		//instanciando data e horario de agora
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("d02 = "+d02.toString());
		
		//data-hora GMT com o horario de londres
		Instant d03 = Instant.now();
		System.out.println("d03 = "+d03.toString());
		
		//texto ISO 8601 e gerar uma data-hora
		LocalDate d04 = LocalDate.parse("2024-06-20");
		System.out.println("d04 = "+d04.toString());
		
		LocalDateTime d05 = LocalDateTime.parse("2024-06-20T01:30:26");
		System.out.println("d05 = "+d05.toString());
		
		Instant d06 = Instant.parse("2024-06-20T01:30:26Z");
		System.out.println("d06 = "+d06.toString());
		//instanciando no horario de sao paulo
		Instant d07 = Instant.parse("2024-06-20T01:30:26-03:00");
		System.out.println("d07 = "+d07.toString());
		
		//texto no formato customizado
		LocalDate d08 = LocalDate.parse("20/07/2022");
		System.out.println("d08 = "+d08.toString());
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d09 = LocalDate.parse("20/06/2024", fmt1);
		System.out.println("d09 = "+d09.toString());
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d10 = LocalDateTime.parse("20/06/2024 01:30", fmt2);
		System.out.println("d10 = "+d10.toString());
		
		//passando dia-mes-ano isolados
		LocalDate d11 = LocalDate.of(2024, 6, 20);
		System.out.println("d11 = "+d11.toString());
		
		LocalDateTime d12 = LocalDateTime.of(2024, 6, 20, 1, 30);

		
		
	}
}
