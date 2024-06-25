package ClassesEMetodoAbs;

public abstract class Empregado extends Pessoa{
	
	protected int codSetor;
	protected double salarioBase;
	protected double imposto;
	
	public abstract double calculaSalario();

	public Empregado(String nome, String endereco, String tel, int codSetor, double salarioBase, double imposto) {
		super(nome, endereco, tel);
		this.codSetor = codSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodSetor() {
		return codSetor;
	}

	public void setCodSetor(int codSetor) {
		this.codSetor = codSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	

}
