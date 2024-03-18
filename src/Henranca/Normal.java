package Henranca;

public class Normal extends Ingresso {
    private boolean pista;

    public Normal(double valor, boolean pista){
        super(valor);
        this.pista = pista;
    }
    @Override
    public double mostraValor(){
        double valorTotal = 0.0;

        if (pista){
            valorTotal = valor * 0.10;
        }
        return valorTotal;
    }

    public boolean getPista() {
        return pista;
    }

    public void setPista(boolean pista) {
        this.pista = pista;
    }

}
