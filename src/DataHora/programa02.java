package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class programa02 {
	
	public static void main(String[] args){
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
	
		//convertendo data-hora para texto
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:15");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
	
		//formatando LocalDate
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//formatando LocalDateTime
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//formatando no formato ISO(Instant)
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
				//formatando LocalDate
		System.out.println("d04 = "+ d04.format(fmt1));
		System.out.println("d04 = "+ fmt1.format(d06));
		System.out.println("d04 = "+ d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		//formatando LocalDateTime
		System.out.println("d05 = "+ d05.format(fmt1));
		System.out.println("d05 = "+ d05.format(fmt2));
		
		//formatando no formato ISO(Instant)
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d05 = "+ d05.format(fmt4));
		System.out.println("d06 = " + fmt5.format(d06));
		
		
	}

}
