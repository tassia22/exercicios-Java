package Vetores;

public class Produto {
	private int codigo;
	private String descricao;
	private double preco;
	private int qntd;
	

	public Produto(int codigo, String descricao, double preco, int qntd) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.qntd = qntd;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQntd() {
		return qntd;
	}
	public void setQntd(int qntd) {
		this.qntd = qntd;
	}
	
	
}