package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entites.Conta;

public class Programa {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		System.out.println("insira os dados da conta");
		System.out.print("numero da conta: ");
		int num = scan.nextInt();
		System.out.print("titular: ");
		scan.nextLine();
		String nome = scan.nextLine();
		System.out.print("saldo inicial: ");
		double valor = scan.nextDouble();
		System.out.print("limite de saque: ");
		double limite = scan.nextDouble();
		
		
		
		Conta conta = new Conta(num, nome, valor, limite);
		
		System.out.println();
		System.out.print("insira o valor para saque: ");
		double qntd = scan.nextDouble();
		
		try {
			conta.saque(qntd);
			System.out.printf("novo saldo: %.3f%n ", conta.getValor());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		scan.close();
		
	}
	

}
