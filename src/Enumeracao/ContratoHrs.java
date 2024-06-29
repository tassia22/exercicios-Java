package Enumeracao;

import java.util.Date;

public class ContratoHrs {
	
	private Date data;
	private double valorPorHr;
	private int horas;
	
	public ContratoHrs() {
		
	}

	public ContratoHrs(Date data, double valorPorHr, int horas) {
		this.data = data;
		this.valorPorHr = valorPorHr;
		this.horas = horas;
	}
	
	public double valorTotal() {
		return valorPorHr* horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorPorHr() {
		return valorPorHr;
	}

	public void setValorPorHr(double valorPorHr) {
		this.valorPorHr = valorPorHr;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	
	
	

}
