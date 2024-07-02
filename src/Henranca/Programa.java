package Henranca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List <Produto> lista = new ArrayList<>();
		
		System.out.print("informe a quantidade de produtos: ");
		int n = scan.nextInt();
		
		for( int i = 1; i <= n; i++) {
			System.out.println("produto #" + i + ":");
			System.out.println("produto usado, importado ou comum (c/u/i)?");
			char rsp = scan.next().charAt(0);
			System.out.print("nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("preco: ");
			double preco = scan.nextDouble();
			
			if(rsp == 'i' ) {
				System.out.print("valor da importacao: ");
				double importacao = scan.nextDouble();
				
				Produto produto = new ProdutoImportado(nome, preco, importacao);
				lista.add(produto);
			}else if(rsp == 'u') {
				System.out.print("data de fabricacao (DD/MM/YYYY):");
				Date data = sdf.parse(scan.next());
				
				Produto produto = new ProdutoUsado(nome, preco, data);
				lista.add(produto);
			}else {
				Produto produto = new Produto(nome, preco);
				lista.add(produto);
			}
			
		}
		
		System.out.println();
		System.out.println("TABELA DE PRECOS: ");
		for(Produto p: lista) {
			System.out.println(p.etiquetaPreco());
		}
		
		
		
		scan.close();
	}

}
