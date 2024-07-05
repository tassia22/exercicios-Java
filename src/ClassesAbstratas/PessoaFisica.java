package ClassesAbstratas;

public class PessoaFisica extends Contribuinte {
	
	private double despesaSaude;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, double rendaAnual, double despesaSaude) {
		super(nome, rendaAnual);
		this.despesaSaude = despesaSaude;
	}
	
	@Override
	public double taxa() {
		
		if(getRendaAnual() < 20000.00) {
			return (getRendaAnual() * 0.15) - (despesaSaude * 0.50) ;
			
		}else {
			return (getRendaAnual() * 0.25) -  (despesaSaude * 0.50);
			
		}
		
	}

	public double getDespesaSaude() {
		return despesaSaude;
	}

	public void setDespesaSaude(double despesaSaude) {
		this.despesaSaude = despesaSaude;
	}
	
	
	
	

}
