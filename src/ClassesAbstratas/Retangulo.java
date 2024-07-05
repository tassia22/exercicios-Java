package ClassesAbstratas;

public class Retangulo extends Forma{
	
	private double largura;
	private double altura;
	
	public Retangulo() {
		
	}
	
	
	public Retangulo(Cor cor, double largura, double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}


	@Override
	public double area() {
		return largura * altura;
	}


	public double getLargura() {
		return largura;
	}


	public void setLargura(double largura) {
		this.largura = largura;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
