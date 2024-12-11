package Sobrecarga;

public class Pessoa {
    private String nome;
    private String sexo;
    private int mesDeNascimento;
    private int anoDeNascimento;

    public Pessoa(String nome){
        this.nome = nome;
        this.mesDeNascimento = 1;
        this.anoDeNascimento = 2000;
    }

    public Pessoa(String nome, String sexo, int mesDeNascimento, int anoDeNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.mesDeNascimento = mesDeNascimento;
        this.anoDeNascimento = anoDeNascimento;
    }

    public String mostraIdade(){
        return mostraIdade(11,2022);
    }
    public String mostraIdade(int mes, int ano){
        int anos = ano - this.anoDeNascimento;
        if(mes < this.mesDeNascimento){
            anos--;
        }

        return String.format("nome: %s, sexo: %s, idade: %d, anos", nome, sexo,anos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getMesDeNascimento() {
        return mesDeNascimento;
    }

    public void setMesDeNascimento(int mesDeNascimento) {
        this.mesDeNascimento = mesDeNascimento;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }
}
