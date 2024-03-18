package Henranca;

public class Hatch extends Carro{
    private int bagageiro;

    public Hatch(int passageiros, int combustivel, double rendimento, boolean cambioAutomatico, int bagageiro){
        super(passageiros, combustivel, rendimento, cambioAutomatico);
        this.bagageiro = bagageiro;

    }
    @Override
    public double autonomia(){
        return combustivel * rendimento;

    }
    public double calculaVolume(int litros){
        double volumeBagageiro = 0.0;
        if (passageiros < 3){
            volumeBagageiro = litros * 100;
        }else if(passageiros == 3){
            volumeBagageiro = litros * 0.50;

        }else{
            volumeBagageiro = litros;

        }
        return volumeBagageiro;
    }

    public int getBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(int bagageiro) {
        this.bagageiro = bagageiro;
    }
}
