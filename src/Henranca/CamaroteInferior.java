package Henranca;

public class CamaroteInferior extends Vip{
    private String localizacao;

    public CamaroteInferior(double valor, double adicional, String localizacao){
        super( valor,adicional);
        this.localizacao = localizacao;
    }
    @Override
    public double mostraValor(){
        double valorTotal = 0.0;
        if(localizacao == " lateral"){
            valorTotal = (valor + getAdicional()) * 0.20;
        }else{
            valorTotal = (valor + getAdicional()) * 0.35;
        }
        return valorTotal;

    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
