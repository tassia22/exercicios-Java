package ClassesAbstratas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
	
public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Contribuinte> lista = new ArrayList<>();
		
		System.out.print("entre com o numero de contribuintes para o pagamento: ");
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Contribuinte #"+ i+ ":");
			System.out.print("é uma pessoa fisica ou pessoa juridica? (f/j)");
			char rsp = scan.next().charAt(0);
			System.out.print("nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("renda anual: ");
			double rendaAnual = scan.nextDouble();
			if(rsp == 'f') {
				System.out.print("despesas na saude: ");
				double despesa = scan.nextDouble();
				Contribuinte pessoaF = new PessoaFisica(nome, rendaAnual, despesa);
				lista.add(pessoaF);
			}else {
				System.out.print("informe o numero de funcionarios: ");
				int num = scan.nextInt();
				Contribuinte pessoaJ = new PessoaJuridica(nome, rendaAnual, num);
				lista.add(pessoaJ);
			}		
			
		}
		double soma = 0.0;
		System.out.println();
		System.out.println("TAXA DE IMPOSTO: ");
		for(Contribuinte c: lista) {
			double tax = c.taxa();
			System.out.println(c.getNome() + ":$" + String.format("%.2f", tax));
			soma+=tax;
			
		}
		System.out.println();
		System.out.println("soma total do imposto: $" + String.format("%.2f", soma));
		
		
		
		
		
		scan.close();
	}

}
