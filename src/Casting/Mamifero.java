package Casting;

public class Mamifero extends Animal{
    protected int idade;
    protected  int velocidade;

    public Mamifero(int idade, int velocidade,String nome, float peso, int tipo){
        super(nome, peso, tipo);
        this.idade = idade;
        this.velocidade = velocidade;
    }
    public float correr(){
        float distancia = 0;
        distancia = (float) (velocidade * (100 - idade)) / 100;

        return distancia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
