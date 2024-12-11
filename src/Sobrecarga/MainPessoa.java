package Sobrecarga;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa("maria");
        System.out.println(pessoa1.mostraIdade());

        Pessoa pessoa2 = new Pessoa("carlos", "masculino", 11, 2004);
        System.out.println(pessoa2.mostraIdade(12, 2024));

        scan.close();
    }
}
