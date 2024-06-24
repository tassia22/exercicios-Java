package ClassesEMetodoAbs;

import java.util.Scanner;


public class Principal {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		CartaoWeb[] cartao = new CartaoWeb[3];
		
		do {
			System.out.println("escolha qual desses 3 cartoes deseja imprimir");
			System.out.println("1-dia dos namorados: ");
			System.out.println("2-natal: ");
			System.out.println("3-aniversario: ");
			
		
			switch(scan.nextInt()) {
				
			case 1: 
				System.out.println("destinatario: ");
				String destinatario = scan.nextLine();
				
				cartao[0] = new DiaDosNamorados(destinatario);
				System.out.println(cartao[0].showMessage());
				break;
			
			case 2 :
				System.out.println("destinatario: ");
				String des= scan.nextLine();
				
				cartao[1] = new Natal(des);
				System.out.println(cartao[0].showMessage());
				break;
		
			case 3:
				System.out.println("destinatario: ");
				String des03= scan.nextLine();
				
				cartao[1] = new Aniversario(des03);
				System.out.println(cartao[0].showMessage());
				break;
				
			default:
				System.out.println("opcao invalida");
				
				
				
			}
			
	
		
			
		}while(true);
		
	}


}
