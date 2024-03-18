package Encapsulamento;

public class Aluno {
    private String nome;
    private int matricula;
    private double media;
    private String situacao;

    public Aluno(String nome, int matricula, double media){
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
        verificaSituacao();
    }
    private void verificaSituacao(){
        if(media >= 6.0){
           this.situacao = "aprovado";
        }else{
            this.situacao = "reprovado";
        }

    }
    public String resultadoFinal(){
        return "\nnome: \n"+nome+"\nmatricula: \n"+matricula+"\nmedia: \n"+media+"\nsituacao: "+situacao;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

}
