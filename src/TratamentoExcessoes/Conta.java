package TratamentoExcessoes;
class Conta {

    private int numConta;
    private String nome;
    private  double valor;
    private double limiteRetirada;

    public Conta(){

    }

    public Conta(int numConta, String nome, double valor, double limiteRetirada){
        this.numConta = numConta;
        this.nome = nome;
        this.valor = valor;
        this.limiteRetirada = limiteRetirada;
    }

    public void deposito(double qntd){
        valor+=qntd;

    }
    
    public void retirada(double qntd){
            valor-=qntd;
       
    }

    //@Override
    //public String toString(){
       // return "nome: "+nome+", valor: "+valor+", limite de retirada: "+limiteRetirada;
    //}
    
    public int getNumConta(){
        return numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getLimiteRetirada(){
        return limiteRetirada;
    }
    public void setLimiteRetirada(double limiteRetirada){
        this.limiteRetirada = limiteRetirada;
    }

}