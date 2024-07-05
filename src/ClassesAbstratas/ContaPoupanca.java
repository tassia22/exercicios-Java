package ClassesAbstratas;

public class ContaPoupanca extends Conta{
	
	private double taxaJuros;

	public ContaPoupanca(int numero, String nome, double saldo, double taxaJuros) {
		super(numero, nome, saldo);
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizaSaldo() {
		setSaldo(getSaldo() * taxaJuros);
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	
	
	
	
	

}
