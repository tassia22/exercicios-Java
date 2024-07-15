package Entites;

public class Conta {
	
	private Integer numConta;
	private String nome;
	private double valor;
	private double limiteRetirada;
	
	public Conta () {
		
	}
	
	public Conta(Integer numConta, String nome, double valor, double limiteRetirada) {
		this.numConta = numConta;
		this.nome = nome;
		this.valor = valor;
		this.limiteRetirada = limiteRetirada;
	}
	public void depositar(double qntd) {
		valor+=qntd;
	}
	
	public void saque(double qntd) throws Exception {
		validarRetirada(qntd);
		valor -= qntd;
		
	}
	
	public void validarRetirada(double qntd) throws Exception {
		if(limiteRetirada < qntd) {
			throw new Exception ("erro de saque: o valor excede o limite de saque"); 
		}
		if(valor < qntd) {
			throw new Exception ("erro de saque: saldo insuficiente"); 
		}
	}
	
	public Integer getNumConta() {
		return numConta;
	}
	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getLimiteRetirada() {
		return limiteRetirada;
	}
	public void setLimiteRetirada(double limiteRetirada) {
		this.limiteRetirada = limiteRetirada;
	}
	
	

}
