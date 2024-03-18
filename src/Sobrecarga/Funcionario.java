package Sobrecarga;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private int tempoDeServico;

    public Funcionario(String nome, double salarioBase, int tempoDeServico){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.tempoDeServico = tempoDeServico;
    }

    public double mostraSalario(){

        if (tempoDeServico <= 10){
           return  0.12 * salarioBase;

        }else{
            return  0.17 * salarioBase;
        }



    }
    public double mostraSalario(double totalDeVendas){

        if(tempoDeServico <= 10){
            return salarioBase * 0.05 + 0.015 * totalDeVendas;

        }else{
            return salarioBase * 0.10 + 0.2 * totalDeVendas;

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getTempoDeServico() {
        return tempoDeServico;
    }

    public void setTempoDeServico(int tempoDeServico) {
        this.tempoDeServico = tempoDeServico;
    }
}
