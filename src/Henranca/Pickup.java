package Henranca;

public class Pickup extends Carro{
    private int capacidadeCarga;
    private int pesoCarga;

    public Pickup(int passageiros, int combustivel, double rendimento, boolean cambioAutomatico, int capacidadeCarga, int pesoCarga){
        super(passageiros, combustivel, rendimento, cambioAutomatico);
        this.capacidadeCarga = capacidadeCarga;
        this.pesoCarga = pesoCarga;

    }
    @Override
    public double autonomia(){
        double autonomia = 0.0;
        if (pesoCarga > capacidadeCarga){
            System.out.println("o peso de carga não pode ser maior que a capacidade");
        }
        if (pesoCarga == capacidadeCarga){
            autonomia = (combustivel * rendimento) / 2;
        }else if (pesoCarga < capacidadeCarga){
            autonomia = (combustivel * rendimento) / 0.25;
        }
        return autonomia;

    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
    }
}
