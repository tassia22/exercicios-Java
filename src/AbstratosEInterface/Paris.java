package AbstratosEInterface;

public class Paris extends PacoteViagem implements Internacional{
    private String interesse;

    public Paris(int hotel, int duracao, double diaria, String interesse){
        super(hotel, duracao, diaria);
        this.interesse = interesse;
    }



    public double cambio(double moeda){
        return calculaPreco() / moeda;

    }

    @Override
    public double calculaPreco(){
        double valorTotal = duracao * diaria;
        valorTotal+= valorTotal * (hotel * 0.10);
        if(interesse == "FERIAS"){
            valorTotal+= valorTotal - 0.10;
        }else{
            valorTotal+= valorTotal - diaria;
        }
        return valorTotal;
    }

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }
}
