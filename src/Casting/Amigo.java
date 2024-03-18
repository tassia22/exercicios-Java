package Casting;

public class Amigo extends Pessoa{
    private String aniversario;

    public Amigo(String nome, int idade, String aniversario){
        super(nome, idade);
        this.aniversario = aniversario;
    }
    public  void Amigo() {
        this.aniversario = "indefinido";

    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
}
