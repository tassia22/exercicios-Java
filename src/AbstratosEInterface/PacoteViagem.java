package AbstratosEInterface;

public abstract class PacoteViagem {
    protected int hotel;
    protected int duracao;
    protected double diaria;

    public abstract double calculaPreco();

    public PacoteViagem(int hotel, int duracao, double diaria){
        this.hotel = hotel;
        this.duracao = duracao;
        this.diaria = diaria;
    }

    public int getHotel() {
        return hotel;
    }

    public void setHotel(int hotel) {
        this.hotel = hotel;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }
}
