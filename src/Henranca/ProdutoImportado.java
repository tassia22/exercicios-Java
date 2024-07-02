package Henranca;

public class ProdutoImportado extends Produto {
	
	private double imposto;
	
	public ProdutoImportado() {
		
	}

	public ProdutoImportado(String nome, double preco, double imposto) {
		super(nome, preco);
		this.imposto = imposto;
	}
	
	@Override
	public String etiquetaPreco() {
		return getNome() + "$" + String.format("%.2f", getPreco()) + "( imposto de: " + "$" + String.format("%.2f", imposto) + ")";
	}
	
	public double precoTotal() {
		return getPreco() * imposto;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
	
	

}
