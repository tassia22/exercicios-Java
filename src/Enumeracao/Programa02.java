package Enumeracao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa02 {
	
	public static void main(String [] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("viagem maravilhosa!");
		Comentario c2 = new Comentario("nossa! isso foi incrivel");
		Post p1 = new Post(sdf.parse("26/06/2024"), "viagem em new york", "vou visitar essa cidade maravilhosa", 20 );
		
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println(p1);
	
	}

}
