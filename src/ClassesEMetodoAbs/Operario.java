package ClassesEMetodoAbs;

public class Operario extends Empregado{
	
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, String tel, int codSetor, double salarioBase, double imposto,
			double valorProducao, double comissao) {
		super(nome, endereco, tel, codSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	@Override
	public double calculaSalario() {
		return (salarioBase - imposto + valorProducao * comissao);
	
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	
	
	
	

}
