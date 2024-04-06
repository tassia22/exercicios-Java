package AbstratosEInterface;

import java.util.Locale;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner  scan = new Scanner(System.in);

        Carrinho carrinho = new Carrinho(10);
        Livro livro1 = new Livro(123, "era uma vez", 120.00, "nicholas", "terror");
        Revista revista1 = new Revista(12, "modas", 12.90, "06/04/2024", 2);

        //incluir produto no carrinho
        carrinho.incluir(livro1);

        //remover
        carrinho.remover(revista1);

        System.out.println("itens no carrinho: ");
        carrinho.listarItens();

        System.out.println("valor total: "+carrinho.mostrarValor());




        scan.close();
    }

}
