package Henranca;

public class Carro extends Veiculo{
    protected boolean cambioAutomatico;

    public Carro(int passageiros, int combustivel, double rendimento, boolean cambioAutomatico){
        super(passageiros, combustivel, rendimento);
        this.cambioAutomatico = cambioAutomatico;
    }
    @Override
    public double autonomia(){
        double autonomia = 0.0;
        if (cambioAutomatico){
            autonomia = (combustivel * rendimento) - 0.10;
        }
        return autonomia;

    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }
}
