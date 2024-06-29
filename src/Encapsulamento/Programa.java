package Encapsulamento;

import java.util.Date;

import Enumeracao.Pedido;
import Enumeracao.StatusPedido;

public class Programa {
	
	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(1820, new Date(), StatusPedido.PAGAMENTO_PENDENTE);
		
		System.out.println(pedido);	
	
	}
	
	
	
	

}
