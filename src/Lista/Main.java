package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List <Funcionario> lista = new ArrayList<>();
		
		System.out.print("quantos funcionarios voce ira registrar? ");
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("id: ");
			int id = scan.nextInt();
			while(hasId(lista, id)) {
				System.out.print("id nao identificado");
				id = scan.nextInt();
				
			}
			
			System.out.print("nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("salario: ");
			double salario = scan.nextDouble();
			lista.add(new Funcionario(id, nome, salario));
			
		}
		
		//atualizando salario do funcionario
		System.out.println();
		System.out.println("informe o id do salario que sera aumentado: ");
		int id = scan.nextInt();
		
		Funcionario emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("esse id nao exite ");
		}else {
			System.out.println("entre com a porcentagem ");
			double porcentagem = scan.nextDouble();
			emp.aumentoSalario(porcentagem);
		}
		
		//listando funcionario
		System.out.println();
		System.out.println("lista de funcionarios: ");
		for(Funcionario obj: lista) {
			System.out.println(obj);
		}
		
		
	scan.close();
	
	}
	
	public static boolean hasId(List<Funcionario> lista, int id) {
		Funcionario emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
