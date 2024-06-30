package Enumeracao;


public class PedidoItem {
	
	private Integer qntd;
	private double preco;
	private Produto produto;
	
	
	public PedidoItem() {
		
	}
	
	
	public PedidoItem(Integer qntd, double preco, Produto produto) {
		super();
		this.qntd = qntd;
		this.preco = preco;
		this.produto = produto;
	}


	public PedidoItem(Integer qntd) {
		this.qntd = qntd;
	
	}



	public double subTotal() {
		return preco*qntd;
	}
	
	@Override
	public String toString() {
		return getProduto().getNome() + ", $" + String.format("%.2f", preco) + qntd + ", subtotal $: "
				+ String.format("%.2f", subTotal());
	}


	public Integer getQntd() {
		return qntd;
	}


	public void setQntd(Integer qntd) {
		this.qntd = qntd;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}



	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	

}
