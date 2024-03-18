package RelacionamentoDeObj;

public class Cliente {
    private String nome;
    private  String cpf;
    private double renda;
    private  double limiteCredito;

    public Cliente(String nome, String cpf, double renda, double limiteCredito){
        this.nome = nome;
        this.cpf = cpf;
        this.renda = renda;
        this.limiteCredito = limiteCredito;
        calculaLimite();
    }

    public void calculaLimite(){
        limiteCredito = renda * 2.5;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

}
