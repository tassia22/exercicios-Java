package ClassesAbstratas;

public abstract class Forma {
	
	private Cor cor;

	public Cor getCor() {
		return cor;
	}
	
	public Forma() {
		
	}

	public Forma(Cor cor) {
		this.cor = cor;
	}



	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public abstract double area();
	

}
