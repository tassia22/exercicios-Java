package Enumeracao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalho {
	
	private String nome;
	private NivelTrabalho nivel;
	private double salarioBase;
	
	private Departamento departamento;
	private List<ContratoHrs> contratos = new ArrayList<>();
	
	public Trabalho() {
		
	}

	public Trabalho(String nome, NivelTrabalho nivel, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	public void addContrato(ContratoHrs contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(ContratoHrs contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar calendario = Calendar.getInstance();
		
		for(ContratoHrs c: contratos) {
			calendario.setTime(c.getData());
			int c_ano = calendario.get(Calendar.YEAR);
			int c_mes =	1 + calendario.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
				
			}
		}
		
		return soma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalho getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalho nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHrs> getContratos() {
		return contratos;
	}
}
