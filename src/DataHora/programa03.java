package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class programa03 {
	
	public static void main(String[] args){
		
		//convertendo data-hora global para local
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:15");
		//formato global
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		//convertendo o instant para uma data local considerando o fuso-horario do pc
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		
		//convertendo o LocalDateTime
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDate r4 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		//obtendo dados de uma data-hora local usando LocalDate
		System.out.println("d04 dia =" + d04.getDayOfMonth());
		System.out.println("d04 mes =" + d04.getMonthValue());
		System.out.println("d04 ano =" + d04.getYear());
		
		//obtendo dados de uma data-hora local usando LocalDateTime
		System.out.println("d05 hora =" + d05.getHour());
		System.out.println("d05 hora =" + d05.getMinute());
		
		
		
		
		
		
	}
}
