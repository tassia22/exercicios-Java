package DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class programa04 {
	
	public static void main(String[] args){
		
		//calculos com data-hora
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:15");
		//formato global
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		//criando um LocalDate de uma semana antes
		LocalDate semanaAnteriorLocalDate = d04.minusDays(7);
		//criando um LocalDate de uma semana depois
		LocalDate proxSemanaLocalDate = d04.plusDays(7);
		
		System.out.println("semana anterior = "+semanaAnteriorLocalDate);
		System.out.println("proxima semana = "+proxSemanaLocalDate);
		
		//criando um LocalDateTIME de uma semana antes
		LocalDateTime semanaAnteriorLocalDateTime = d05.minusDays(7);
		//criando um LocalDate de uma semana depois
		LocalDateTime proxSemanaLocalDateTime = d05.plusDays(7);
		
		System.out.println("semana anterior = "+semanaAnteriorLocalDateTime);
		System.out.println("proxima semana = "+proxSemanaLocalDateTime);
		
		//criando um Instant de uma semana antes
		Instant semanaAnteriorInstant = d06.minus(7, ChronoUnit.DAYS);
		//criando um Instant de uma semana depois
		Instant proxSemanaInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("semana anteriorInstant = "+semanaAnteriorInstant);
		System.out.println("proxima semana Instant = "+proxSemanaInstant);
		
		//duracao de tempo
		Duration t1 = Duration.between(semanaAnteriorLocalDateTime , d05);
		Duration t2 = Duration.between(semanaAnteriorLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t3 = Duration.between(semanaAnteriorInstant, d06);
		Duration t4 = Duration.between(d06, semanaAnteriorInstant);
		
		System.out.println("t1 dias = "+t1.toDays());
		System.out.println("t2 dias = "+t2.toDays());
		System.out.println("t3 dias = "+t3.toDays());
		System.out.println("t4 dias = "+t4.toDays());
		
	}

}
