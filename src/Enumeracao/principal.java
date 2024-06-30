package Enumeracao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class principal {
	

	public static void main(String [] args) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com os dados do cliente: ");
		System.out.print("nome: ");
		String nome = scan.nextLine();
		System.out.print("email: ");
		String email = scan.nextLine();
		System.out.print("data de aniversario (DD/MM/YYYY): ");
		Date dataNiver = sdf.parse(scan.next());
		
		Cliente cliente = new Cliente(nome, email, dataNiver);
		
		System.out.println("insira os dados do pedido: ");
		System.out.print("status: ");
		StatusPedido02 status = StatusPedido02.valueOf(scan.next());
		
		Pedido02 pedido = new Pedido02(new Date(), status, cliente);
		
		System.out.print("quantos itens para esse pedido? ");
		int n = scan.nextInt();
		
		for(int i = 1; i <=n; i++) {
			System.out.println("insira os dados do #"+ i +"item: ");
			System.out.print("nome do produto: ");
			scan.nextLine();
			String nomeProduto = scan.nextLine();
			System.out.print("preco do produto: ");
			double precoProduto = scan.nextDouble();
			System.out.print("quantidade: ");
			Integer qntd = scan.nextInt();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			PedidoItem itemPedido = new PedidoItem(qntd, precoProduto, produto);
			
			pedido.addItem(itemPedido);
		}
		
		System.out.println();
		System.out.println(pedido);
		
		
		
		scan.close();
		
		
	}

}
