package ClassesEMetodoAbs;

public class Fornecedor extends Pessoa {
	
	private double credito;
	private double divida;
	
	public Fornecedor(String nome, String endereco, String tel, double credito, double divida) {
		super(nome, endereco, tel);
		this.credito = credito;
		this.divida = divida;
	}
	
	public double obterSaldo() {
		return divida=-credito;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public double getDivida() {
		return divida;
	}

	public void setDivida(double divida) {
		this.divida = divida;
	}
	
	
	
	

}
