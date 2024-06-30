package Enumeracao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido02 {
	
	private  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date momento;
	private StatusPedido02 status;
	private Cliente clientes;
	
	private List<PedidoItem> item = new ArrayList<>();
	
	public Pedido02() {
		
	}
	
	
	public Pedido02(Date momento, StatusPedido02 status, Cliente clientes) {
		super();
		this.momento = momento;
		this.status = status;
		this.clientes = clientes;
	}


	public void addItem(PedidoItem itens) {
		item.add(itens);
	}
	
	public void removeItem(PedidoItem itens) {
		item.remove(itens);
	}
	
	public double total() {	
		double soma = 0.0;
		for(PedidoItem it: item) {
			soma = soma + it.subTotal();
		}
		
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("status do pedido: ");
		sb.append(status + "\n");
		sb.append("cliente: ");
		sb.append(clientes + "\n");
		sb.append("itens do pedido: \n");
		for(PedidoItem itens : item) {
			sb.append(itens + "\n");
		}
		
		sb.append("preco total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido02 getStatus() {
		return status;
	}

	public void setStatus(StatusPedido02 status) {
		this.status = status;
	}


	public Cliente getClientes() {
		return clientes;
	}


	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}
	
}
