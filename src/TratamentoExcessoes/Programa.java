package TratamentoExcessoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
	
	//pilha de chamadas de metodos (stack trace)
	
	public static void main(String [] args) {
		metodo1();
		
		System.out.println("fim do programa");
	}
	
	public static void metodo1() {
		metodo2();
		System.out.println("*****metodo2 start*****");
		System.out.println("*****metodo2 fim*****");
	}
	
	public static void metodo2() {
		System.out.println("*****metodo2 start*****");
		Scanner scan = new Scanner(System.in);
		try {
			String [] vetor = scan.nextLine().split(" ");
			int posicao = scan.nextInt();
			System.out.println(vetor[posicao]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("posicao invalida");
			//imprimir na tela o reastreamento do stack
			e.printStackTrace();
			scan.next();
			
		}
		catch(InputMismatchException e) {
			System.out.println("erro de input");
		}
	
		scan.close();
		System.out.println("*****metodo2 start*****");
	}
	
}
