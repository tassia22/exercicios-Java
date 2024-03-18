package Henranca;

public class Ingresso {
    protected double valor;

    public Ingresso(double valor){
        this.valor = valor;
    }
    public double mostraValor(){
        return valor;

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
