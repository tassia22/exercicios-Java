package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program01 {
	
	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH: mm: ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH: mm: ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//data com horario atual
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		//data de 1970
		Date x3 = new Date(0L);
		//criando uma data as 5 da manha do dia 1 de janeiro de 1970
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		
		
		Date y1 = sdf1.parse("26/06/2024");
		Date y2 = sdf2.parse("26/06/2024 15:30:22");
		Date y3 = Date.from(Instant.parse("2024-06-25T16:30:22Z"));
		
		
		System.out.println("x1 " + sdf2);
		System.out.println("x2 " + sdf2);
		System.out.println("x3 " + sdf2);
		System.out.println("x4 " + sdf2);
		System.out.println("y1 " + sdf2);
		System.out.println("y2 " + sdf2);
		System.out.println("y3 " + sdf2);
		System.out.println("------------------------");
		System.out.println("x1 " + sdf2.format(x1));
		System.out.println("x2 " + sdf2.format(x2));
		System.out.println("x3 " + sdf2.format(x3));
		System.out.println("x4 " + sdf2.format(x4));
		System.out.println("y1 " + sdf2.format(y1));
		System.out.println("y2 " + sdf2.format(y2));
		System.out.println("y3 " + sdf2.format(y3));
		System.out.println("------------------------");
		System.out.println("x1 " + sdf3.format(x1));
		System.out.println("x2 " + sdf3.format(x2));
		System.out.println("x3 " + sdf3.format(x3));
		System.out.println("x4 " + sdf3.format(x4));
		System.out.println("y1 " + sdf3.format(y1));
		System.out.println("y2 " + sdf3.format(y2));
		System.out.println("y3 " + sdf3.format(y3));
	}

}
