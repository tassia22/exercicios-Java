package Henranca;

public class Empregado extends Pessoa{
    protected int codSetor;
    protected double salarioBase;
    protected double imposto;

    public Empregado(String nome, String endereco, String telefone, int codSetor, double salarioBase, double imposto){
        super(nome, endereco, telefone);
        this.codSetor = codSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }
    public double calculaSalario(){
        return salarioBase - imposto;

    }

    public int getCodSetor() {
        return codSetor;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
