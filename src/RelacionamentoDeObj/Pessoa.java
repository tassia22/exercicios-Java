package RelacionamentoDeObj;

import java.util.StringTokenizer;

public class Pessoa {
    private String nome;
    private int cpf;
    private String endereco;
    private int telefone;
    private double renda;

    public Pessoa(String nome, int cpf, String endereco, int telefone, double renda){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.renda = renda;
    }

    public String informacoes(){
        return "\nnome: "+nome+"\ncpf: "+cpf+"\nendereco: "+endereco+"\ntelefone: "+telefone+"\nrenda: "+renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
}
