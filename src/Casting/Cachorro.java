package Casting;

public class Cachorro extends Mamifero{
    private float altura;

    public Cachorro(int idade, int velocidade,String nome, float peso, int tipo, float altura){
        super(idade, velocidade, nome, peso, tipo);
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public float correr(){
        float distancia = 0;
        if (peso <= 4){
            distancia = velocidade * (peso/altura);
        }else{
            distancia = velocidade * (peso/(altura+20));
        }
        return distancia;

    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
