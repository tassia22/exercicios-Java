package ClassesEMetodoAbs;

public class Vendedor extends Empregado {
	
	private double totalDeVendas;
	private double comissao;
	
	
	
	public Vendedor(String nome, String endereco, String tel, int codSetor, double salarioBase, double imposto,
			double totalDeVendas, double comissao) {
		super(nome, endereco, tel, codSetor, salarioBase, imposto);
		this.totalDeVendas = totalDeVendas;
		this.comissao = comissao;
	}



	@Override
	public double calculaSalario() {
		return (salarioBase + imposto + totalDeVendas * comissao);
	}
	
	



	public double getTotalDeVendas() {
		return totalDeVendas;
	}



	public void setTotalDeVendas(double totalDeVendas) {
		this.totalDeVendas = totalDeVendas;
	}



	public double getComissao() {
		return comissao;
	}



	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	

}
