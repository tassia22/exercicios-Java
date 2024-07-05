package ClassesAbstratas;

public class PessoaJuridica extends Contribuinte {
	
	private int numFuncionarios;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome, double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}
	
	@Override
	public double taxa() {
		if(numFuncionarios <= 10) {
			return getRendaAnual() * 0.14;
			
		}else {
			return getRendaAnual() * 0.16;
		}
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	
	
	
	
}
