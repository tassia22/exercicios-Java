package RelacionamentoDeObj;

public class ContaBancaria {
    private Pessoa cliente;
    private int numeroDaConta;
    private double saldo;

    public ContaBancaria(Pessoa cliente, int numeroDaConta, double saldo){
        this.cliente = cliente;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }
    public boolean sacar(float saque){
        if(saldo >= saque){
            saldo-=saque;
            return true;
        }
        return false;

    }
    public boolean depositar(float depositar){
            this.saldo+=depositar;
            return true;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
