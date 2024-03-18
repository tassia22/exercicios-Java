package Casting;

public class Pessoa {
    protected String nome;
    protected  int idade;
    protected char tipo;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void Pessoa(){
        this.nome = "indefinido";
        this.idade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
}
