package RelacionamentoDeObj;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Cliente cliente = new Cliente("marcos", "092717", 1400.0, 2000.0);
        Produto produto = new Produto(123, "laranjas", 12.80, 3.90);

        Venda venda1 = new Venda(1, cliente,produto, 5);

        System.out.println(venda1.imprimir());
        scan.close();
    }
}
