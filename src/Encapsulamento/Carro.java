package Encapsulamento;

public class Carro {
    private double combustivel;
    private double quilometragem;

    public Carro(double combustivel){
        this.combustivel = combustivel;
        this.quilometragem = 0.0;

    }
    public void percorrerDistancia(int distancia){
     double aux;
        if (combustivel >= quilometragem){
         aux = (quilometragem + distancia) - combustivel;
        }
    }

    public void abastecer(double litros){
        combustivel+= litros;

    }
    public double autonomia(){
        return combustivel * 12;

    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
}
