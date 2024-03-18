package Henranca;

public class Veiculo {
    protected int passageiros;
    protected int combustivel;
    protected double rendimento;

    public Veiculo(int passageiros, int combustivel, double rendimento){
        this.passageiros = passageiros;
        this.combustivel = combustivel;
        this.rendimento = rendimento;
    }
    public double autonomia(){
        return combustivel * rendimento;
    }


    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
