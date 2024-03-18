package AbstratosEInterface;

public class PortoSeguro extends PacoteViagem implements Nacional{
    int praia;

    public PortoSeguro(int hotel, int duracao, double diaria, int praia){
        super(hotel,duracao,diaria);
        this.praia = praia;
    }

    @Override
    public double calculaPreco(){
        double valorTotal = duracao * diaria;

        valorTotal+= hotel * (valorTotal * 0.05);
        valorTotal+= hotel * (valorTotal * 0.15);

        return valorTotal;

    }
    public double adicional(String tipo){
        double adiciona = 0.0;
        if (tipo == "AEREO"){
            adiciona = diaria * 0.80;

        }else{
            adiciona = diaria;
        }
        return adiciona;
    }

    public int getPraia() {
        return praia;
    }

    public void setPraia(int praia) {
        this.praia = praia;
    }
}
