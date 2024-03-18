package AbstratosEInterface;

public class CaldasNovas extends PacoteViagem implements Nacional{
    private boolean parque;

    public CaldasNovas(int hotel, int duracao, double diaria, boolean parque){
        super(hotel, duracao, diaria);
        this.parque = parque;
    }
    @Override
    public double calculaPreco(){
        double valorTotal = duracao * diaria;
        valorTotal+= valorTotal *(hotel * 0.10);
        if(parque){
            valorTotal = valorTotal + 200.00;
        }
        return valorTotal;

    }
    public double adicional(String tipo){
        double adicional = 0.0;
        if(tipo == "INDIVIDUAL"){
            adicional = diaria * 0.50;
        }else{
            adicional = diaria - 0.10;
        }
        return adicional;
    }

    public boolean getParque() {
        return parque;
    }

    public void setParque(boolean parque) {
        this.parque = parque;
    }
}
