package RelacionamentoDeObj;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pessoa cliente = new Pessoa("carla", 123, "rua a",72822, 1000.0);

        ContaBancaria conta = new ContaBancaria(cliente, 111, 1000.0);

        System.out.println("Conta: "+conta.getNumeroDaConta()+"\tSaldo: "+conta.getSaldo());

        if(conta.depositar(1000)){
            System.out.println("Deposito realizado com sucesso.");
            System.out.println("Conta: "+conta.getNumeroDaConta()+"\tSaldo: "+conta.getSaldo());
        }else{
            System.out.println("Nao foi possivel realizar o deposito.");
        }

        if(conta.sacar(1300)){
            System.out.println("saque realizado com sucesso.");
            System.out.println("Conta: "+conta.getNumeroDaConta()+"\tSaldo: "+conta.getSaldo());
        }else{
            System.out.println("Saque nao realizado. Saldo insuficiente.");
            System.out.println("Conta: "+conta.getNumeroDaConta()+"\tSaldo: "+conta.getSaldo());
        }

        Pessoa clienteConta = conta.getCliente();

        System.out.println(clienteConta.informacoes());

        clienteConta.setNome("Ciclano");
        clienteConta.setRenda(5000.0);

        clienteConta = conta.getCliente();

        System.out.println(conta.getCliente().informacoes());
        scan.close();
    }
}
