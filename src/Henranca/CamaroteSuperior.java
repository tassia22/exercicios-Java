package Henranca;

public class CamaroteSuperior extends Vip{
    private char classe;

    public CamaroteSuperior(double valor, double adicional, char classe){
        super(valor, adicional);
        this.classe = classe;

    }
    @Override
   public double mostraValor(){
        double valorTotal = 0.0;
        if (classe == 'B'){
            valorTotal = (valor + getAdicional()) * 0.50;

        }else{
            valorTotal = (valor + getAdicional()) * 0.75;
        }
        return valorTotal;

    }
    public char getClasse() {
        return classe;
    }

    public void setClasse(char classe) {
        this.classe = classe;
    }
}
