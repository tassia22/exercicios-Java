package Enumeracao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	public static void main(String [] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("entre com o nome do departamento: ");
		String departamentoNome = scan.nextLine();
		System.out.println("dados do trabalhador: ");
		System.out.print("nome: ");
		String trabalhoNome = scan.nextLine();
		System.out.print("nivel: ");
		String trabalhoNivel = scan.nextLine();
		System.out.print("salario base: ");
		double salarioBase = scan.nextDouble();
		
		Trabalho trabalho = new Trabalho(trabalhoNome, NivelTrabalho.valueOf(trabalhoNivel), salarioBase, new Departamento(departamentoNome));
		
		System.out.print("quantos contratos esse trabalhor vai ter?: ");
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("entre com o contrato #"+ i + "data:");
			System.out.print("(DD/MM/YYYY):");
			Date contratoData = sdf.parse(scan.next());
			System.out.print("valor por hora: ");
			double valorHora = scan.nextDouble();
			System.out.print("duracao de contrato por hora: ");
			int horas = scan.nextInt();
			
			ContratoHrs contrato = new ContratoHrs(contratoData, valorHora, horas);
			trabalho.addContrato(contrato);
		}
		
		System.out.println();
		System.out.print("entre com o mes e o ano para calcular o salario MM/YYYY: ");
		String mesEAno = scan.next();
		int mes = Integer.parseInt(mesEAno.substring(0,2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("nome: "+ trabalho.getNome());
		System.out.println("departamento: "+ trabalho.getDepartamento().getNome());
		System.out.println("renda de " +mesEAno + ":" + String.format("%.2f", trabalho.renda(ano, mes)));
		
		
		
		scan.close();
	}

}
