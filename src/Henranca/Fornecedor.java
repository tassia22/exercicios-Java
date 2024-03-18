package Henranca;

public class Fornecedor extends Pessoa{
    private double credito;
    private double divida;

    public Fornecedor(String nome, String endereco, String telefone, double credito, double divida){
        super(nome, endereco, telefone);
        this.credito = credito;
        this.divida = divida;
    }
    public double obterSaldo(){
        return credito - divida;

    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }
}
