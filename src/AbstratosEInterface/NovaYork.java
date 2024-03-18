package AbstratosEInterface;

public class NovaYork extends PacoteViagem implements Internacional{
    private String tipo;

    public NovaYork(int hotel, int duracao, double diaria, String tipo){
        super(hotel, duracao, diaria);
        this.tipo = tipo;
    }

    public double cambio(double moeda){
        return calculaPreco() / moeda;
    }

    @Override
    public double calculaPreco(){
        double valorTotal = duracao * diaria;
        valorTotal+= valorTotal * (hotel * 0.10);
        if(tipo == "COMPLETO"){
            valorTotal = valorTotal * diaria;
        }
        return valorTotal;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
