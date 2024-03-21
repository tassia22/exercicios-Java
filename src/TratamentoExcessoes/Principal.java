package TratamentoExcessoes;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);
        
            System.out.println("entre com os dados da conta: ");
            System.out.print("numero da conta: ");
            int numConta = scan.nextInt();
            System.out.print("nome: ");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.print("valor na conta: ");
            double valor = scan.nextDouble();
            System.out.print("limite de saque: ");
            double limiteSaque = scan.nextDouble();

            Conta acc = new Conta(numConta, nome, valor, limiteSaque);

            System.out.println();

            System.out.print("informe uma quantia para sacar: ");
            double quantia = scan.nextDouble();
            
            acc.retirada(quantia);
            System.out.printf("novo saldo: %.2f", acc.getValor());

        
        

        scan.close();
    
    }
    
}
