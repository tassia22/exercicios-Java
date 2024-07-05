package ClassesAbstratas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Forma> lista = new ArrayList<>();
		
		System.out.print("entre com o numero das formulas");
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("dados # " + i + ": ");
			System.out.print("retangulo ou circulo (r/c)?: ");
			char rsp = scan.next().charAt(0);
			System.out.print("cor (PRETO/AZUL/VERDE): ");
			Cor cor = Cor.valueOf(scan.next());
			
			if(rsp =='r') {
				System.out.print("largura: ");
				double largura = scan.nextDouble();
				System.out.print("altura: ");
				double altura = scan.nextDouble();
				lista.add(new Retangulo(cor, largura, altura));
			}else {
				System.out.print("raio: ");
				double raio = scan.nextDouble();
				lista.add(new Circulo(cor, raio));
			}
			
		}
		
		System.out.println();
		System.out.println("areas da forma");
		for(Forma forma: lista) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		
		scan.close();
	}

}
