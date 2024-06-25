package ClassesEMetodoAbs;

public class Administrador extends Empregado {
	
	private double ajudaDeCusto;

	public Administrador(String nome, String endereco, String tel, int codSetor, double salarioBase, double imposto,
			double ajudaDeCusto) {
		super(nome, endereco, tel, codSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	@Override
	public double calculaSalario() {
		return (salarioBase - imposto + ajudaDeCusto);
		
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	

}
