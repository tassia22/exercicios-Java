package Arquivos;

public class Produtos {
    private String nome;
    private  double preco;
    private int qntd;

    public Produtos(String nome, double preco, int qntd) {
        this.nome = nome;
        this.preco = preco;
        this.qntd = qntd;
    }

    public double total(){
        return preco  * qntd;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }
}
