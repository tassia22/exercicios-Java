package Casting;

public class Cavalo extends Mamifero{
    private String raca;

    public Cavalo(int idade, int velocidade,String nome, float peso, int tipo, String raca){
        super(idade, velocidade, nome, peso, tipo);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
