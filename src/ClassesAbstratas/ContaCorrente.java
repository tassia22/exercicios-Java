package ClassesAbstratas;

public class ContaCorrente extends Conta{
	
	private double limiteEmp;

	public ContaCorrente(int numero, String nome, double saldo, double limiteEmp) {
		super(numero, nome, saldo);
		this.limiteEmp = limiteEmp;
	}
	
	public void limite(double valor) {
		if(valor <= limiteEmp) {
			setSaldo(getSaldo() + (valor - 10.0));
		}
	}

	public double getLimiteEmp() {
		return limiteEmp;
	}

	public void setLimiteEmp(double limiteEmp) {
		this.limiteEmp = limiteEmp;
	}
	
	

}
