package Henranca;

public class Motocicleta extends Veiculo{
    private int cilindrada;

    public Motocicleta(int passageiros, int combustivel, double rendimento, int cilindrada){
        super(passageiros, combustivel, rendimento);
        this.cilindrada = cilindrada;
    }
    @Override
    public double autonomia(){
        return (combustivel * rendimento) / passageiros;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
